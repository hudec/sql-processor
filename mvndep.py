#! /usr/bin/env python3.5

import os, subprocess, argparse, re
# from lxml import html
import requests
import json
from dateutil.parser import parse

FIX_PROPERTIES_UNUSED_VERSIONS = 'unused'

FIX_LIBS_LATEST_COMMON_VERSIONS = 'llibs'
FIX_LIBS_SET_VERSIONS = 'libs'
FIX_LIBS_FROM_REPO = 'rlibs'

FIX_PARENTS_SET_VERSIONS = 'parents'
FIX_PARENTS_FROM_REPO = 'rparents'

FIX_PLUGINS_SET_VERSION = 'plugins'
FIX_PLUGINS_FROM_REPO = 'rplugins'

ACTIONS = [FIX_PROPERTIES_UNUSED_VERSIONS,
           FIX_LIBS_LATEST_COMMON_VERSIONS,
           FIX_LIBS_SET_VERSIONS,
           FIX_LIBS_FROM_REPO,
           FIX_PARENTS_SET_VERSIONS,
           FIX_PARENTS_FROM_REPO,
           FIX_PLUGINS_SET_VERSION,
           FIX_PLUGINS_FROM_REPO]

CONFIG_FILENAME = '.mvndep.json'

POM_NAME = 'pom.xml'

SUBST_VER_RE = re.compile(r'{(?P<version>.+)}')
VER_RE = re.compile(r'<version>(?P<version>.+)</version>')
PROPS_START_RE = re.compile(r'<properties>')
PROPS_END_RE = re.compile(r'</properties>')
PROPS_VERSION_RE = re.compile(r'<version(?P<name>.+)>.+</version.+>')
PARENT_START_RE = re.compile(r'<parent>')
PARENT_END_RE = re.compile(r'</parent>')
GROUP_ID_RE = re.compile(r'<groupId>(?P<group>.+)</groupId>')
ARTIFACT_ID_RE = re.compile(r'<artifactId>(?P<artifact>.+)</artifactId>')
VERSION_RE = re.compile(r'<version>(?P<version>.+)</version>')
VERSION_DATE_TIME_RE = re.compile(r'<a href="(?P<version>.+)/">(?P<version2>.+)/</a>.+(?P<date_time>\d\d\d\d-\d\d-\d\d \d\d:\d\d).+')
VERSION_DATE_TIME_AF_RE = re.compile(r'<a href="(?P<version>.+)/">(?P<version2>.+)/</a>.+(?P<date_time>\d?\d-\S\S\S-\d\d\d\d \d\d:\d\d).+')
FOR_PROJECT_RE = re.compile(r'\[INFO].+@ (?P<project>[\S]+)')
MODULES_START_RE = re.compile(r'<modules>')

REPOS=['http://repo2.maven.org/maven2/',
       'http://central.maven.org/maven2/',
       'https://oss.sonatype.org/content/groups/public/'
       ]

REPO2=['http://repo2.maven.org/maven2/org/apache/maven/plugins/',
       'http://repo2.maven.org/maven2/org/codehaus/mojo/',
       'http://repo2.maven.org/maven2/org/codehaus/gmaven/',
       'http://central.maven.org/maven2/org/jvnet/jaxb2/maven2/',
       'http://central.maven.org/maven2/com/spotify/',
       'http://central.maven.org/maven2/org/apache/cxf/',
       'http://central.maven.org/maven2/org/springframework/boot/',
       'http://central.maven.org/maven2/org/apache/tomcat/maven/'
       ]

class Version:
    def __init__(self, str_version):
        self.vers = []
        self.rest = []
        self.version = str_version
        _vers = str_version.split('.')
        for _ver in _vers:
            if len(self.rest) > 0:
                self.rest.append(_ver)
                continue
            if _ver.isdigit():
                self.vers.append(int(_ver))
                continue
            start = ''
            end = ''
            for c in _ver:
                if len(end) == 0 and c.isdigit():
                    start = start + c
                else:
                    end = end + c
            if len(start) > 0:
                self.vers.append(int(start))
            if len(end) > 0:
                self.rest.append(end)

    def compare(self, version):
        'test, if this version is newer than version in parameter'
        #print(self.vers, self.rest, version.vers, version.rest)
        if self.version == version.version:
            return False
        mlen = min(len(self.vers), len(version.vers))
        for i in range(0, mlen):
            if self.vers[i] > version.vers[i]:
                return True
            if self.vers[i] < version.vers[i]:
                return False
        if len(self.vers) > len(version.vers):
            return True
        if len(self.vers) < len(version.vers):
            return False
        mlen = min(len(self.rest), len(version.rest))
        for i in range(0, mlen):
            if self.rest[i] > version.rest[i]:
                return True
            if self.rest[i] < version.rest[i]:
                return False
        if len(self.rest) > len(version.rest):
            return True
        if len(self.rest) < len(version.rest):
            return False
        return False

    def __hash__(self):
        return hash(self.version)

    def __eq__(self, other):
        return self.version == other.version

    def __str__(self):
        return self.version

    def __repr__(self):
        return str(self)

class Library:
    def __init__(self, str_library):
        items = str_library.split(':')
        if len(items) < 1:
            raise ValueError('%s should be groupId:artifactId:version, the required is at least groupId or artifactId' % (str))
        self.groupId = items[0]
        self.artifactId = None if len(items) <= 1 else items[1]
        self.version = None if len(items) <= 2 else items[2]
        self.library = str_library

    def __hash__(self):
        return hash(self.library)

    def __eq__(self, other):
        return self.library == other.library

    def __str__(self):
        return self.library

    def __repr__(self):
        return str(self)


class Libraries:
    def __init__(self, libs):
        self.map_group_artifact_version = {}
        self.map_artifact_version = {}
        self.map_group_artifact = {}
        self.set_group = set([])
        for lib in libs:
            self.__add_lib(lib)

    def __add_lib(self, str_library):
        lib = Library(str_library)
        if lib.groupId and lib.artifactId and lib.version:
            self.map_group_artifact_version[lib.groupId + '.' + lib.artifactId] = lib.version
        elif lib.artifactId and lib.version:
            self.map_artifact_version[lib.artifactId] = lib.version
        elif lib.groupId and lib.artifactId:
            self.map_group_artifact[lib.groupId] = lib.artifactId
        else:
            self.set_group.add(lib.groupId)

    def contains_and_version(self, str_library):
        if str_library in self.map_group_artifact_version:
            return True, self.map_group_artifact_version[str_library]
        if str_library in self.map_artifact_version:
            return True, self.map_artifact_version[str_library]
        items = str_library.split('.')
        artifactId = items[-1]
        items = items[0:-1]
        groupId = '.'.join(items)
        if groupId in self.set_group:
            return True, None
        if groupId in self.map_group_artifact:
            return True, None
        if groupId + '.' + artifactId in self.map_group_artifact_version:
            return True, self.map_group_artifact_version[groupId + '.' + artifactId]
        return False, None

    @staticmethod
    def skip(libs, str_library):
        if not libs:
            return False
        result = libs.contains_and_version(str_library)
        if result[0]:
            return True
        return False

    @staticmethod
    def process(libs, str_library):
        if not libs:
            return True
        result = libs.contains_and_version(str_library)
        if result[0]:
            return True
        return False

    @staticmethod
    def version(libs, str_library):
        if not libs:
            return None
        result = libs.contains_and_version(str_library)
        if result[0]:
            return result[1]
        return None

    def __str__(self):
        return 'g-a-v: ' + str(self.map_group_artifact_version) + '\na-v: ' + str(self.map_artifact_version) + '\ng-a: ' + str(self.map_group_artifact) + '\ng: ' + str(self.set_group)

    def __repr__(self):
        return str(self)

def read_pom(path, name = None):
    if name:
        fname = os.path.join(path, name, POM_NAME)
    else:
        fname = os.path.join(path, POM_NAME)
    print("<- %s" % fname)
    with open(fname, 'r') as file:
        return file.readlines()

def read_poms(cfg, path, depth = 1, pom = None):
    map_project_pom = {}
    map_project_path = {}
    print('in ', path)
    if pom:
        lines = read_pom(path)
        group_id, artifact_id = find_main_in_pom(lines)
        map_project_pom[artifact_id] = lines
        map_project_path[artifact_id] = os.path.join(path)
    for entry in os.scandir(path):
        if not entry.name.startswith('.') and entry.is_dir():
            if POM_NAME in os.listdir(entry.path):
                if cfg.projects and not entry.name in cfg.projects:
                    continue
                if cfg.skip_projects and entry.name in cfg.skip_projects:
                    continue
                lines = read_pom(path, entry.name)
                group_id, artifact_id = find_main_in_pom(lines)
                map_project_pom[artifact_id] = lines
                map_project_path[artifact_id] = os.path.join(path, entry.name)
    if depth > 1:
        for project in list(map_project_pom.keys()):
            _map_project_pom, _map_project_path = read_poms(cfg, map_project_path[project], depth - 1)
            map_project_pom.update(_map_project_pom)
            map_project_path.update(_map_project_path)
    return map_project_pom, map_project_path

def write_pom(path, pom, skip_lines = None):
    fname = os.path.join(path, POM_NAME)
    print("-> %s" % fname)
    with open(fname, 'w') as file:
        for linenum, line in enumerate(pom):
            if skip_lines and linenum in skip_lines:
                continue
            file.write(line)

def write_poms(map_project_pom, map_project_path, skip_lines = None):
    for project in map_project_pom:
        if skip_lines:
            write_pom(map_project_path[project], map_project_pom[project], skip_lines[project])
        else:
            write_pom(map_project_path[project], map_project_pom[project])
    return map_project_pom

def maven_dep_line(cfg, line, map_lib_versions_main, map_lib_versions):
    if line.startswith('[INFO] |') or line.startswith('[INFO] +') or line.startswith('[INFO] \\'):
        line_ok = line[7:]
        if line_ok.startswith('+-') or line_ok.startswith('\-'):
            if cfg.verbosity >= 2:
                print("== %s" % line_ok[3:])
            cols = line_ok[3:].split(":")
            scope = cols[4 if len(cols) == 5 else 5]
            if cfg.skip_scopes and scope in cfg.skip_scopes:
                return
            if cfg.scopes and scope not in cfg.scopes:
                return
            lib = cols[0]+'.'+cols[1]
            version = cols[3 if len(cols) == 5 else 4]
            map_lib_versions_main[lib] = [Version(version)]
        else:
            line_ok = line_ok[line_ok.find('-'):]
            if cfg.verbosity >= 2:
                print("-- %s" % line_ok[2:])
            cols = line_ok[2:].split(":")
            scope = cols[4 if len(cols) == 5 else 5]
            if cfg.skip_scopes and scope in cfg.skip_scopes:
                return
            if cfg.scopes and scope not in cfg.scopes:
                return
            lib = cols[0]+'.'+cols[1]
            version = cols[3 if len(cols) == 5 else 4]
            if lib in map_lib_versions:
                map_lib_versions[lib] = map_lib_versions[lib] + [Version(version)]
            else:
                map_lib_versions[lib] = [Version(version)]

def maven_dep_pom(cfg, path, pom = None):
    map2_project_lib_versions_main = {}
    map2_project_lib_versions = {}
    map_lib_versions_main = {}
    map_lib_versions = {}
    project = None
    if pom:
        pipe = subprocess.Popen(['mvn', '-f', pom, 'dependency:tree'], cwd = path, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    else:
        pipe = subprocess.Popen(['mvn','dependency:tree'], cwd = path, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    text = pipe.communicate()[0].decode("utf-8")
#     print(text)
    for line in text.split("\n"):
        if line.find('[ERROR]') >= 0:
            print(line)
            continue
        result = FOR_PROJECT_RE.search(line)
        if result:
            print(line)
            if project:
                map2_project_lib_versions_main[project] = map_lib_versions_main
                map2_project_lib_versions[project] = map_lib_versions
            map_lib_versions_main = {}
            map_lib_versions = {}
            project = result.group('project')
            if cfg.projects and not project in cfg.projects:
                project = None
            if cfg.skip_projects and project in cfg.skip_projects:
                project = None
            print("project %s" % (project))
        else:
            maven_dep_line(cfg, line, map_lib_versions_main, map_lib_versions)
    if project:
        map2_project_lib_versions_main[project] = map_lib_versions_main
        map2_project_lib_versions[project] = map_lib_versions
    return (map2_project_lib_versions_main, map2_project_lib_versions)

def maven_dep_tree(cfg, path):
    map2_project_lib_versions_main = {}
    map2_project_lib_versions = {}
    for entry in os.scandir(path):
        if not entry.name.startswith('.') and entry.is_dir():
            if POM_NAME in os.listdir(entry.path):
                if cfg.projects and not entry.name in cfg.projects:
                    continue
                if cfg.skip_projects and entry.name in cfg.skip_projects:
                    continue
                print("dir %s" % (entry.path))
                _map2_project_lib_versions_main, _map2_project_lib_versions = maven_dep_pom(cfg, entry.path, None)
                if cfg.verbosity >= 2:
                    print(_map2_project_lib_versions_main)
                    print(_map2_project_lib_versions)
                map2_project_lib_versions_main.update(_map2_project_lib_versions_main)
                map2_project_lib_versions.update(_map2_project_lib_versions)
    return (map2_project_lib_versions_main, map2_project_lib_versions)

def maven_dependencies(cfg):
    if cfg.pom:
        return maven_dep_pom(cfg, cfg.dir, cfg.pom)
    else:
        return maven_dep_tree(cfg, cfg.dir)

def maven_plug_line(cfg, line, map_lib_versions_main):
    if line.startswith('[INFO] Plugin Resolved'):
        line_ok = line[24:]
        if cfg.verbosity >= 2:
            print("== %s" % line_ok)
        cols = line_ok.split("-")
        version = cols[-1][:-4]
        del cols[-1]
#         lib = 'org.apache.maven.plugins.' + '-'.join(cols)
        lib = '-'.join(cols)
        map_lib_versions_main[lib] = [Version(version)]

def maven_plug_pom(cfg, path, pom = None):
    map2_project_lib_versions_main = {}
    map_lib_versions_main = {}
    project = None
    if pom:
        if cfg.exclude_artifacts:
            pipe = subprocess.Popen(['mvn', '-f', pom, 'dependency:resolve-plugins', '-DexcludeArtifactIds='+','.join(cfg.exclude_artifacts)], cwd = path, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        else:
            pipe = subprocess.Popen(['mvn', '-f', pom, 'dependency:resolve-plugins'], cwd = path, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    else:
        if cfg.exclude_artifacts:
            pipe = subprocess.Popen(['mvn','dependency:resolve-plugins', '-DexcludeArtifactIds='+','.join(cfg.exclude_artifacts)], cwd = path, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        else:
            pipe = subprocess.Popen(['mvn','dependency:resolve-plugins'], cwd = path, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    text = pipe.communicate()[0].decode("utf-8")
#     print(text)
    for line in text.split("\n"):
        if line.find('[ERROR]') >= 0:
            print(line)
            continue
        result = FOR_PROJECT_RE.search(line)
        if result:
            if project:
                map2_project_lib_versions_main[project] = map_lib_versions_main
            map_lib_versions_main = {}
            project = result.group('project')
            if cfg.projects and not project in cfg.projects:
                project = None
            if cfg.skip_projects and project in cfg.skip_projects:
                project = None
            print("project %s" % (project))
        else:
            maven_plug_line(cfg, line, map_lib_versions_main)
    if project:
        map2_project_lib_versions_main[project] = map_lib_versions_main
    return map2_project_lib_versions_main

def maven_plug_tree(cfg, path):
    map2_project_lib_versions_main = {}
    for entry in os.scandir(path):
        if not entry.name.startswith('.') and entry.is_dir():
            if POM_NAME in os.listdir(entry.path):
                if cfg.projects and not entry.name in cfg.projects:
                    continue
                if cfg.skip_projects and entry.name in cfg.skip_projects:
                    continue
                print("dir %s" % (entry.path))
                _map2_project_lib_versions_main = maven_plug_pom(cfg, entry.path, None)
                if cfg.verbosity >= 2:
                    print(_map2_project_lib_versions_main)
                map2_project_lib_versions_main.update(_map2_project_lib_versions_main)
    return map2_project_lib_versions_main

def maven_plugins(cfg):
    if cfg.pom:
        return maven_plug_pom(cfg, cfg.dir, cfg.pom)
    else:
        return maven_plug_tree(cfg, cfg.dir)

def merge_libs(cfg, map2_project_lib_versions, map2_lib_version_projects = None):
    if not map2_lib_version_projects:
        map2_lib_version_projects_new = {}
    else:
        map2_lib_version_projects_new = map2_lib_version_projects.copy()
    for project in map2_project_lib_versions.keys():
        for lib, vers in map2_project_lib_versions[project].items():
            for ver in vers:
                if cfg.verbosity >= 2:
                    print("%s - %s - %s" % (project, lib, ver))
                if lib in map2_lib_version_projects_new:
                    ver_projects = map2_lib_version_projects_new[lib]
                    if ver in ver_projects:
                        ver_projects[ver] = ver_projects[ver] + [project]
                    else:
                        ver_projects[ver] = [project]
                else:
                    map2_lib_version_projects_new[lib] = {ver : [project]}
    return map2_lib_version_projects_new

def dump_libs_usage(text, map2_lib_version_projects_main, _all = True):
    print("-> %s " % text)
    libs = list(map2_lib_version_projects_main.keys())
    libs.sort()
    for lib in libs:
        map_version_projects = map2_lib_version_projects_main[lib]
        if _all:
            if len(map_version_projects) > 1:
                print("%s = %s  ****" % (lib, map_version_projects))
            else:
                print("%s = %s" % (lib, map_version_projects))
        else:
            if (len(map_version_projects) > 1):
                print("%s = %s" % (lib, map_version_projects))

def find_value_in_pom(pom, value):
    str_re = re.compile('<'+ value +'>(?P<value>.+)</' + value + '>')
    for linenum, line in enumerate(pom):
        result = str_re.search(line)
        if result:
            return linenum, result.group('value')
    return None, None

def find_artifact_in_pom(pom, artifact, from_linenum = None):
    artifact_re = re.compile('<artifactId>' + artifact + '</artifactId>')
    found_line, prev_line, next_line = None, None, None
    found_linenum = None
    for linenum, line in enumerate(pom):
        if from_linenum:
            if linenum <= from_linenum + 1:
                continue
        if found_line:
            next_line = line
            break
        if artifact_re.search(line):
            found_line = line
            found_linenum = linenum
        else:
            prev_line = line
    return found_linenum, found_line, prev_line, next_line

def find_version_in_pom(pom, found_linenum, found_line, prev_line, next_line):
    result = SUBST_VER_RE.search(next_line)
    if result:
        version = result.group('version')
        return find_value_in_pom(pom, version)
    result = SUBST_VER_RE.search(prev_line)
    if result:
        version = result.group('version')
        return find_value_in_pom(pom, version)
    result = VER_RE.search(next_line)
    if result:
        return found_linenum + 1, result.group('version')
    result = VER_RE.search(prev_line)
    if result:
        return found_linenum - 1, result.group('version')
    return None, None

def find_versions_in_pom(pom):
    found_props = False
    map_verprop_linenum = {}
    for linenum, line in enumerate(pom):
        if found_props:
            if PROPS_END_RE.search(line):
                break
            result = PROPS_VERSION_RE.search(line)
            if result:
                map_verprop_linenum['version' + result.group('name')] = linenum
        if PROPS_START_RE.search(line):
            found_props = True
    return map_verprop_linenum

def unused_versions_in_pom(pom, map_verprop_linenum):
    unused_pom_versions = dict(map_verprop_linenum)
    pom_versions_unused = map_verprop_linenum
    for verprop in pom_versions_unused.keys():
        verprop_re = re.compile('{' + verprop + '}')
        for line in pom:
            if verprop_re.search(line):
                unused_pom_versions.pop(verprop)
                break
    return unused_pom_versions

def find_main_in_pom(pom):
    group_id, artifact_id = None, None
    for line in pom:
        if group_id and artifact_id:
            break
        if MODULES_START_RE.search(line):
            break
        if PROPS_START_RE.search(line):
            break
        result = GROUP_ID_RE.search(line)
        if result:
            group_id = result.group('group')
            continue
        result = ARTIFACT_ID_RE.search(line)
        if result:
            artifact_id = result.group('artifact')
            continue
    return group_id, artifact_id

def find_parent_in_pom(pom):
    found_parent = False
    group_id, artifact_id, version, version_line = None, None, None, None
    for index, line in enumerate(pom):
        if found_parent:
            if PARENT_END_RE.search(line):
                break
            result = GROUP_ID_RE.search(line)
            if result:
                group_id = result.group('group')
                continue
            result = ARTIFACT_ID_RE.search(line)
            if result:
                artifact_id = result.group('artifact')
                continue
            result = VERSION_RE.search(line)
            if result:
                version = result.group('version')
                version_line = index
                continue
        if PARENT_START_RE.search(line):
            found_parent = True
    return group_id, artifact_id, version, version_line

def find_versions_maven_central(cfg, lib):
    list_ver_datetime = []
    if lib.startswith('cz.'):
        return list_ver_datetime
#     print('1111', lib)
    for repo in cfg.remote_urls:
        url = repo + lib.replace('.', '/') + '/'
#         print('2222', url)
        try:
            req = requests.get(url)
        except Exception as ex:
            print('For', url, 'there is error:', ex)
            return list_ver_datetime
#         print('2222b', req.status_code)
        if req.status_code == 200:
            break
    if req.status_code != 200:
        for repo in cfg.remote_urls:
            url = repo + lib.replace('.', '/') + '/'
            ix = url[:-1].rfind('/')
            if ix < 0:
                continue
            url = url[:ix] + '.' + url[ix+1:]
#             print('3333', url)
            req = requests.get(url)
#             print('3333b', req.status_code)
            if req.status_code == 200:
                break
    if req.status_code != 200:
        print("Not found ", lib)
        return list_ver_datetime
#     print(req.content)
    lines = str(req.content).split('\\n')
#     tree = html.fromstring(req.content)
#     hrefs = tree.xpath('/html/body//a/@href')
    for line in lines:
        result = VERSION_DATE_TIME_RE.search(line)
        if result:
            version = result.group('version2')
            date_time = result.group('date_time')
            if version.startswith('.') or version.startswith('maven'):
                continue
            if version.endswith('/'):
                version = version[0:-1]
            list_ver_datetime.append((version, date_time))
        else:
            result = VERSION_DATE_TIME_AF_RE.search(line)
            if result:
                version = result.group('version2')
                date_time = result.group('date_time')
                if version.startswith('.') or version.startswith('maven'):
                    continue
                if version.endswith('/'):
                    version = version[0:-1]
                dt = parse(date_time)
                list_ver_datetime.append((version, str(dt)))
    return list_ver_datetime

central_maven_incorrect_datetimes = set(['commons-lang.commons-lang'])
def compare_based_on_version(lib):
    return True

def is_valid_lib(lib):
    if lib.startswith('200'):
        return False
    if lib.lower().find('alpha') >= 0 or lib.lower().find('beta') >= 0 or lib.lower().find('incubat') >= 0 or lib.lower().find('mistake') >= 0 or lib.find('-M') >= 0:
        return False
    return True

def find_latest_maven_central(cfg, lib):
    list_ver_datetime = find_versions_maven_central(cfg, lib)
    if not list_ver_datetime:
        return None
    if compare_based_on_version(lib):
        latest_version, latest_datetime = None, None
        for ver_datetime in list_ver_datetime:
            if not latest_version:
                if is_valid_lib(ver_datetime[0]):
                    latest_version = Version(ver_datetime[0])
                    latest_datetime = ver_datetime[1]
            elif is_valid_lib(ver_datetime[0]):
                version = Version(ver_datetime[0])
                if version.compare(latest_version):
                    latest_version = version
                    latest_datetime = ver_datetime[1]
        if latest_version:
            print('find_latest_maven_central lib=%s, ver=%s from %s' % (lib, latest_version, latest_datetime))
            return latest_version.version
        else:
            print('not find_latest_maven_central lib=%s' % (lib))
            return None
    else:
        latest_version, latest_datetime = None, None
        for ver_datetime in list_ver_datetime:
            if not latest_datetime or ver_datetime[1] > latest_datetime:
                latest_version = ver_datetime[0]
                latest_datetime = ver_datetime[1]
        print('find_latest_maven_central lib=%s, ver=%s from %s' % (lib, latest_version, latest_datetime))
        return latest_version

def find_pom_for_artifact_version(lib, project, map_project_pom, map_project_parents):
    pom = map_project_pom[project]
    _lib = lib.split('.')[-1]
    found_linenum, found_line, prev_line, next_line = find_artifact_in_pom(pom, _lib)
    if found_line:
#         print('found_line ', found_line, end = '')
#         print('prev_line ', prev_line, end = '')
#         print('next_line ', next_line, end = '')
        version_linenum, version = find_version_in_pom(pom, found_linenum, found_line, prev_line, next_line)
        if not version:
            found_linenum, found_line, prev_line, next_line = find_artifact_in_pom(pom, _lib, found_linenum)
            if found_line:
                version_linenum, version = find_version_in_pom(pom, found_linenum, found_line, prev_line, next_line)
        if version:
            return project, pom, version_linenum, version
    if not project in map_project_parents:
        return None, None, None, None
    for parent in map_project_parents[project]:
        pom = map_project_pom[parent]
        found_linenum, found_line, prev_line, next_line = find_artifact_in_pom(pom, _lib)
        if found_line:
#             print('found_line2 ', found_line, end = '')
#             print('prev_line2 ', prev_line, end = '')
#             print('next_line2 ', next_line, end = '')
            version_linenum, version = find_version_in_pom(pom, found_linenum, found_line, prev_line, next_line)
            if not version:
                found_linenum, found_line, prev_line, next_line = find_artifact_in_pom(pom, _lib, found_linenum)
                if found_line:
                    version_linenum, version = find_version_in_pom(pom, found_linenum, found_line, prev_line, next_line)
            if version:
                return parent, pom, version_linenum, version
    return None, None, None, None

def fix_latest_versions_in_poms(cfg, map_project_pom, map_project_parents, map2_lib_version_projects):
    map_project_pom_fixed = {}
    libs = list(map2_lib_version_projects.keys())
    libs.sort()
    for lib in libs:
        if len(map2_lib_version_projects[lib]) <= 1:
            continue
        if Libraries.skip(cfg.skip_libs, lib):
            continue
        if not Libraries.process(cfg.libs, lib):
            continue
        #print("%s = %s" % (lib, map2_lib_version_projects[lib]))
        latest_version = None
        for version, projects in map2_lib_version_projects[lib].items():
            if not latest_version or version.compare(latest_version):
                latest_version = version
        for version, projects in map2_lib_version_projects[lib].items():
            if latest_version == version:
                continue
            print("FIX for %s version %s -> %s in %s" % (lib, version, latest_version, projects))
            for project in projects:
                if not project in map_project_pom:
                    print('??? Missing ' + project +' in ', map_project_pom.keys())
                    continue
                project_version, pom_version, version_linenum, version = find_pom_for_artifact_version(lib, project, map_project_pom, map_project_parents)
                if not version:
                    print("Not found artifactId (or version) %s in %s nor in it's parents" % (lib.split('.')[-1], project))
                    continue
                #print("Found version for artifactId %s in %s" % (lib.split('.')[-1], project_version))
                if version == latest_version.version:
                    print("FIXED line %d: %s -> %s in %s" % (version_linenum, version, latest_version, project_version))
                else:
                    print("TOFIX line %d: %s -> %s in %s" % (version_linenum, version, latest_version.version, project_version))
                    print(pom_version[version_linenum], end="")
                    if cfg.fix >= 2:
                        pom_version[version_linenum] = pom_version[version_linenum].replace(version, latest_version.version)
                        map_project_pom_fixed[project_version] = pom_version
                        print(pom_version[version_linenum], end="")
    return map_project_pom_fixed

def update_libraries_in_poms(cfg, map_project_pom, map_project_parents, map2_lib_version_projects, central_libs):
    map_project_pom_fixed = {}
    libs = list(map2_lib_version_projects.keys())
    libs.sort()
    for lib in libs:
        if Libraries.skip(cfg.skip_libs, lib):
            continue
        if central_libs:
            if not Libraries.process(cfg.libs, lib):
                continue
            if not lib in central_libs:
                continue
            new_version = central_libs[lib]
        else:
            new_version = Libraries.version(cfg.libs, lib)
            if not new_version:
                continue
#         print("%s = %s" % (lib, map2_lib_version_projects[lib]))
        for version, projects in map2_lib_version_projects[lib].items():
            if new_version == version.version:
                continue
            print("FIX for %s version %s -> %s in %s" % (lib, version, new_version, projects))
            for project in projects:
                if not project in map_project_pom:
                    print('??? Missing ' + project +' in ', map_project_pom.keys())
                    continue
                project_version, pom_version, version_linenum, version = find_pom_for_artifact_version(lib, project, map_project_pom, map_project_parents)
                if not version:
                    print("Not found artifactId (or version) %s in %s nor in it's parents" % (lib.split('.')[-1], project))
                    continue
                #print("Found version for artifactId %s in %s" % (lib.split('.')[-1], project_version))
                if version == new_version:
                    print("FIXED line %d: %s -> %s in %s" % (version_linenum, version, new_version, project_version))
                else:
                    print("TOFIX line %d: %s -> %s in %s" % (version_linenum, version, new_version, project_version))
                    print(pom_version[version_linenum], end="")
                    if cfg.fix >= 2:
                        pom_version[version_linenum] = pom_version[version_linenum].replace(version, new_version)
                        map_project_pom_fixed[project_version] = pom_version
                        print(pom_version[version_linenum], end="")
    return map_project_pom_fixed

def update_parent_in_poms(cfg, map_project_pom):
    map_project_pom_fixed = {}
    for project, pom in map_project_pom.items():
        group_id, artifact_id, version, version_line = find_parent_in_pom(pom)
        if group_id and artifact_id and version and version_line:
            lib = group_id + "." + artifact_id
            new_version = Libraries.version(cfg.libs, lib)
            if new_version:
                print("TOFIX line %d: %s -> %s in %s" % (version_line, version, new_version, project))
                print(pom[version_line], end="")
                if cfg.fix >= 2:
                    pom[version_line] = pom[version_line].replace(version, new_version)
                    map_project_pom_fixed[project] = pom
                    print(pom[version_line], end="")
    return map_project_pom_fixed

def build_pom_hierarchy(map_project_path):
    map_project_parents = {}
    main_project = None
    for project, path in map_project_path.items():
        if path == '.':
            main_project = project
    for project, path in map_project_path.items():
#         print(project, ': ', path)
        path_list = path.split(os.sep)
        path_list.reverse()
#         print(path_list)
        parents = []
        project_first = True
        for _project in path_list:
            if project_first:
                project_first = False
                if _project != '.':
                    continue
            if _project == '.':
                if main_project:
                    parents.append(main_project)
            else:
                parents.append(_project)
        if parents:
            map_project_parents[project] = parents
#     print(map_project_parents)
    return map_project_parents

class Config:
    def __init__(self):
        self.default_skip_projects = []
        self.default_skip_libs = []
        self.default_skip_scopes = []
        self.default_pom = None
        self.default_depth = 1
        self.default_exclude_artifacts = []
        self.default_remote_urls = []
        
        if os.path.isfile(CONFIG_FILENAME):
            with open(CONFIG_FILENAME, encoding='utf-8') as config_file:
                default_config = json.loads(config_file.read())
                if 'skip_projects' in default_config:
                    self.default_skip_projects = default_config['skip_projects']
                    print("default skip projects", self.default_skip_projects)
                if 'skip_libs' in default_config:
                    self.default_skip_libs = default_config['skip_libs']
                    print("default skip libs", self.default_skip_libs)
                if 'skip_scopes' in default_config:
                    self.default_skip_scopes = default_config['skip_scopes']
                    print("default skip scopes", self.default_skip_scopes)
                if 'pom' in default_config:
                    self.default_pom = default_config['pom']
                    print("default pom", self.default_pom)
                if 'depth' in default_config:
                    self.default_depth = default_config['depth']
                    print("default depth", self.default_depth)
                if 'exclude_artifacts' in default_config:
                    self.default_exclude_artifacts = default_config['exclude_artifacts']
                    print("default exclude artifacts", self.default_exclude_artifacts)
                if 'remote_urls' in default_config:
                    self.default_remote_urls = default_config['remote_urls']
                    print("default remote urls", self.default_remote_urls)

        parser = argparse.ArgumentParser(description='Analyze Maven projects.')
        parser.add_argument('-d', '--dir', metavar = 'dir', default = '.',
                            help='directory to scan for the Maven projects (default: the working directory)')
        parser.add_argument('-p', '--projects', metavar = 'project', nargs = '+',
                            help='the Maven projects to analyze (default: all projects in selected directory)')
        parser.add_argument('-P', '--skip_projects', metavar = 'project', nargs = '+', default = self.default_skip_projects,
                            help='the Maven projects to skip')
        parser.add_argument('-v', '--verbosity', action='count', default=0,
                            help='the verbosity of debug output')
        parser.add_argument('-f', '--fix', action='count', default=0,
                            help='fix the Maven projects\' to the latest libraries\' version')
        parser.add_argument('-t', '--type', default=FIX_LIBS_LATEST_COMMON_VERSIONS, choices=ACTIONS,
                            help='fix the Maven projects\' to the latest libraries\' version')
        parser.add_argument('-s', '--scopes', metavar = 'scope', nargs = '+',
                            help='the Maven scopes to work with')
        parser.add_argument('-S', '--skip_scopes', metavar = 'scope', nargs = '+', default = self.default_skip_scopes,
                            help='the Maven scopes to skip')
        parser.add_argument('-l', '--libs', dest = '_libs', metavar = 'library', nargs = '+',
                            help='the list of libraries to process (in the form groupId:artifactId:version)')
        parser.add_argument('-L', '--skip_libs', dest = '_skip_libs', metavar = 'library', nargs = '+', default = self.default_skip_libs,
                            help='the list of libraries to skip (in the form groupId:artifactId:version)')
        parser.add_argument('--pom', metavar = 'pom', default = self.default_pom,
                            help='the parent (main) pom.xml used instead of directory scanning')
        parser.add_argument('--depth', type=int, default = self.default_depth,
                            help='the depth of directories to scan for pom.xml')
        parser.add_argument('-X', '--exclude_artifacts', dest = 'exclude_artifacts', metavar = 'artifact', nargs = '+', default = self.default_exclude_artifacts,
                            help='the list of artifacts to exclude (right now only plugins)')
        parser.add_argument('-r', '--remote', dest = '_remote_urls', metavar = 'url', nargs = '+', default = self.default_remote_urls,
                            help='consult the remote (central) maven repositories')
        parser.parse_args(namespace = self)

        self.libs = None if not self._libs else Libraries(self._libs)
        self.skip_libs = None if not self._skip_libs else Libraries(self._skip_libs)

        print("selected directory %s" % self.dir)
        print("selected projects %s" % self.projects)
        print("skip projects %s" % self.skip_projects)
        print("selected scopes %s" % self.scopes)
        print("skip scopes %s" % self.skip_scopes)
        print("libraries %s" % self.libs)
        print("skip libraries %s" % self.skip_libs)
        print("verbosity %d" % self.verbosity)
        print("fix %d" % self.fix)
        print("type %s" % self.type)
        print("pom %s" % self.pom)
        print("depth %d" % self.depth)
        print("exclude_artifacts %s" % self.exclude_artifacts)
        print("remote urls %s" % self._remote_urls)
        if self.type == FIX_PLUGINS_FROM_REPO:
            self.remote_urls = REPO2 + self._remote_urls
        else:
            self.remote_urls = REPOS + self._remote_urls

def main():
    cfg = Config()

    if cfg.type == FIX_LIBS_LATEST_COMMON_VERSIONS:
        map2_project_lib_versions_main, map2_project_lib_versions = maven_dependencies(cfg)
        if cfg.verbosity >= 1:
            print(map2_project_lib_versions_main)
            print(map2_project_lib_versions)
        map2_lib_version_projects_main = merge_libs(cfg, map2_project_lib_versions_main)
        if cfg.fix == 0:
            print("-------------------------------------------------------")
            dump_libs_usage("Main dependencies", map2_lib_version_projects_main)
        map2_lib_version_projects = merge_libs(cfg, map2_project_lib_versions, map2_lib_version_projects_main)
        if cfg.fix == 0:
            print("-------------------------------------------------------")
            dump_libs_usage("Conflict dependencies", map2_lib_version_projects, False)
            print("-------------------------------------------------------")

        if cfg.fix >= 1:
            map_project_pom, map_project_path = read_poms(cfg, cfg.dir, cfg.depth, cfg.pom)
            if cfg.verbosity >= 3:
                print(map_project_pom)
                print(map_project_path)
            map_project_parents = build_pom_hierarchy(map_project_path)
            map_project_pom_fixed = fix_latest_versions_in_poms(cfg, map_project_pom, map_project_parents, map2_lib_version_projects)
            if cfg.fix >= 2:
                write_poms(map_project_pom_fixed, map_project_path)

    elif cfg.type == FIX_LIBS_SET_VERSIONS and cfg.libs:
        map2_project_lib_versions_main, map2_project_lib_versions = maven_dependencies(cfg)
        if cfg.verbosity >= 1:
            print(map2_project_lib_versions_main)
        map2_lib_version_projects_main = merge_libs(cfg, map2_project_lib_versions_main)
        if cfg.verbosity >= 3:
            print(map2_lib_version_projects_main)

        map_project_pom, map_project_path = read_poms(cfg, cfg.dir, cfg.depth, cfg.pom)
        if cfg.verbosity >= 3:
            print(map_project_pom)
            print(map_project_path)
        map_project_parents = build_pom_hierarchy(map_project_path)
        map_project_pom_fixed = update_libraries_in_poms(cfg, map_project_pom, map_project_parents, map2_lib_version_projects_main, None)
        if cfg.fix >= 2:
            write_poms(map_project_pom_fixed, map_project_path)

    elif cfg.type == FIX_PROPERTIES_UNUSED_VERSIONS:
        map_project_pom, map_project_path = read_poms(cfg, cfg.dir, cfg.depth, cfg.pom)
        if cfg.verbosity >= 3:
            print(map_project_pom)
            print(map_project_path)
        map_project_parents = build_pom_hierarchy(map_project_path)
        map_project_linenums_unused = {}
        for project, pom in map_project_pom.items():
            map_verprop_linenum = find_versions_in_pom(pom)
            map_project_linenums_unused[project] = list(unused_versions_in_pom(pom, map_verprop_linenum).values())
        if map_project_linenums_unused and cfg.fix >= 2:
            write_poms(map_project_pom, map_project_path, map_project_linenums_unused)
        else:
            print(map_project_linenums_unused)

    elif cfg.type == FIX_PARENTS_SET_VERSIONS and cfg.libs:
        map_project_pom, map_project_path = read_poms(cfg, cfg.dir, cfg.depth, cfg.pom)
        if cfg.verbosity >= 3:
            print(map_project_pom)
            print(map_project_path)
        map_project_parents = build_pom_hierarchy(map_project_path)
        map_project_pom_fixed = update_parent_in_poms(cfg, map_project_pom)
        if cfg.fix >= 2:
            write_poms(map_project_pom_fixed, map_project_path)

    elif cfg.type == FIX_LIBS_FROM_REPO:
        map2_project_lib_versions_main, map2_project_lib_versions = maven_dependencies(cfg)
        if cfg.verbosity >= 1:
            print(map2_project_lib_versions_main)
            print(map2_project_lib_versions)

        map2_lib_version_projects_main = merge_libs(cfg, map2_project_lib_versions_main)
        if cfg.verbosity >= 3:
            print(map2_lib_version_projects_main)
        central_libs = {}
        for lib in map2_lib_version_projects_main.keys():
            latest_version = find_latest_maven_central(cfg, lib)
            if latest_version:
                central_libs[lib] = latest_version
        if cfg.verbosity >= 2:
            print(central_libs)

        if cfg.fix >= 1:
            map_project_pom, map_project_path = read_poms(cfg, cfg.dir, cfg.depth, cfg.pom)
            if cfg.verbosity >= 3:
                print(map_project_pom)
                print(map_project_path)
            map_project_parents = build_pom_hierarchy(map_project_path)
            map_project_pom_fixed = update_libraries_in_poms(cfg, map_project_pom, map_project_parents, map2_lib_version_projects_main, central_libs)
            if cfg.fix >= 2:
                write_poms(map_project_pom_fixed, map_project_path)

    elif cfg.type == FIX_PLUGINS_FROM_REPO:
        map2_project_lib_versions_main = maven_plugins(cfg)
        if cfg.verbosity >= 1:
            print(map2_project_lib_versions_main)
        map2_lib_version_projects_main = merge_libs(cfg, map2_project_lib_versions_main)
        if cfg.verbosity >= 3:
            print(map2_lib_version_projects_main)

        central_libs = {}
        for lib in map2_lib_version_projects_main.keys():
            latest_version = find_latest_maven_central(cfg, lib)
            if latest_version:
                central_libs[lib] = latest_version
        if cfg.verbosity >= 0:
            print(central_libs)
 
        if cfg.fix >= 1:
            map_project_pom, map_project_path = read_poms(cfg, cfg.dir, cfg.depth, cfg.pom)
            if cfg.verbosity >= 3:
                print(map_project_pom)
                print(map_project_path)
            map_project_parents = build_pom_hierarchy(map_project_path)
            map_project_pom_fixed = update_libraries_in_poms(cfg, map_project_pom, map_project_parents, map2_lib_version_projects_main, central_libs)
            if cfg.fix >= 2:
                write_poms(map_project_pom_fixed, map_project_path)

    elif cfg.type == FIX_PLUGINS_SET_VERSION:
        map2_project_lib_versions_main = maven_plugins(cfg)
        if cfg.verbosity >= 1:
            print(map2_project_lib_versions_main)
        map2_lib_version_projects_main = merge_libs(cfg, map2_project_lib_versions_main)
        if cfg.verbosity >= 3:
            print(map2_lib_version_projects_main)
 
        if cfg.fix >= 1:
            map_project_pom, map_project_path = read_poms(cfg, cfg.dir, cfg.depth, cfg.pom)
            if cfg.verbosity >= 3:
                print(map_project_pom)
                print(map_project_path)
            map_project_parents = build_pom_hierarchy(map_project_path)
            map_project_pom_fixed = update_libraries_in_poms(cfg, map_project_pom, map_project_parents, map2_lib_version_projects_main, None)
            if cfg.fix >= 2:
                write_poms(map_project_pom_fixed, map_project_path)

if __name__ == '__main__':
    main()
else:
    # module-specific initialization code if any
    pass
