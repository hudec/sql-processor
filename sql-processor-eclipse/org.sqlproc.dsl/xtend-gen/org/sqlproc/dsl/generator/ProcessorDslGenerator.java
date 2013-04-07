package org.sqlproc.dsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.sqlproc.dsl.processorDsl.Extends;
import org.sqlproc.dsl.processorDsl.ImplPackage;
import org.sqlproc.dsl.processorDsl.Implements;
import org.sqlproc.dsl.processorDsl.PojoDao;
import org.sqlproc.dsl.processorDsl.PojoEntity;
import org.sqlproc.dsl.processorDsl.PojoMethod;
import org.sqlproc.dsl.processorDsl.PojoMethodArg;
import org.sqlproc.dsl.processorDsl.PojoProperty;
import org.sqlproc.dsl.processorDsl.PojoType;
import org.sqlproc.dsl.util.Utils;

@SuppressWarnings("all")
public class ProcessorDslGenerator implements IGenerator {
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<PojoEntity> _filter = Iterables.<PojoEntity>filter(_iterable, PojoEntity.class);
    for (final PojoEntity e : _filter) {
      EObject _eContainer = e.eContainer();
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer);
      String _string = _fullyQualifiedName.toString("/");
      String _plus = (_string + "/");
      QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(e);
      String _plus_1 = (_plus + _fullyQualifiedName_1);
      String _plus_2 = (_plus_1 + ".java");
      CharSequence _compile = this.compile(e);
      fsa.generateFile(_plus_2, _compile);
    }
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
    Iterable<PojoDao> _filter_1 = Iterables.<PojoDao>filter(_iterable_1, PojoDao.class);
    for (final PojoDao d : _filter_1) {
      String _implPackage = this.getImplPackage(d);
      boolean _notEquals = (!Objects.equal(_implPackage, null));
      if (_notEquals) {
        EObject _eContainer_1 = d.eContainer();
        QualifiedName _fullyQualifiedName_2 = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer_1);
        String _string_1 = _fullyQualifiedName_2.toString("/");
        String _plus_3 = (_string_1 + "/");
        QualifiedName _fullyQualifiedName_3 = this._iQualifiedNameProvider.getFullyQualifiedName(d);
        String _plus_4 = (_plus_3 + _fullyQualifiedName_3);
        String _plus_5 = (_plus_4 + ".java");
        CharSequence _compileIfx = this.compileIfx(d);
        fsa.generateFile(_plus_5, _compileIfx);
        EObject _eContainer_2 = d.eContainer();
        QualifiedName _fullyQualifiedName_4 = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer_2);
        String _string_2 = _fullyQualifiedName_4.toString("/");
        String _plus_6 = (_string_2 + "/");
        String _implPackage_1 = this.getImplPackage(d);
        String _plus_7 = (_plus_6 + _implPackage_1);
        String _plus_8 = (_plus_7 + "/");
        QualifiedName _fullyQualifiedName_5 = this._iQualifiedNameProvider.getFullyQualifiedName(d);
        String _plus_9 = (_plus_8 + _fullyQualifiedName_5);
        String _plus_10 = (_plus_9 + "Impl.java");
        CharSequence _compile_1 = this.compile(d);
        fsa.generateFile(_plus_10, _compile_1);
      } else {
        EObject _eContainer_3 = d.eContainer();
        QualifiedName _fullyQualifiedName_6 = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer_3);
        String _string_3 = _fullyQualifiedName_6.toString("/");
        String _plus_11 = (_string_3 + "/");
        QualifiedName _fullyQualifiedName_7 = this._iQualifiedNameProvider.getFullyQualifiedName(d);
        String _plus_12 = (_plus_11 + _fullyQualifiedName_7);
        String _plus_13 = (_plus_12 + ".java");
        CharSequence _compile_2 = this.compile(d);
        fsa.generateFile(_plus_13, _compile_2);
      }
    }
  }
  
  public CharSequence compile(final PojoEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    ImportManager _importManager = new ImportManager(true);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    this.addImplements(e, importManager);
    _builder.newLineIfNotEmpty();
    this.addExtends(e, importManager);
    _builder.newLineIfNotEmpty();
    final CharSequence classBody = this.compile(e, importManager);
    _builder.newLineIfNotEmpty();
    {
      EObject _eContainer = e.eContainer();
      boolean _notEquals = (!Objects.equal(_eContainer, null));
      if (_notEquals) {
        _builder.append("package ");
        EObject _eContainer_1 = e.eContainer();
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer_1);
        _builder.append(_fullyQualifiedName, "");
        _builder.append(";");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      List<String> _imports = importManager.getImports();
      boolean _isEmpty = _imports.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("  ");
        _builder.newLine();
        {
          List<String> _imports_1 = importManager.getImports();
          for(final String i : _imports_1) {
            _builder.append("import ");
            _builder.append(i, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      String _sernum = Utils.getSernum(e);
      boolean _notEquals_1 = (!Objects.equal(_sernum, null));
      if (_notEquals_1) {
        _builder.newLine();
        _builder.append("import java.io.Serializable;");
        _builder.newLine();
      }
    }
    {
      List<PojoProperty> _listFeatures = this.listFeatures(e);
      boolean _isEmpty_1 = _listFeatures.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("import java.util.ArrayList;");
        _builder.newLine();
      }
    }
    {
      boolean _or = false;
      PojoProperty _hasIsDef = this.hasIsDef(e);
      boolean _notEquals_2 = (!Objects.equal(_hasIsDef, null));
      if (_notEquals_2) {
        _or = true;
      } else {
        PojoProperty _hasToInit = this.hasToInit(e);
        boolean _notEquals_3 = (!Objects.equal(_hasToInit, null));
        _or = (_notEquals_2 || _notEquals_3);
      }
      if (_or) {
        _builder.append("import java.util.Set;");
        _builder.newLine();
        _builder.append("import java.util.HashSet;");
        _builder.newLine();
        _builder.append("import java.lang.reflect.InvocationTargetException;");
        _builder.newLine();
        _builder.append("import org.apache.commons.beanutils.MethodUtils;");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append(classBody, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final PojoEntity e, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    {
      boolean _isAbstract = Utils.isAbstract(e);
      if (_isAbstract) {
        _builder.append("abstract ");
      }
    }
    _builder.append("class ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    CharSequence _compileExtends = this.compileExtends(e);
    _builder.append(_compileExtends, "");
    CharSequence _compileImplements = this.compileImplements(e);
    _builder.append(_compileImplements, "");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      String _sernum = Utils.getSernum(e);
      boolean _notEquals = (!Objects.equal(_sernum, null));
      if (_notEquals) {
        _builder.append("  ");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("private static final long serialVersionUID = ");
        String _sernum_1 = Utils.getSernum(e);
        _builder.append(_sernum_1, "  ");
        _builder.append("L;");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<PojoProperty> _features = e.getFeatures();
      final Function1<PojoProperty,Boolean> _function = new Function1<PojoProperty,Boolean>() {
          public Boolean apply(final PojoProperty x) {
            String _index = Utils.getIndex(x);
            boolean _notEquals = (!Objects.equal(_index, null));
            return Boolean.valueOf(_notEquals);
          }
        };
      Iterable<PojoProperty> _filter = IterableExtensions.<PojoProperty>filter(_features, _function);
      for(final PojoProperty f : _filter) {
        _builder.append("  ");
        _builder.append("public static final int ORDER_BY_");
        String _constName = Utils.constName(f);
        _builder.append(_constName, "  ");
        _builder.append(" = ");
        String _index = Utils.getIndex(f);
        _builder.append(_index, "  ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<PojoProperty> _features_1 = e.getFeatures();
      final Function1<PojoProperty,Boolean> _function_1 = new Function1<PojoProperty,Boolean>() {
          public Boolean apply(final PojoProperty x) {
            String _name = x.getName();
            boolean _startsWith = _name.startsWith("index=");
            return Boolean.valueOf(_startsWith);
          }
        };
      Iterable<PojoProperty> _filter_1 = IterableExtensions.<PojoProperty>filter(_features_1, _function_1);
      for(final PojoProperty f_1 : _filter_1) {
        _builder.append("  ");
        _builder.append("public static final int ORDER_BY_");
        String _constName2 = Utils.constName2(f_1);
        _builder.append(_constName2, "  ");
        _builder.append(" = ");
        String _name_1 = f_1.getName();
        String _substring = _name_1.substring(6);
        _builder.append(_substring, "  ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public ");
    String _name_2 = e.getName();
    _builder.append(_name_2, "  ");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    {
      List<PojoProperty> _requiredFeatures = this.requiredFeatures(e);
      boolean _isEmpty = _requiredFeatures.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("  ");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("public ");
        String _name_3 = e.getName();
        _builder.append(_name_3, "  ");
        _builder.append("(");
        {
          List<PojoProperty> _requiredFeatures_1 = this.requiredFeatures(e);
          boolean _hasElements = false;
          for(final PojoProperty f_2 : _requiredFeatures_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "  ");
            }
            CharSequence _compileType = this.compileType(f_2, importManager);
            _builder.append(_compileType, "  ");
            _builder.append(" ");
            String _name_4 = f_2.getName();
            _builder.append(_name_4, "  ");
          }
        }
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        {
          ArrayList<PojoProperty> _requiredSuperFeatures = this.requiredSuperFeatures(e);
          boolean _hasElements_1 = false;
          for(final PojoProperty f_3 : _requiredSuperFeatures) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
              _builder.append("  super(", "  ");
            } else {
              _builder.appendImmediate(", ", "  ");
            }
            String _name_5 = f_3.getName();
            _builder.append(_name_5, "  ");
          }
          if (_hasElements_1) {
            _builder.append(");", "  ");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        {
          List<PojoProperty> _requiredFeatures1 = this.requiredFeatures1(e);
          boolean _hasElements_2 = false;
          for(final PojoProperty f_4 : _requiredFeatures1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate("\n", "  ");
            }
            _builder.append("  this.");
            String _name_6 = f_4.getName();
            _builder.append(_name_6, "  ");
            _builder.append(" = ");
            String _name_7 = f_4.getName();
            _builder.append(_name_7, "  ");
            _builder.append(";");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      EList<PojoProperty> _features_2 = e.getFeatures();
      final Function1<PojoProperty,Boolean> _function_2 = new Function1<PojoProperty,Boolean>() {
          public Boolean apply(final PojoProperty x) {
            boolean _isAttribute = ProcessorDslGenerator.this.isAttribute(x);
            return Boolean.valueOf(_isAttribute);
          }
        };
      Iterable<PojoProperty> _filter_2 = IterableExtensions.<PojoProperty>filter(_features_2, _function_2);
      for(final PojoProperty f_5 : _filter_2) {
        _builder.append("  ");
        CharSequence _compile = this.compile(f_5, importManager, e);
        _builder.append(_compile, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  ");
    {
      EList<PojoProperty> _features_3 = e.getFeatures();
      final Function1<PojoProperty,Boolean> _function_3 = new Function1<PojoProperty,Boolean>() {
          public Boolean apply(final PojoProperty x) {
            boolean _isAttribute = ProcessorDslGenerator.this.isAttribute(x);
            boolean _not = (!_isAttribute);
            return Boolean.valueOf(_not);
          }
        };
      Iterable<PojoProperty> _filter_3 = IterableExtensions.<PojoProperty>filter(_features_3, _function_3);
      for(final PojoProperty f_6 : _filter_3) {
        {
          String _name_8 = f_6.getName();
          boolean _equalsIgnoreCase = _name_8.equalsIgnoreCase("hashCode");
          if (_equalsIgnoreCase) {
            CharSequence _compileHashCode = this.compileHashCode(f_6, importManager, e);
            _builder.append(_compileHashCode, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
          } else {
            String _name_9 = f_6.getName();
            boolean _equalsIgnoreCase_1 = _name_9.equalsIgnoreCase("equals");
            if (_equalsIgnoreCase_1) {
              CharSequence _compileEquals = this.compileEquals(f_6, importManager, e);
              _builder.append(_compileEquals, "  ");
              _builder.newLineIfNotEmpty();
              _builder.append("  ");
            } else {
              String _name_10 = f_6.getName();
              boolean _equalsIgnoreCase_2 = _name_10.equalsIgnoreCase("toInit");
              if (_equalsIgnoreCase_2) {
                CharSequence _compileToInit = this.compileToInit(f_6, importManager, e);
                _builder.append(_compileToInit, "  ");
                _builder.newLineIfNotEmpty();
                _builder.append("  ");
              } else {
                String _name_11 = f_6.getName();
                boolean _equalsIgnoreCase_3 = _name_11.equalsIgnoreCase("enumInit");
                if (_equalsIgnoreCase_3) {
                  CharSequence _compileEnumInit = this.compileEnumInit(f_6, importManager, e);
                  _builder.append(_compileEnumInit, "  ");
                  _builder.newLineIfNotEmpty();
                  _builder.append("  ");
                } else {
                  String _name_12 = f_6.getName();
                  boolean _equalsIgnoreCase_4 = _name_12.equalsIgnoreCase("isDef");
                  if (_equalsIgnoreCase_4) {
                    CharSequence _compileIsDef = this.compileIsDef(f_6, importManager, e);
                    _builder.append(_compileIsDef, "  ");
                    _builder.newLineIfNotEmpty();
                    _builder.append("  ");
                  } else {
                    String _name_13 = f_6.getName();
                    boolean _equalsIgnoreCase_5 = _name_13.equalsIgnoreCase("enumDef");
                    if (_equalsIgnoreCase_5) {
                      CharSequence _compileEnumDef = this.compileEnumDef(f_6, importManager, e);
                      _builder.append(_compileEnumDef, "  ");
                      _builder.newLineIfNotEmpty();
                      _builder.append("  ");
                    } else {
                      String _name_14 = f_6.getName();
                      boolean _equalsIgnoreCase_6 = _name_14.equalsIgnoreCase("toString");
                      if (_equalsIgnoreCase_6) {
                        CharSequence _compileToString = this.compileToString(f_6, importManager, e);
                        _builder.append(_compileToString, "  ");
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final PojoProperty f, final ImportManager importManager, final PojoEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("private ");
    CharSequence _compileType = this.compileType(f, importManager);
    _builder.append(_compileType, "");
    _builder.append(" ");
    String _name = f.getName();
    _builder.append(_name, "");
    {
      boolean _isList = Utils.isList(f);
      if (_isList) {
        _builder.append(" = new Array");
        CharSequence _compileType_1 = this.compileType(f, importManager);
        _builder.append(_compileType_1, "");
        _builder.append("()");
      } else {
        boolean _isOptLock = Utils.isOptLock(f);
        if (_isOptLock) {
          _builder.append(" = 0");
        }
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("public ");
    CharSequence _compileType_2 = this.compileType(f, importManager);
    _builder.append(_compileType_2, "");
    _builder.append(" get");
    String _name_1 = f.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return ");
    String _name_2 = f.getName();
    _builder.append(_name_2, "  ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("public void set");
    String _name_3 = f.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_3);
    _builder.append(_firstUpper_1, "");
    _builder.append("(");
    CharSequence _compileType_3 = this.compileType(f, importManager);
    _builder.append(_compileType_3, "");
    _builder.append(" ");
    String _name_4 = f.getName();
    _builder.append(_name_4, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("this.");
    String _name_5 = f.getName();
    _builder.append(_name_5, "  ");
    _builder.append(" = ");
    String _name_6 = f.getName();
    _builder.append(_name_6, "  ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("public ");
    String _name_7 = e.getName();
    _builder.append(_name_7, "");
    _builder.append(" _set");
    String _name_8 = f.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_8);
    _builder.append(_firstUpper_2, "");
    _builder.append("(");
    CharSequence _compileType_4 = this.compileType(f, importManager);
    _builder.append(_compileType_4, "");
    _builder.append(" ");
    String _name_9 = f.getName();
    _builder.append(_name_9, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("this.");
    String _name_10 = f.getName();
    _builder.append(_name_10, "  ");
    _builder.append(" = ");
    String _name_11 = f.getName();
    _builder.append(_name_11, "  ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return this;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileHashCode(final PojoProperty f, final ImportManager importManager, final PojoEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public int hashCode() {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("final int prime = 31;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("int result = 1;");
    _builder.newLine();
    {
      EList<PojoProperty> _attrs = f.getAttrs();
      for(final PojoProperty f2 : _attrs) {
        _builder.append("  ");
        _builder.append("result = prime * result + ");
        {
          String _native = f2.getNative();
          boolean _notEquals = (!Objects.equal(_native, null));
          if (_notEquals) {
            _builder.append("(int) (");
            String _name = f2.getName();
            _builder.append(_name, "  ");
            _builder.append(" ^ (");
            String _name_1 = f2.getName();
            _builder.append(_name_1, "  ");
            _builder.append(" >>> 32))");
          } else {
            String _name_2 = f2.getName();
            _builder.append(_name_2, "  ");
            _builder.append(".hashCode()");
          }
        }
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  ");
    _builder.append("return result;");
    _builder.newLine();
    _builder.append("}  ");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileEquals(final PojoProperty f, final ImportManager importManager, final PojoEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public boolean equals(Object obj) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (this == obj)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (obj == null)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (getClass() != obj.getClass())");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("  ");
    String _name = e.getName();
    _builder.append(_name, "  ");
    _builder.append(" other = (");
    String _name_1 = e.getName();
    _builder.append(_name_1, "  ");
    _builder.append(") obj;");
    _builder.newLineIfNotEmpty();
    {
      EList<PojoProperty> _attrs = f.getAttrs();
      for(final PojoProperty f2 : _attrs) {
        _builder.append("  ");
        {
          String _native = f2.getNative();
          boolean _notEquals = (!Objects.equal(_native, null));
          if (_notEquals) {
            _builder.append("if (");
            String _name_2 = f2.getName();
            _builder.append(_name_2, "  ");
            _builder.append(" != other.");
            String _name_3 = f2.getName();
            _builder.append(_name_3, "  ");
            _builder.append(")");
          } else {
            _builder.append("if (!");
            String _name_4 = f2.getName();
            _builder.append(_name_4, "  ");
            _builder.append(".equals(other.");
            String _name_5 = f2.getName();
            _builder.append(_name_5, "  ");
            _builder.append("))");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("  ");
        _builder.append("return false;");
        _builder.newLine();
      }
    }
    _builder.append("  ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("}  ");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileToString(final PojoProperty f, final ImportManager importManager, final PojoEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return \"");
    String _name = e.getName();
    _builder.append(_name, "  ");
    _builder.append(" [");
    {
      List<PojoProperty> _simplAttrs = this.simplAttrs(f);
      boolean _hasElements = false;
      for(final PojoProperty f2 : _simplAttrs) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" + \", ", "  ");
        }
        String _name_1 = f2.getName();
        _builder.append(_name_1, "  ");
        _builder.append("=\" + ");
        String _name_2 = f2.getName();
        _builder.append(_name_2, "  ");
      }
    }
    {
      PojoEntity _superType = Utils.getSuperType(e);
      boolean _notEquals = (!Objects.equal(_superType, null));
      if (_notEquals) {
        _builder.append(" + super.toString()");
      }
    }
    _builder.append(" + \"]\";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public String toStringFull() {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return \"");
    String _name_3 = e.getName();
    _builder.append(_name_3, "  ");
    _builder.append(" [");
    {
      EList<PojoProperty> _attrs = f.getAttrs();
      boolean _hasElements_1 = false;
      for(final PojoProperty f2_1 : _attrs) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(" + \", ", "  ");
        }
        String _name_4 = f2_1.getName();
        _builder.append(_name_4, "  ");
        _builder.append("=\" + ");
        String _name_5 = f2_1.getName();
        _builder.append(_name_5, "  ");
      }
    }
    {
      PojoEntity _superType_1 = Utils.getSuperType(e);
      boolean _notEquals_1 = (!Objects.equal(_superType_1, null));
      if (_notEquals_1) {
        _builder.append(" + super.toString()");
      }
    }
    _builder.append(" + \"]\";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileIsDef(final PojoProperty f, final ImportManager importManager, final PojoEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public enum Attribute {");
    _builder.newLine();
    _builder.append("  ");
    {
      EList<PojoProperty> _attrs = f.getAttrs();
      boolean _hasElements = false;
      for(final PojoProperty f2 : _attrs) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "  ");
        }
        String _name = f2.getName();
        _builder.append(_name, "  ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("private Set<String> nullValues = new HashSet<String>();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public void setNull(Attribute... attributes) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (attributes == null)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("throw new IllegalArgumentException();");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("for (Attribute attribute : attributes)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("nullValues.add(attribute.name());");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public void clearNull(Attribute... attributes) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (attributes == null)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("throw new IllegalArgumentException();");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("for (Attribute attribute : attributes)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("nullValues.remove(attribute.name());");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public Boolean isNull(String attrName) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (attrName == null)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("throw new IllegalArgumentException();");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return nullValues.contains(attrName);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public Boolean isNull(Attribute attribute) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (attribute == null)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("throw new IllegalArgumentException();");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return nullValues.contains(attribute.name());");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public Boolean isDef(String attrName) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (attrName == null)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("throw new IllegalArgumentException();");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (nullValues.contains(attrName))");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Object result = MethodUtils.invokeMethod(this, \"get\" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return (result != null) ? true : false;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("} catch (NoSuchMethodException e) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("} catch (IllegalAccessException e) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("throw new RuntimeException(e);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("} catch (InvocationTargetException e) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("throw new RuntimeException(e);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Object result = MethodUtils.invokeMethod(this, \"is\" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return (result != null) ? true : false;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("} catch (NoSuchMethodException e) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("} catch (IllegalAccessException e) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("throw new RuntimeException(e);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("} catch (InvocationTargetException e) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("throw new RuntimeException(e);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public void clearAllNull() {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("nullValues = new HashSet<String>();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileEnumDef(final PojoProperty f, final ImportManager importManager, final PojoEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public enum Attribute {");
    _builder.newLine();
    _builder.append("  ");
    {
      EList<PojoProperty> _attrs = f.getAttrs();
      boolean _hasElements = false;
      for(final PojoProperty f2 : _attrs) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "  ");
        }
        String _name = f2.getName();
        _builder.append(_name, "  ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileToInit(final PojoProperty f, final ImportManager importManager, final PojoEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public enum Association {");
    _builder.newLine();
    _builder.append("  ");
    {
      EList<PojoProperty> _attrs = f.getAttrs();
      boolean _hasElements = false;
      for(final PojoProperty f2 : _attrs) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "  ");
        }
        String _name = f2.getName();
        _builder.append(_name, "  ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("private Set<String> initAssociations = new HashSet<String>();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public void setInit(String... associations) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (associations == null)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("throw new IllegalArgumentException();");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("for (String association : associations)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("initAssociations.add(association);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public void clearInit(String... associations) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (associations == null)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("throw new IllegalArgumentException();");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("for (String association : associations)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("initAssociations.remove(association);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public Boolean toInit(String association) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (association == null)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("throw new IllegalArgumentException();");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return initAssociations.contains(association);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public void clearAllInit() {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("initAssociations = new HashSet<String>();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileEnumInit(final PojoProperty f, final ImportManager importManager, final PojoEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public enum Association {");
    _builder.newLine();
    _builder.append("  ");
    {
      EList<PojoProperty> _attrs = f.getAttrs();
      boolean _hasElements = false;
      for(final PojoProperty f2 : _attrs) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "  ");
        }
        String _name = f2.getName();
        _builder.append(_name, "  ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileType(final PojoProperty f, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _native = f.getNative();
      boolean _notEquals = (!Objects.equal(_native, null));
      if (_notEquals) {
        String _native_1 = f.getNative();
        String _substring = _native_1.substring(1);
        _builder.append(_substring, "");
      } else {
        PojoEntity _ref = f.getRef();
        boolean _notEquals_1 = (!Objects.equal(_ref, null));
        if (_notEquals_1) {
          PojoEntity _ref_1 = f.getRef();
          QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_ref_1);
          _builder.append(_fullyQualifiedName, "");
        } else {
          JvmType _type = f.getType();
          boolean _notEquals_2 = (!Objects.equal(_type, null));
          if (_notEquals_2) {
            JvmType _type_1 = f.getType();
            CharSequence _serialize = importManager.serialize(_type_1);
            _builder.append(_serialize, "");
          }
        }
      }
    }
    {
      JvmType _gtype = f.getGtype();
      boolean _notEquals_3 = (!Objects.equal(_gtype, null));
      if (_notEquals_3) {
        _builder.append("<");
        JvmType _gtype_1 = f.getGtype();
        CharSequence _serialize_1 = importManager.serialize(_gtype_1);
        _builder.append(_serialize_1, "");
        _builder.append(">");
      }
    }
    {
      PojoEntity _gref = f.getGref();
      boolean _notEquals_4 = (!Objects.equal(_gref, null));
      if (_notEquals_4) {
        _builder.append("<");
        PojoEntity _gref_1 = f.getGref();
        QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(_gref_1);
        _builder.append(_fullyQualifiedName_1, "");
        _builder.append(">");
      }
    }
    {
      boolean _isArray = f.isArray();
      if (_isArray) {
        _builder.append("[]");
      }
    }
    return _builder;
  }
  
  public CharSequence compileType(final PojoType f, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _native = f.getNative();
      boolean _notEquals = (!Objects.equal(_native, null));
      if (_notEquals) {
        String _native_1 = f.getNative();
        String _substring = _native_1.substring(1);
        _builder.append(_substring, "");
      } else {
        PojoEntity _ref = f.getRef();
        boolean _notEquals_1 = (!Objects.equal(_ref, null));
        if (_notEquals_1) {
          PojoEntity _ref_1 = f.getRef();
          JvmType _pojoMethod2jvmType = Utils.pojoMethod2jvmType(_ref_1);
          CharSequence _serialize = importManager.serialize(_pojoMethod2jvmType);
          _builder.append(_serialize, "");
        } else {
          JvmType _type = f.getType();
          boolean _notEquals_2 = (!Objects.equal(_type, null));
          if (_notEquals_2) {
            JvmType _type_1 = f.getType();
            CharSequence _serialize_1 = importManager.serialize(_type_1);
            _builder.append(_serialize_1, "");
          }
        }
      }
    }
    {
      JvmType _gtype = f.getGtype();
      boolean _notEquals_3 = (!Objects.equal(_gtype, null));
      if (_notEquals_3) {
        _builder.append("<");
        JvmType _gtype_1 = f.getGtype();
        CharSequence _serialize_2 = importManager.serialize(_gtype_1);
        _builder.append(_serialize_2, "");
        _builder.append(">");
      }
    }
    {
      PojoEntity _gref = f.getGref();
      boolean _notEquals_4 = (!Objects.equal(_gref, null));
      if (_notEquals_4) {
        _builder.append("<");
        PojoEntity _gref_1 = f.getGref();
        JvmType _pojoMethod2jvmType_1 = Utils.pojoMethod2jvmType(_gref_1);
        CharSequence _serialize_3 = importManager.serialize(_pojoMethod2jvmType_1);
        _builder.append(_serialize_3, "");
        _builder.append(">");
      }
    }
    {
      boolean _isArray = f.isArray();
      if (_isArray) {
        _builder.append("[]");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final PojoDao d) {
    StringConcatenation _builder = new StringConcatenation();
    ImportManager _importManager = new ImportManager(true);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    this.addImplements(d, importManager);
    _builder.newLineIfNotEmpty();
    this.addExtends(d, importManager);
    _builder.newLineIfNotEmpty();
    final Map<String,List<PojoMethodArg>> toInits = Utils.getToInits(d);
    _builder.newLineIfNotEmpty();
    PojoEntity _pojo = d.getPojo();
    final CharSequence classBody = this.compile(d, _pojo, toInits, importManager);
    _builder.newLineIfNotEmpty();
    {
      EObject _eContainer = d.eContainer();
      boolean _notEquals = (!Objects.equal(_eContainer, null));
      if (_notEquals) {
        _builder.append("package ");
        EObject _eContainer_1 = d.eContainer();
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer_1);
        _builder.append(_fullyQualifiedName, "");
        {
          String _implPackage = this.getImplPackage(d);
          boolean _notEquals_1 = (!Objects.equal(_implPackage, null));
          if (_notEquals_1) {
            _builder.append(".");
            String _implPackage_1 = this.getImplPackage(d);
            _builder.append(_implPackage_1, "");
          }
        }
        _builder.append(";");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      String _implPackage_2 = this.getImplPackage(d);
      boolean _notEquals_2 = (!Objects.equal(_implPackage_2, null));
      if (_notEquals_2) {
        _builder.newLine();
        _builder.append("import ");
        EObject _eContainer_2 = d.eContainer();
        QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer_2);
        _builder.append(_fullyQualifiedName_1, "");
        _builder.append(".");
        String _name = d.getName();
        _builder.append(_name, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<String> _imports = importManager.getImports();
      boolean _isEmpty = _imports.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("  ");
        _builder.newLine();
        {
          List<String> _imports_1 = importManager.getImports();
          for(final String i : _imports_1) {
            _builder.append("import ");
            _builder.append(i, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      String _sernum = Utils.getSernum(d);
      boolean _notEquals_3 = (!Objects.equal(_sernum, null));
      if (_notEquals_3) {
        _builder.newLine();
        _builder.append("import java.io.Serializable;");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import java.util.Map;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.slf4j.Logger;");
    _builder.newLine();
    _builder.append("import org.slf4j.LoggerFactory;");
    _builder.newLine();
    _builder.append("import org.sqlproc.engine.SqlControl;");
    _builder.newLine();
    _builder.append("import org.sqlproc.engine.SqlCrudEngine;");
    _builder.newLine();
    _builder.append("import org.sqlproc.engine.SqlEngineFactory;");
    _builder.newLine();
    _builder.append("import org.sqlproc.engine.SqlQueryEngine;");
    _builder.newLine();
    _builder.append("import org.sqlproc.engine.SqlProcedureEngine;");
    _builder.newLine();
    _builder.append("import org.sqlproc.engine.SqlSession;");
    _builder.newLine();
    _builder.append("import org.sqlproc.engine.SqlSessionFactory;");
    _builder.newLine();
    _builder.append("import org.sqlproc.engine.impl.SqlStandardControl;");
    _builder.newLine();
    {
      PojoEntity _pojo_1 = d.getPojo();
      boolean _notEquals_4 = (!Objects.equal(_pojo_1, null));
      if (_notEquals_4) {
        _builder.append("import ");
        PojoEntity _pojo_2 = d.getPojo();
        String _completeName = this.completeName(_pojo_2);
        _builder.append(_completeName, "");
        _builder.append(";");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Set<Entry<String,List<PojoMethodArg>>> _entrySet = toInits.entrySet();
      for(final Entry<String,List<PojoMethodArg>> f : _entrySet) {
        {
          List<PojoMethodArg> _value = f.getValue();
          boolean _hasElements = false;
          for(final PojoMethodArg a : _value) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate("\n", "");
            }
            _builder.append("import ");
            PojoType _type = a.getType();
            PojoEntity _ref = _type.getRef();
            String _completeName_1 = this.completeName(_ref);
            _builder.append(_completeName_1, "");
            _builder.append(";");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(classBody, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final PojoDao d, final PojoEntity e, final Map<String,List<PojoMethodArg>> toInits, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    {
      boolean _isAbstract = Utils.isAbstract(d);
      if (_isAbstract) {
        _builder.append("abstract ");
      }
    }
    _builder.append("class ");
    String _name = d.getName();
    _builder.append(_name, "");
    {
      String _implPackage = this.getImplPackage(d);
      boolean _notEquals = (!Objects.equal(_implPackage, null));
      if (_notEquals) {
        _builder.append("Impl");
      }
    }
    _builder.append(" ");
    CharSequence _compileExtends = this.compileExtends(d);
    _builder.append(_compileExtends, "");
    CharSequence _compileImplements = this.compileImplements(d);
    _builder.append(_compileImplements, "");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      String _sernum = Utils.getSernum(d);
      boolean _notEquals_1 = (!Objects.equal(_sernum, null));
      if (_notEquals_1) {
        _builder.append("  ");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("private static final long serialVersionUID = ");
        String _sernum_1 = Utils.getSernum(d);
        _builder.append(_sernum_1, "  ");
        _builder.append("L;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  ");
    _builder.append("protected final Logger logger = LoggerFactory.getLogger(getClass());");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("protected SqlEngineFactory sqlEngineFactory;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("protected SqlSessionFactory sqlSessionFactory;");
    _builder.newLine();
    _builder.append("    \t");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public ");
    String _name_1 = d.getName();
    _builder.append(_name_1, "  ");
    {
      String _implPackage_1 = this.getImplPackage(d);
      boolean _notEquals_2 = (!Objects.equal(_implPackage_1, null));
      if (_notEquals_2) {
        _builder.append("Impl");
      }
    }
    _builder.append("(SqlEngineFactory sqlEngineFactory) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("this.sqlEngineFactory = sqlEngineFactory;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    \t");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public ");
    String _name_2 = d.getName();
    _builder.append(_name_2, "  ");
    {
      String _implPackage_2 = this.getImplPackage(d);
      boolean _notEquals_3 = (!Objects.equal(_implPackage_2, null));
      if (_notEquals_3) {
        _builder.append("Impl");
      }
    }
    _builder.append("(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("this.sqlEngineFactory = sqlEngineFactory;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("this.sqlSessionFactory = sqlSessionFactory;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    {
      EList<PojoMethod> _methods = d.getMethods();
      for(final PojoMethod m : _methods) {
        {
          String _name_3 = m.getName();
          boolean _equals = Objects.equal(_name_3, "scaffold");
          if (_equals) {
            PojoEntity _parent = Utils.getParent(e);
            CharSequence _compileInsert = this.compileInsert(d, e, _parent, importManager);
            _builder.append(_compileInsert, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            CharSequence _compileGet = this.compileGet(d, e, toInits, importManager);
            _builder.append(_compileGet, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            PojoEntity _parent_1 = Utils.getParent(e);
            CharSequence _compileUpdate = this.compileUpdate(d, e, _parent_1, importManager);
            _builder.append(_compileUpdate, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            PojoEntity _parent_2 = Utils.getParent(e);
            CharSequence _compileDelete = this.compileDelete(d, e, _parent_2, importManager);
            _builder.append(_compileDelete, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            CharSequence _compileList = this.compileList(d, e, toInits, importManager);
            _builder.append(_compileList, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            CharSequence _compileCount = this.compileCount(d, e, toInits, importManager);
            _builder.append(_compileCount, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            {
              boolean _isEmpty = toInits.isEmpty();
              boolean _not = (!_isEmpty);
              if (_not) {
                CharSequence _compileMoreResultClasses = this.compileMoreResultClasses(d, e, toInits, importManager);
                _builder.append(_compileMoreResultClasses, "  ");
              }
            }
          } else {
            boolean _isCallUpdate = Utils.isCallUpdate(m);
            if (_isCallUpdate) {
              _builder.newLineIfNotEmpty();
              _builder.append("  ");
              CharSequence _compileCallUpdate = this.compileCallUpdate(d, m, importManager);
              _builder.append(_compileCallUpdate, "  ");
            } else {
              boolean _isCallFunction = Utils.isCallFunction(m);
              if (_isCallFunction) {
                CharSequence _compileCallFunction = this.compileCallFunction(d, m, importManager);
                _builder.append(_compileCallFunction, "  ");
              } else {
                boolean _or = false;
                boolean _isCallQuery = Utils.isCallQuery(m);
                if (_isCallQuery) {
                  _or = true;
                } else {
                  boolean _isCallQueryFunction = Utils.isCallQueryFunction(m);
                  _or = (_isCallQuery || _isCallQueryFunction);
                }
                if (_or) {
                  boolean _isCallQueryFunction_1 = Utils.isCallQueryFunction(m);
                  CharSequence _compileCallQuery = this.compileCallQuery(d, m, importManager, _isCallQueryFunction_1);
                  _builder.append(_compileCallQuery, "  ");
                } else {
                  boolean _isCallSelectFunction = Utils.isCallSelectFunction(m);
                  if (_isCallSelectFunction) {
                    CharSequence _compileCallSelectFunction = this.compileCallSelectFunction(d, m, importManager);
                    _builder.append(_compileCallSelectFunction, "  ");
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileCallQuery(final PojoDao d, final PojoMethod m, final ImportManager importManager, final boolean isFunction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type = m.getType();
    CharSequence _compileType = this.compileType(_type, importManager);
    _builder.append(_compileType, "");
    _builder.append(" ");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.append("(SqlSession sqlSession, ");
    {
      EList<PojoMethodArg> _args = m.getArgs();
      boolean _hasElements = false;
      for(final PojoMethodArg ma : _args) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_1 = ma.getType();
        CharSequence _compileType_1 = this.compileType(_type_1, importManager);
        _builder.append(_compileType_1, "");
        _builder.append(" ");
        String _name_1 = ma.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"");
    String _name_2 = m.getName();
    _builder.append(_name_2, "    ");
    _builder.append(": \" + ");
    {
      EList<PojoMethodArg> _args_1 = m.getArgs();
      boolean _hasElements_1 = false;
      for(final PojoMethodArg ma_1 : _args_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(" + \" \" ", "    ");
        }
        String _name_3 = ma_1.getName();
        _builder.append(_name_3, "    ");
      }
    }
    _builder.append(" + \" \" + sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("SqlProcedureEngine sqlProc");
    String _name_4 = m.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_4);
    _builder.append(_firstUpper, "  ");
    _builder.append(" = sqlEngineFactory.getCheckedProcedureEngine(\"");
    {
      if (isFunction) {
        _builder.append("FUN");
      } else {
        _builder.append("PROC");
      }
    }
    _builder.append("_");
    String _dbName = Utils.dbName(m);
    _builder.append(_dbName, "  ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    PojoType _type_2 = m.getType();
    CharSequence _compileType_2 = this.compileType(_type_2, importManager);
    _builder.append(_compileType_2, "  ");
    _builder.append(" list = sqlProc");
    String _name_5 = m.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_5);
    _builder.append(_firstUpper_1, "  ");
    _builder.append(".callQuery(sqlSession, ");
    PojoType _type_3 = m.getType();
    PojoEntity _gref = _type_3.getGref();
    String _name_6 = _gref.getName();
    _builder.append(_name_6, "  ");
    _builder.append(".class, ");
    {
      EList<PojoMethodArg> _args_2 = m.getArgs();
      boolean _hasElements_2 = false;
      for(final PojoMethodArg ma_2 : _args_2) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate(", ", "  ");
        }
        String _name_7 = ma_2.getName();
        _builder.append(_name_7, "  ");
      }
    }
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"");
    String _name_8 = m.getName();
    _builder.append(_name_8, "    ");
    _builder.append(" result: \" + list);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return list;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_4 = m.getType();
    CharSequence _compileType_3 = this.compileType(_type_4, importManager);
    _builder.append(_compileType_3, "");
    _builder.append(" ");
    String _name_9 = m.getName();
    _builder.append(_name_9, "");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_3 = m.getArgs();
      boolean _hasElements_3 = false;
      for(final PojoMethodArg ma_3 : _args_3) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_5 = ma_3.getType();
        CharSequence _compileType_4 = this.compileType(_type_5, importManager);
        _builder.append(_compileType_4, "");
        _builder.append(" ");
        String _name_10 = ma_3.getName();
        _builder.append(_name_10, "");
      }
    }
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    String _name_11 = m.getName();
    _builder.append(_name_11, "	");
    _builder.append("(sqlSessionFactory.getSqlSession(), ");
    {
      EList<PojoMethodArg> _args_4 = m.getArgs();
      boolean _hasElements_4 = false;
      for(final PojoMethodArg ma_4 : _args_4) {
        if (!_hasElements_4) {
          _hasElements_4 = true;
        } else {
          _builder.appendImmediate(", ", "	");
        }
        String _name_12 = ma_4.getName();
        _builder.append(_name_12, "	");
      }
    }
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_6 = m.getType();
    CharSequence _compileType_5 = this.compileType(_type_6, importManager);
    _builder.append(_compileType_5, "");
    _builder.append(" ");
    String _name_13 = m.getName();
    _builder.append(_name_13, "");
    _builder.append("(SqlSession sqlSession, ");
    {
      EList<PojoMethodArg> _args_5 = m.getArgs();
      boolean _hasElements_5 = false;
      for(final PojoMethodArg ma_5 : _args_5) {
        if (!_hasElements_5) {
          _hasElements_5 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_7 = ma_5.getType();
        CharSequence _compileType_6 = this.compileType(_type_7, importManager);
        _builder.append(_compileType_6, "");
        _builder.append(" ");
        String _name_14 = ma_5.getName();
        _builder.append(_name_14, "");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return ");
    String _name_15 = m.getName();
    _builder.append(_name_15, "  ");
    _builder.append("(sqlSession, ");
    {
      EList<PojoMethodArg> _args_6 = m.getArgs();
      boolean _hasElements_6 = false;
      for(final PojoMethodArg ma_6 : _args_6) {
        if (!_hasElements_6) {
          _hasElements_6 = true;
        } else {
          _builder.appendImmediate(", ", "  ");
        }
        String _name_16 = ma_6.getName();
        _builder.append(_name_16, "  ");
      }
    }
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_8 = m.getType();
    CharSequence _compileType_7 = this.compileType(_type_8, importManager);
    _builder.append(_compileType_7, "");
    _builder.append(" ");
    String _name_17 = m.getName();
    _builder.append(_name_17, "");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_7 = m.getArgs();
      boolean _hasElements_7 = false;
      for(final PojoMethodArg ma_7 : _args_7) {
        if (!_hasElements_7) {
          _hasElements_7 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_9 = ma_7.getType();
        CharSequence _compileType_8 = this.compileType(_type_9, importManager);
        _builder.append(_compileType_8, "");
        _builder.append(" ");
        String _name_18 = ma_7.getName();
        _builder.append(_name_18, "");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return ");
    String _name_19 = m.getName();
    _builder.append(_name_19, "  ");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_8 = m.getArgs();
      boolean _hasElements_8 = false;
      for(final PojoMethodArg ma_8 : _args_8) {
        if (!_hasElements_8) {
          _hasElements_8 = true;
        } else {
          _builder.appendImmediate(", ", "  ");
        }
        String _name_20 = ma_8.getName();
        _builder.append(_name_20, "  ");
      }
    }
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileCallFunction(final PojoDao d, final PojoMethod m, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type = m.getType();
    CharSequence _compileType = this.compileType(_type, importManager);
    _builder.append(_compileType, "");
    _builder.append(" ");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.append("(SqlSession sqlSession, ");
    {
      EList<PojoMethodArg> _args = m.getArgs();
      boolean _hasElements = false;
      for(final PojoMethodArg ma : _args) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_1 = ma.getType();
        CharSequence _compileType_1 = this.compileType(_type_1, importManager);
        _builder.append(_compileType_1, "");
        _builder.append(" ");
        String _name_1 = ma.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"");
    String _name_2 = m.getName();
    _builder.append(_name_2, "    ");
    _builder.append(": \" + ");
    {
      EList<PojoMethodArg> _args_1 = m.getArgs();
      boolean _hasElements_1 = false;
      for(final PojoMethodArg ma_1 : _args_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(" + \" \" ", "    ");
        }
        String _name_3 = ma_1.getName();
        _builder.append(_name_3, "    ");
      }
    }
    _builder.append(" + \" \" + sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("SqlProcedureEngine sqlFun");
    String _name_4 = m.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_4);
    _builder.append(_firstUpper, "  ");
    _builder.append(" = sqlEngineFactory.getCheckedProcedureEngine(\"FUN_");
    String _dbName = Utils.dbName(m);
    _builder.append(_dbName, "  ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("Object result = sqlFun");
    String _name_5 = m.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_5);
    _builder.append(_firstUpper_1, "  ");
    _builder.append(".callFunction(sqlSession, ");
    {
      EList<PojoMethodArg> _args_2 = m.getArgs();
      boolean _hasElements_2 = false;
      for(final PojoMethodArg ma_2 : _args_2) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate(", ", "  ");
        }
        String _name_6 = ma_2.getName();
        _builder.append(_name_6, "  ");
      }
    }
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"");
    String _name_7 = m.getName();
    _builder.append(_name_7, "    ");
    _builder.append(" result: \" + result);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return (");
    PojoType _type_2 = m.getType();
    CharSequence _compileType_2 = this.compileType(_type_2, importManager);
    _builder.append(_compileType_2, "  ");
    _builder.append(") result;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_3 = m.getType();
    CharSequence _compileType_3 = this.compileType(_type_3, importManager);
    _builder.append(_compileType_3, "");
    _builder.append(" ");
    String _name_8 = m.getName();
    _builder.append(_name_8, "");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_3 = m.getArgs();
      boolean _hasElements_3 = false;
      for(final PojoMethodArg ma_3 : _args_3) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_4 = ma_3.getType();
        CharSequence _compileType_4 = this.compileType(_type_4, importManager);
        _builder.append(_compileType_4, "");
        _builder.append(" ");
        String _name_9 = ma_3.getName();
        _builder.append(_name_9, "");
      }
    }
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    String _name_10 = m.getName();
    _builder.append(_name_10, "	");
    _builder.append("(sqlSessionFactory.getSqlSession(), ");
    {
      EList<PojoMethodArg> _args_4 = m.getArgs();
      boolean _hasElements_4 = false;
      for(final PojoMethodArg ma_4 : _args_4) {
        if (!_hasElements_4) {
          _hasElements_4 = true;
        } else {
          _builder.appendImmediate(", ", "	");
        }
        String _name_11 = ma_4.getName();
        _builder.append(_name_11, "	");
      }
    }
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_5 = m.getType();
    CharSequence _compileType_5 = this.compileType(_type_5, importManager);
    _builder.append(_compileType_5, "");
    _builder.append(" ");
    String _name_12 = m.getName();
    _builder.append(_name_12, "");
    _builder.append("(SqlSession sqlSession, ");
    {
      EList<PojoMethodArg> _args_5 = m.getArgs();
      boolean _hasElements_5 = false;
      for(final PojoMethodArg ma_5 : _args_5) {
        if (!_hasElements_5) {
          _hasElements_5 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_6 = ma_5.getType();
        CharSequence _compileType_6 = this.compileType(_type_6, importManager);
        _builder.append(_compileType_6, "");
        _builder.append(" ");
        String _name_13 = ma_5.getName();
        _builder.append(_name_13, "");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return ");
    String _name_14 = m.getName();
    _builder.append(_name_14, "  ");
    _builder.append("(sqlSession, ");
    {
      EList<PojoMethodArg> _args_6 = m.getArgs();
      boolean _hasElements_6 = false;
      for(final PojoMethodArg ma_6 : _args_6) {
        if (!_hasElements_6) {
          _hasElements_6 = true;
        } else {
          _builder.appendImmediate(", ", "  ");
        }
        String _name_15 = ma_6.getName();
        _builder.append(_name_15, "  ");
      }
    }
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_7 = m.getType();
    CharSequence _compileType_7 = this.compileType(_type_7, importManager);
    _builder.append(_compileType_7, "");
    _builder.append(" ");
    String _name_16 = m.getName();
    _builder.append(_name_16, "");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_7 = m.getArgs();
      boolean _hasElements_7 = false;
      for(final PojoMethodArg ma_7 : _args_7) {
        if (!_hasElements_7) {
          _hasElements_7 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_8 = ma_7.getType();
        CharSequence _compileType_8 = this.compileType(_type_8, importManager);
        _builder.append(_compileType_8, "");
        _builder.append(" ");
        String _name_17 = ma_7.getName();
        _builder.append(_name_17, "");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return ");
    String _name_18 = m.getName();
    _builder.append(_name_18, "  ");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_8 = m.getArgs();
      boolean _hasElements_8 = false;
      for(final PojoMethodArg ma_8 : _args_8) {
        if (!_hasElements_8) {
          _hasElements_8 = true;
        } else {
          _builder.appendImmediate(", ", "  ");
        }
        String _name_19 = ma_8.getName();
        _builder.append(_name_19, "  ");
      }
    }
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileCallUpdate(final PojoDao d, final PojoMethod m, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public int ");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.append("(SqlSession sqlSession, ");
    {
      EList<PojoMethodArg> _args = m.getArgs();
      boolean _hasElements = false;
      for(final PojoMethodArg ma : _args) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type = ma.getType();
        CharSequence _compileType = this.compileType(_type, importManager);
        _builder.append(_compileType, "");
        _builder.append(" ");
        String _name_1 = ma.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"");
    String _name_2 = m.getName();
    _builder.append(_name_2, "    ");
    _builder.append(": \" + ");
    {
      EList<PojoMethodArg> _args_1 = m.getArgs();
      boolean _hasElements_1 = false;
      for(final PojoMethodArg ma_1 : _args_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(" + \" \" ", "    ");
        }
        String _name_3 = ma_1.getName();
        _builder.append(_name_3, "    ");
      }
    }
    _builder.append(" + \" \" + sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("SqlProcedureEngine sqlProc");
    String _name_4 = m.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_4);
    _builder.append(_firstUpper, "  ");
    _builder.append(" = sqlEngineFactory.getCheckedProcedureEngine(\"PROC_");
    String _dbName = Utils.dbName(m);
    _builder.append(_dbName, "  ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("int count = sqlProc");
    String _name_5 = m.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_5);
    _builder.append(_firstUpper_1, "  ");
    _builder.append(".callUpdate(sqlSession, ");
    {
      EList<PojoMethodArg> _args_2 = m.getArgs();
      boolean _hasElements_2 = false;
      for(final PojoMethodArg ma_2 : _args_2) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate(", ", "  ");
        }
        String _name_6 = ma_2.getName();
        _builder.append(_name_6, "  ");
      }
    }
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"");
    String _name_7 = m.getName();
    _builder.append(_name_7, "    ");
    _builder.append(" result: \" + count);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return count;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public int ");
    String _name_8 = m.getName();
    _builder.append(_name_8, "");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_3 = m.getArgs();
      boolean _hasElements_3 = false;
      for(final PojoMethodArg ma_3 : _args_3) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_1 = ma_3.getType();
        CharSequence _compileType_1 = this.compileType(_type_1, importManager);
        _builder.append(_compileType_1, "");
        _builder.append(" ");
        String _name_9 = ma_3.getName();
        _builder.append(_name_9, "");
      }
    }
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    String _name_10 = m.getName();
    _builder.append(_name_10, "	");
    _builder.append("(sqlSessionFactory.getSqlSession(), ");
    {
      EList<PojoMethodArg> _args_4 = m.getArgs();
      boolean _hasElements_4 = false;
      for(final PojoMethodArg ma_4 : _args_4) {
        if (!_hasElements_4) {
          _hasElements_4 = true;
        } else {
          _builder.appendImmediate(", ", "	");
        }
        String _name_11 = ma_4.getName();
        _builder.append(_name_11, "	");
      }
    }
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public int ");
    String _name_12 = m.getName();
    _builder.append(_name_12, "");
    _builder.append("(SqlSession sqlSession, ");
    {
      EList<PojoMethodArg> _args_5 = m.getArgs();
      boolean _hasElements_5 = false;
      for(final PojoMethodArg ma_5 : _args_5) {
        if (!_hasElements_5) {
          _hasElements_5 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_2 = ma_5.getType();
        CharSequence _compileType_2 = this.compileType(_type_2, importManager);
        _builder.append(_compileType_2, "");
        _builder.append(" ");
        String _name_13 = ma_5.getName();
        _builder.append(_name_13, "");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return ");
    String _name_14 = m.getName();
    _builder.append(_name_14, "  ");
    _builder.append("(sqlSession, ");
    {
      EList<PojoMethodArg> _args_6 = m.getArgs();
      boolean _hasElements_6 = false;
      for(final PojoMethodArg ma_6 : _args_6) {
        if (!_hasElements_6) {
          _hasElements_6 = true;
        } else {
          _builder.appendImmediate(", ", "  ");
        }
        String _name_15 = ma_6.getName();
        _builder.append(_name_15, "  ");
      }
    }
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public int ");
    String _name_16 = m.getName();
    _builder.append(_name_16, "");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_7 = m.getArgs();
      boolean _hasElements_7 = false;
      for(final PojoMethodArg ma_7 : _args_7) {
        if (!_hasElements_7) {
          _hasElements_7 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_3 = ma_7.getType();
        CharSequence _compileType_3 = this.compileType(_type_3, importManager);
        _builder.append(_compileType_3, "");
        _builder.append(" ");
        String _name_17 = ma_7.getName();
        _builder.append(_name_17, "");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return ");
    String _name_18 = m.getName();
    _builder.append(_name_18, "  ");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_8 = m.getArgs();
      boolean _hasElements_8 = false;
      for(final PojoMethodArg ma_8 : _args_8) {
        if (!_hasElements_8) {
          _hasElements_8 = true;
        } else {
          _builder.appendImmediate(", ", "  ");
        }
        String _name_19 = ma_8.getName();
        _builder.append(_name_19, "  ");
      }
    }
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileCallSelectFunction(final PojoDao d, final PojoMethod m, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type = m.getType();
    CharSequence _compileType = this.compileType(_type, importManager);
    _builder.append(_compileType, "");
    _builder.append(" ");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.append("(SqlSession sqlSession, ");
    {
      EList<PojoMethodArg> _args = m.getArgs();
      boolean _hasElements = false;
      for(final PojoMethodArg ma : _args) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_1 = ma.getType();
        CharSequence _compileType_1 = this.compileType(_type_1, importManager);
        _builder.append(_compileType_1, "");
        _builder.append(" ");
        String _name_1 = ma.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"");
    String _name_2 = m.getName();
    _builder.append(_name_2, "    ");
    _builder.append(": \" + ");
    {
      EList<PojoMethodArg> _args_1 = m.getArgs();
      boolean _hasElements_1 = false;
      for(final PojoMethodArg ma_1 : _args_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(" + \" \" ", "    ");
        }
        String _name_3 = ma_1.getName();
        _builder.append(_name_3, "    ");
      }
    }
    _builder.append(" + \" \" + sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("SqlQueryEngine sqlFun");
    String _name_4 = m.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_4);
    _builder.append(_firstUpper, "  ");
    _builder.append(" = sqlEngineFactory.getCheckedQueryEngine(\"FUN_");
    String _dbName = Utils.dbName(m);
    _builder.append(_dbName, "  ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("java.util.List<");
    EList<PojoMethodArg> _args_2 = m.getArgs();
    PojoMethodArg _get = _args_2.get(0);
    PojoType _type_2 = _get.getType();
    CharSequence _compileType_2 = this.compileType(_type_2, importManager);
    _builder.append(_compileType_2, "  ");
    _builder.append("> list = sqlFun");
    String _name_5 = m.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_5);
    _builder.append(_firstUpper_1, "  ");
    _builder.append(".query(sqlSession, ");
    EList<PojoMethodArg> _args_3 = m.getArgs();
    PojoMethodArg _get_1 = _args_3.get(0);
    PojoType _type_3 = _get_1.getType();
    CharSequence _compileType_3 = this.compileType(_type_3, importManager);
    _builder.append(_compileType_3, "  ");
    _builder.append(".class, ");
    {
      EList<PojoMethodArg> _args_4 = m.getArgs();
      boolean _hasElements_2 = false;
      for(final PojoMethodArg ma_2 : _args_4) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate(", ", "  ");
        }
        String _name_6 = ma_2.getName();
        _builder.append(_name_6, "  ");
      }
    }
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"");
    String _name_7 = m.getName();
    _builder.append(_name_7, "    ");
    _builder.append(" result: \" + list);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return (list != null && !list.isEmpty()) ? list.get(0).getResult() : null;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_4 = m.getType();
    CharSequence _compileType_4 = this.compileType(_type_4, importManager);
    _builder.append(_compileType_4, "");
    _builder.append(" ");
    String _name_8 = m.getName();
    _builder.append(_name_8, "");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_5 = m.getArgs();
      boolean _hasElements_3 = false;
      for(final PojoMethodArg ma_3 : _args_5) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_5 = ma_3.getType();
        CharSequence _compileType_5 = this.compileType(_type_5, importManager);
        _builder.append(_compileType_5, "");
        _builder.append(" ");
        String _name_9 = ma_3.getName();
        _builder.append(_name_9, "");
      }
    }
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    String _name_10 = m.getName();
    _builder.append(_name_10, "	");
    _builder.append("(sqlSessionFactory.getSqlSession(), ");
    {
      EList<PojoMethodArg> _args_6 = m.getArgs();
      boolean _hasElements_4 = false;
      for(final PojoMethodArg ma_4 : _args_6) {
        if (!_hasElements_4) {
          _hasElements_4 = true;
        } else {
          _builder.appendImmediate(", ", "	");
        }
        String _name_11 = ma_4.getName();
        _builder.append(_name_11, "	");
      }
    }
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_6 = m.getType();
    CharSequence _compileType_6 = this.compileType(_type_6, importManager);
    _builder.append(_compileType_6, "");
    _builder.append(" ");
    String _name_12 = m.getName();
    _builder.append(_name_12, "");
    _builder.append("(SqlSession sqlSession, ");
    {
      EList<PojoMethodArg> _args_7 = m.getArgs();
      boolean _hasElements_5 = false;
      for(final PojoMethodArg ma_5 : _args_7) {
        if (!_hasElements_5) {
          _hasElements_5 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_7 = ma_5.getType();
        CharSequence _compileType_7 = this.compileType(_type_7, importManager);
        _builder.append(_compileType_7, "");
        _builder.append(" ");
        String _name_13 = ma_5.getName();
        _builder.append(_name_13, "");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return ");
    String _name_14 = m.getName();
    _builder.append(_name_14, "  ");
    _builder.append("(sqlSession, ");
    {
      EList<PojoMethodArg> _args_8 = m.getArgs();
      boolean _hasElements_6 = false;
      for(final PojoMethodArg ma_6 : _args_8) {
        if (!_hasElements_6) {
          _hasElements_6 = true;
        } else {
          _builder.appendImmediate(", ", "  ");
        }
        String _name_15 = ma_6.getName();
        _builder.append(_name_15, "  ");
      }
    }
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_8 = m.getType();
    CharSequence _compileType_8 = this.compileType(_type_8, importManager);
    _builder.append(_compileType_8, "");
    _builder.append(" ");
    String _name_16 = m.getName();
    _builder.append(_name_16, "");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_9 = m.getArgs();
      boolean _hasElements_7 = false;
      for(final PojoMethodArg ma_7 : _args_9) {
        if (!_hasElements_7) {
          _hasElements_7 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_9 = ma_7.getType();
        CharSequence _compileType_9 = this.compileType(_type_9, importManager);
        _builder.append(_compileType_9, "");
        _builder.append(" ");
        String _name_17 = ma_7.getName();
        _builder.append(_name_17, "");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return ");
    String _name_18 = m.getName();
    _builder.append(_name_18, "  ");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_10 = m.getArgs();
      boolean _hasElements_8 = false;
      for(final PojoMethodArg ma_8 : _args_10) {
        if (!_hasElements_8) {
          _hasElements_8 = true;
        } else {
          _builder.appendImmediate(", ", "  ");
        }
        String _name_19 = ma_8.getName();
        _builder.append(_name_19, "  ");
      }
    }
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileInsert(final PojoDao d, final PojoEntity e, final PojoEntity pe, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" insert(SqlSession sqlSession, ");
    String _name_1 = e.getName();
    _builder.append(_name_1, "");
    _builder.append(" ");
    String _name_2 = e.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower, "");
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"insert ");
    String _name_3 = e.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
    _builder.append(_firstLower_1, "    ");
    _builder.append(": \" + ");
    String _name_4 = e.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_4);
    _builder.append(_firstLower_2, "    ");
    _builder.append(" + \" \" + sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("SqlCrudEngine sqlInsert");
    String _name_5 = e.getName();
    _builder.append(_name_5, "  ");
    _builder.append(" = sqlEngineFactory.getCheckedCrudEngine(\"INSERT_");
    String _dbName = Utils.dbName(e);
    _builder.append(_dbName, "  ");
    _builder.append("\");");
    {
      boolean _notEquals = (!Objects.equal(pe, null));
      if (_notEquals) {
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("SqlCrudEngine sqlInsert");
        String _name_6 = pe.getName();
        _builder.append(_name_6, "  ");
        _builder.append(" = sqlEngineFactory.getCheckedCrudEngine(\"INSERT_");
        String _dbName_1 = Utils.dbName(pe);
        _builder.append(_dbName_1, "  ");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("int count = sqlInsert");
        String _name_7 = pe.getName();
        _builder.append(_name_7, "  ");
        _builder.append(".insert(sqlSession, ");
        String _name_8 = e.getName();
        String _firstLower_3 = StringExtensions.toFirstLower(_name_8);
        _builder.append(_firstLower_3, "  ");
        _builder.append(", sqlControl);");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("if (count > 0) {");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("  ");
        _builder.append("sqlInsert");
        String _name_9 = e.getName();
        _builder.append(_name_9, "    ");
        _builder.append(".insert(sqlSession, ");
        String _name_10 = e.getName();
        String _firstLower_4 = StringExtensions.toFirstLower(_name_10);
        _builder.append(_firstLower_4, "    ");
        _builder.append(", sqlControl);");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("}");
      } else {
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("int count = sqlInsert");
        String _name_11 = e.getName();
        _builder.append(_name_11, "  ");
        _builder.append(".insert(sqlSession, ");
        String _name_12 = e.getName();
        String _firstLower_5 = StringExtensions.toFirstLower(_name_12);
        _builder.append(_firstLower_5, "  ");
        _builder.append(", sqlControl);");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"insert ");
    String _name_13 = e.getName();
    String _firstLower_6 = StringExtensions.toFirstLower(_name_13);
    _builder.append(_firstLower_6, "    ");
    _builder.append(" result: \" + count + \" \" + ");
    String _name_14 = e.getName();
    String _firstLower_7 = StringExtensions.toFirstLower(_name_14);
    _builder.append(_firstLower_7, "    ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return (count > 0) ? ");
    String _name_15 = e.getName();
    String _firstLower_8 = StringExtensions.toFirstLower(_name_15);
    _builder.append(_firstLower_8, "  ");
    _builder.append(" : null;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    String _name_16 = e.getName();
    _builder.append(_name_16, "");
    _builder.append(" insert(");
    String _name_17 = e.getName();
    _builder.append(_name_17, "");
    _builder.append(" ");
    String _name_18 = e.getName();
    String _firstLower_9 = StringExtensions.toFirstLower(_name_18);
    _builder.append(_firstLower_9, "");
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return insert(sqlSessionFactory.getSqlSession(), ");
    String _name_19 = e.getName();
    String _firstLower_10 = StringExtensions.toFirstLower(_name_19);
    _builder.append(_firstLower_10, "	");
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    String _name_20 = e.getName();
    _builder.append(_name_20, "");
    _builder.append(" insert(SqlSession sqlSession, ");
    String _name_21 = e.getName();
    _builder.append(_name_21, "");
    _builder.append(" ");
    String _name_22 = e.getName();
    String _firstLower_11 = StringExtensions.toFirstLower(_name_22);
    _builder.append(_firstLower_11, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return insert(sqlSession, ");
    String _name_23 = e.getName();
    String _firstLower_12 = StringExtensions.toFirstLower(_name_23);
    _builder.append(_firstLower_12, "  ");
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    String _name_24 = e.getName();
    _builder.append(_name_24, "");
    _builder.append(" insert(");
    String _name_25 = e.getName();
    _builder.append(_name_25, "");
    _builder.append(" ");
    String _name_26 = e.getName();
    String _firstLower_13 = StringExtensions.toFirstLower(_name_26);
    _builder.append(_firstLower_13, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return insert(");
    String _name_27 = e.getName();
    String _firstLower_14 = StringExtensions.toFirstLower(_name_27);
    _builder.append(_firstLower_14, "  ");
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileGet(final PojoDao d, final PojoEntity e, final Map<String,List<PojoMethodArg>> toInits, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" get(SqlSession sqlSession, ");
    String _name_1 = e.getName();
    _builder.append(_name_1, "");
    _builder.append(" ");
    String _name_2 = e.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower, "");
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"get get: \" + ");
    String _name_3 = e.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
    _builder.append(_firstLower_1, "    ");
    _builder.append(" + \" \" + sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("SqlCrudEngine sqlGetEngine");
    String _name_4 = e.getName();
    _builder.append(_name_4, "  ");
    _builder.append(" = sqlEngineFactory.getCheckedCrudEngine(\"GET_");
    String _dbName = Utils.dbName(e);
    _builder.append(_dbName, "  ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    {
      boolean _isEmpty = toInits.isEmpty();
      if (_isEmpty) {
        _builder.append("//");
      }
    }
    _builder.append("sqlControl = getMoreResultClasses(");
    String _name_5 = e.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_5);
    _builder.append(_firstLower_2, "  ");
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    String _name_6 = e.getName();
    _builder.append(_name_6, "  ");
    _builder.append(" ");
    String _name_7 = e.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_7);
    _builder.append(_firstLower_3, "  ");
    _builder.append("Got = sqlGetEngine");
    String _name_8 = e.getName();
    _builder.append(_name_8, "  ");
    _builder.append(".get(sqlSession, ");
    String _name_9 = e.getName();
    _builder.append(_name_9, "  ");
    _builder.append(".class, ");
    String _name_10 = e.getName();
    String _firstLower_4 = StringExtensions.toFirstLower(_name_10);
    _builder.append(_firstLower_4, "  ");
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"get ");
    String _name_11 = e.getName();
    String _firstLower_5 = StringExtensions.toFirstLower(_name_11);
    _builder.append(_firstLower_5, "    ");
    _builder.append(" result: \" + ");
    String _name_12 = e.getName();
    String _firstLower_6 = StringExtensions.toFirstLower(_name_12);
    _builder.append(_firstLower_6, "    ");
    _builder.append("Got);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return ");
    String _name_13 = e.getName();
    String _firstLower_7 = StringExtensions.toFirstLower(_name_13);
    _builder.append(_firstLower_7, "  ");
    _builder.append("Got;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public ");
    String _name_14 = e.getName();
    _builder.append(_name_14, "");
    _builder.append(" get(");
    String _name_15 = e.getName();
    _builder.append(_name_15, "");
    _builder.append(" ");
    String _name_16 = e.getName();
    String _firstLower_8 = StringExtensions.toFirstLower(_name_16);
    _builder.append(_firstLower_8, "");
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return get(sqlSessionFactory.getSqlSession(), ");
    String _name_17 = e.getName();
    String _firstLower_9 = StringExtensions.toFirstLower(_name_17);
    _builder.append(_firstLower_9, "	");
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    String _name_18 = e.getName();
    _builder.append(_name_18, "");
    _builder.append(" get(SqlSession sqlSession, ");
    String _name_19 = e.getName();
    _builder.append(_name_19, "");
    _builder.append(" ");
    String _name_20 = e.getName();
    String _firstLower_10 = StringExtensions.toFirstLower(_name_20);
    _builder.append(_firstLower_10, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return get(sqlSession, ");
    String _name_21 = e.getName();
    String _firstLower_11 = StringExtensions.toFirstLower(_name_21);
    _builder.append(_firstLower_11, "  ");
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    String _name_22 = e.getName();
    _builder.append(_name_22, "");
    _builder.append(" get(");
    String _name_23 = e.getName();
    _builder.append(_name_23, "");
    _builder.append(" ");
    String _name_24 = e.getName();
    String _firstLower_12 = StringExtensions.toFirstLower(_name_24);
    _builder.append(_firstLower_12, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return get(");
    String _name_25 = e.getName();
    String _firstLower_13 = StringExtensions.toFirstLower(_name_25);
    _builder.append(_firstLower_13, "  ");
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileUpdate(final PojoDao d, final PojoEntity e, final PojoEntity pe, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public int update(SqlSession sqlSession, ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _name_1 = e.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_1);
    _builder.append(_firstLower, "");
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"update ");
    String _name_2 = e.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower_1, "    ");
    _builder.append(": \" + ");
    String _name_3 = e.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_3);
    _builder.append(_firstLower_2, "    ");
    _builder.append(" + \" \" + sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("SqlCrudEngine sqlUpdateEngine");
    String _name_4 = e.getName();
    _builder.append(_name_4, "  ");
    _builder.append(" = sqlEngineFactory.getCheckedCrudEngine(\"UPDATE_");
    String _dbName = Utils.dbName(e);
    _builder.append(_dbName, "  ");
    _builder.append("\");");
    {
      boolean _notEquals = (!Objects.equal(pe, null));
      if (_notEquals) {
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("SqlCrudEngine sqlUpdate");
        String _name_5 = pe.getName();
        _builder.append(_name_5, "  ");
        _builder.append(" = sqlEngineFactory.getCheckedCrudEngine(\"UPDATE_");
        String _dbName_1 = Utils.dbName(pe);
        _builder.append(_dbName_1, "  ");
        _builder.append("\");");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("int count = sqlUpdateEngine");
    String _name_6 = e.getName();
    _builder.append(_name_6, "  ");
    _builder.append(".update(sqlSession, ");
    String _name_7 = e.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_7);
    _builder.append(_firstLower_3, "  ");
    _builder.append(", sqlControl);");
    {
      boolean _notEquals_1 = (!Objects.equal(pe, null));
      if (_notEquals_1) {
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("if (count > 0) {");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("\t");
        _builder.append("sqlUpdate");
        String _name_8 = pe.getName();
        _builder.append(_name_8, "  	");
        _builder.append(".update(sqlSession, ");
        String _name_9 = e.getName();
        String _firstLower_4 = StringExtensions.toFirstLower(_name_9);
        _builder.append(_firstLower_4, "  	");
        _builder.append(", sqlControl);");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("}");
      }
    }
    final PojoProperty f = Utils.getOptLock(e);
    {
      boolean _notEquals_2 = (!Objects.equal(f, null));
      if (_notEquals_2) {
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("if (count > 0) {");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("\t");
        String _name_10 = e.getName();
        String _firstLower_5 = StringExtensions.toFirstLower(_name_10);
        _builder.append(_firstLower_5, "  	");
        _builder.append(".set");
        String _name_11 = f.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_11);
        _builder.append(_firstUpper, "  	");
        _builder.append("(");
        String _name_12 = e.getName();
        String _firstLower_6 = StringExtensions.toFirstLower(_name_12);
        _builder.append(_firstLower_6, "  	");
        _builder.append(".get");
        String _name_13 = f.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_13);
        _builder.append(_firstUpper_1, "  	");
        _builder.append("() + 1);");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"update ");
    String _name_14 = e.getName();
    String _firstLower_7 = StringExtensions.toFirstLower(_name_14);
    _builder.append(_firstLower_7, "    ");
    _builder.append(" result count: \" + count);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return count;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public int update(");
    String _name_15 = e.getName();
    _builder.append(_name_15, "");
    _builder.append(" ");
    String _name_16 = e.getName();
    String _firstLower_8 = StringExtensions.toFirstLower(_name_16);
    _builder.append(_firstLower_8, "");
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return update(sqlSessionFactory.getSqlSession(), ");
    String _name_17 = e.getName();
    String _firstLower_9 = StringExtensions.toFirstLower(_name_17);
    _builder.append(_firstLower_9, "	");
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public int update(SqlSession sqlSession, ");
    String _name_18 = e.getName();
    _builder.append(_name_18, "");
    _builder.append(" ");
    String _name_19 = e.getName();
    String _firstLower_10 = StringExtensions.toFirstLower(_name_19);
    _builder.append(_firstLower_10, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return update(sqlSession, ");
    String _name_20 = e.getName();
    String _firstLower_11 = StringExtensions.toFirstLower(_name_20);
    _builder.append(_firstLower_11, "  ");
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public int update(");
    String _name_21 = e.getName();
    _builder.append(_name_21, "");
    _builder.append(" ");
    String _name_22 = e.getName();
    String _firstLower_12 = StringExtensions.toFirstLower(_name_22);
    _builder.append(_firstLower_12, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return update(");
    String _name_23 = e.getName();
    String _firstLower_13 = StringExtensions.toFirstLower(_name_23);
    _builder.append(_firstLower_13, "  ");
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileDelete(final PojoDao d, final PojoEntity e, final PojoEntity pe, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public int delete(SqlSession sqlSession, ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _name_1 = e.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_1);
    _builder.append(_firstLower, "");
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"delete ");
    String _name_2 = e.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower_1, "    ");
    _builder.append(": \" + ");
    String _name_3 = e.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_3);
    _builder.append(_firstLower_2, "    ");
    _builder.append(" + \" \" + sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("SqlCrudEngine sqlDeleteEngine");
    String _name_4 = e.getName();
    _builder.append(_name_4, "  ");
    _builder.append(" = sqlEngineFactory.getCheckedCrudEngine(\"DELETE_");
    String _dbName = Utils.dbName(e);
    _builder.append(_dbName, "  ");
    _builder.append("\");");
    {
      boolean _notEquals = (!Objects.equal(pe, null));
      if (_notEquals) {
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("SqlCrudEngine sqlDelete");
        String _name_5 = pe.getName();
        _builder.append(_name_5, "  ");
        _builder.append(" = sqlEngineFactory.getCheckedCrudEngine(\"DELETE_");
        String _dbName_1 = Utils.dbName(pe);
        _builder.append(_dbName_1, "  ");
        _builder.append("\");");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("int count = sqlDeleteEngine");
    String _name_6 = e.getName();
    _builder.append(_name_6, "  ");
    _builder.append(".delete(sqlSession, ");
    String _name_7 = e.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_7);
    _builder.append(_firstLower_3, "  ");
    _builder.append(", sqlControl);");
    {
      boolean _notEquals_1 = (!Objects.equal(pe, null));
      if (_notEquals_1) {
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("if (count > 0) {");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("\t");
        _builder.append("sqlDelete");
        String _name_8 = pe.getName();
        _builder.append(_name_8, "  	");
        _builder.append(".delete(sqlSession, ");
        String _name_9 = e.getName();
        String _firstLower_4 = StringExtensions.toFirstLower(_name_9);
        _builder.append(_firstLower_4, "  	");
        _builder.append(", sqlControl);");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("}");
      }
    }
    final PojoProperty f = Utils.getOptLock(e);
    {
      boolean _notEquals_2 = (!Objects.equal(f, null));
      if (_notEquals_2) {
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("if (count > 0) {");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("\t");
        String _name_10 = e.getName();
        String _firstLower_5 = StringExtensions.toFirstLower(_name_10);
        _builder.append(_firstLower_5, "  	");
        _builder.append(".set");
        String _name_11 = f.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_11);
        _builder.append(_firstUpper, "  	");
        _builder.append("(");
        String _name_12 = e.getName();
        String _firstLower_6 = StringExtensions.toFirstLower(_name_12);
        _builder.append(_firstLower_6, "  	");
        _builder.append(".get");
        String _name_13 = f.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_13);
        _builder.append(_firstUpper_1, "  	");
        _builder.append("() + 1);");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"delete ");
    String _name_14 = e.getName();
    String _firstLower_7 = StringExtensions.toFirstLower(_name_14);
    _builder.append(_firstLower_7, "    ");
    _builder.append(" result count: \" + count);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return count;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public int delete(");
    String _name_15 = e.getName();
    _builder.append(_name_15, "");
    _builder.append(" ");
    String _name_16 = e.getName();
    String _firstLower_8 = StringExtensions.toFirstLower(_name_16);
    _builder.append(_firstLower_8, "");
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return delete(sqlSessionFactory.getSqlSession(), ");
    String _name_17 = e.getName();
    String _firstLower_9 = StringExtensions.toFirstLower(_name_17);
    _builder.append(_firstLower_9, "	");
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public int delete(SqlSession sqlSession, ");
    String _name_18 = e.getName();
    _builder.append(_name_18, "");
    _builder.append(" ");
    String _name_19 = e.getName();
    String _firstLower_10 = StringExtensions.toFirstLower(_name_19);
    _builder.append(_firstLower_10, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return delete(sqlSession, ");
    String _name_20 = e.getName();
    String _firstLower_11 = StringExtensions.toFirstLower(_name_20);
    _builder.append(_firstLower_11, "  ");
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public int delete(");
    String _name_21 = e.getName();
    _builder.append(_name_21, "");
    _builder.append(" ");
    String _name_22 = e.getName();
    String _firstLower_12 = StringExtensions.toFirstLower(_name_22);
    _builder.append(_firstLower_12, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return delete(");
    String _name_23 = e.getName();
    String _firstLower_13 = StringExtensions.toFirstLower(_name_23);
    _builder.append(_firstLower_13, "  ");
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileList(final PojoDao d, final PojoEntity e, final Map<String,List<PojoMethodArg>> toInits, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public List<");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append("> list(SqlSession sqlSession, ");
    String _name_1 = e.getName();
    _builder.append(_name_1, "");
    _builder.append(" ");
    String _name_2 = e.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower, "");
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"list ");
    String _name_3 = e.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
    _builder.append(_firstLower_1, "    ");
    _builder.append(": \" + ");
    String _name_4 = e.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_4);
    _builder.append(_firstLower_2, "    ");
    _builder.append(" + \" \" + sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("SqlQueryEngine sqlEngine");
    String _name_5 = e.getName();
    _builder.append(_name_5, "  ");
    _builder.append(" = sqlEngineFactory.getCheckedQueryEngine(\"SELECT_");
    String _dbName = Utils.dbName(e);
    _builder.append(_dbName, "  ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    {
      boolean _isEmpty = toInits.isEmpty();
      if (_isEmpty) {
        _builder.append("//");
      }
    }
    _builder.append("sqlControl = getMoreResultClasses(");
    String _name_6 = e.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_6);
    _builder.append(_firstLower_3, "  ");
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("List<");
    String _name_7 = e.getName();
    _builder.append(_name_7, "  ");
    _builder.append("> ");
    String _name_8 = e.getName();
    String _firstLower_4 = StringExtensions.toFirstLower(_name_8);
    _builder.append(_firstLower_4, "  ");
    _builder.append("List = sqlEngine");
    String _name_9 = e.getName();
    _builder.append(_name_9, "  ");
    _builder.append(".query(sqlSession, ");
    String _name_10 = e.getName();
    _builder.append(_name_10, "  ");
    _builder.append(".class, ");
    String _name_11 = e.getName();
    String _firstLower_5 = StringExtensions.toFirstLower(_name_11);
    _builder.append(_firstLower_5, "  ");
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"list ");
    String _name_12 = e.getName();
    String _firstLower_6 = StringExtensions.toFirstLower(_name_12);
    _builder.append(_firstLower_6, "    ");
    _builder.append(" size: \" + ((");
    String _name_13 = e.getName();
    String _firstLower_7 = StringExtensions.toFirstLower(_name_13);
    _builder.append(_firstLower_7, "    ");
    _builder.append("List != null) ? ");
    String _name_14 = e.getName();
    String _firstLower_8 = StringExtensions.toFirstLower(_name_14);
    _builder.append(_firstLower_8, "    ");
    _builder.append("List.size() : \"null\"));");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return ");
    String _name_15 = e.getName();
    String _firstLower_9 = StringExtensions.toFirstLower(_name_15);
    _builder.append(_firstLower_9, "  ");
    _builder.append("List;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public List<");
    String _name_16 = e.getName();
    _builder.append(_name_16, "");
    _builder.append("> list(");
    String _name_17 = e.getName();
    _builder.append(_name_17, "");
    _builder.append(" ");
    String _name_18 = e.getName();
    String _firstLower_10 = StringExtensions.toFirstLower(_name_18);
    _builder.append(_firstLower_10, "");
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return list(sqlSessionFactory.getSqlSession(), ");
    String _name_19 = e.getName();
    String _firstLower_11 = StringExtensions.toFirstLower(_name_19);
    _builder.append(_firstLower_11, "	");
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public List<");
    String _name_20 = e.getName();
    _builder.append(_name_20, "");
    _builder.append("> list(SqlSession sqlSession, ");
    String _name_21 = e.getName();
    _builder.append(_name_21, "");
    _builder.append(" ");
    String _name_22 = e.getName();
    String _firstLower_12 = StringExtensions.toFirstLower(_name_22);
    _builder.append(_firstLower_12, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return list(sqlSession, ");
    String _name_23 = e.getName();
    String _firstLower_13 = StringExtensions.toFirstLower(_name_23);
    _builder.append(_firstLower_13, "  ");
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public List<");
    String _name_24 = e.getName();
    _builder.append(_name_24, "");
    _builder.append("> list(");
    String _name_25 = e.getName();
    _builder.append(_name_25, "");
    _builder.append(" ");
    String _name_26 = e.getName();
    String _firstLower_14 = StringExtensions.toFirstLower(_name_26);
    _builder.append(_firstLower_14, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return list(");
    String _name_27 = e.getName();
    String _firstLower_15 = StringExtensions.toFirstLower(_name_27);
    _builder.append(_firstLower_15, "  ");
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileCount(final PojoDao d, final PojoEntity e, final Map<String,List<PojoMethodArg>> toInits, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public int count(SqlSession sqlSession, ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _name_1 = e.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_1);
    _builder.append(_firstLower, "");
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"count ");
    String _name_2 = e.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower_1, "    ");
    _builder.append(": \" + ");
    String _name_3 = e.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_3);
    _builder.append(_firstLower_2, "    ");
    _builder.append(" + \" \" + sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("SqlQueryEngine sqlEngine");
    String _name_4 = e.getName();
    _builder.append(_name_4, "  ");
    _builder.append(" = sqlEngineFactory.getCheckedQueryEngine(\"SELECT_");
    String _dbName = Utils.dbName(e);
    _builder.append(_dbName, "  ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    {
      boolean _isEmpty = toInits.isEmpty();
      if (_isEmpty) {
        _builder.append("//");
      }
    }
    _builder.append("sqlControl = getMoreResultClasses(");
    String _name_5 = e.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_5);
    _builder.append(_firstLower_3, "  ");
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("int count = sqlEngine");
    String _name_6 = e.getName();
    _builder.append(_name_6, "  ");
    _builder.append(".queryCount(sqlSession, ");
    String _name_7 = e.getName();
    String _firstLower_4 = StringExtensions.toFirstLower(_name_7);
    _builder.append(_firstLower_4, "  ");
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (logger.isTraceEnabled()) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logger.trace(\"count: \" + count);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return count;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public int count(");
    String _name_8 = e.getName();
    _builder.append(_name_8, "");
    _builder.append(" ");
    String _name_9 = e.getName();
    String _firstLower_5 = StringExtensions.toFirstLower(_name_9);
    _builder.append(_firstLower_5, "");
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return count(sqlSessionFactory.getSqlSession(), ");
    String _name_10 = e.getName();
    String _firstLower_6 = StringExtensions.toFirstLower(_name_10);
    _builder.append(_firstLower_6, "	");
    _builder.append(", sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public int count(SqlSession sqlSession, ");
    String _name_11 = e.getName();
    _builder.append(_name_11, "");
    _builder.append(" ");
    String _name_12 = e.getName();
    String _firstLower_7 = StringExtensions.toFirstLower(_name_12);
    _builder.append(_firstLower_7, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return count(sqlSession, ");
    String _name_13 = e.getName();
    String _firstLower_8 = StringExtensions.toFirstLower(_name_13);
    _builder.append(_firstLower_8, "  ");
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public int count(");
    String _name_14 = e.getName();
    _builder.append(_name_14, "");
    _builder.append(" ");
    String _name_15 = e.getName();
    String _firstLower_9 = StringExtensions.toFirstLower(_name_15);
    _builder.append(_firstLower_9, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return count(");
    String _name_16 = e.getName();
    String _firstLower_10 = StringExtensions.toFirstLower(_name_16);
    _builder.append(_firstLower_10, "  ");
    _builder.append(", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileMoreResultClasses(final PojoDao d, final PojoEntity e, final Map<String,List<PojoMethodArg>> toInits, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("SqlControl getMoreResultClasses(");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _name_1 = e.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_1);
    _builder.append(_firstLower, "");
    _builder.append(", SqlControl sqlControl) {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("if (sqlControl != null && sqlControl.getMoreResultClasses() != null)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return sqlControl;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Map<String, Class<?>> moreResultClasses = null;");
    _builder.newLine();
    {
      Set<Entry<String,List<PojoMethodArg>>> _entrySet = toInits.entrySet();
      boolean _hasElements = false;
      for(final Entry<String,List<PojoMethodArg>> f : _entrySet) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        _builder.append("  if (");
        String _name_2 = e.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_2);
        _builder.append(_firstLower_1, "");
        _builder.append(" != null && ");
        String _name_3 = e.getName();
        String _firstLower_2 = StringExtensions.toFirstLower(_name_3);
        _builder.append(_firstLower_2, "");
        _builder.append(".toInit(");
        String _name_4 = e.getName();
        _builder.append(_name_4, "");
        _builder.append(".Association.");
        String _key = f.getKey();
        _builder.append(_key, "");
        _builder.append(".name())) {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("if (moreResultClasses == null)");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("moreResultClasses = new HashMap<String, Class<?>>();");
        _builder.newLine();
        {
          List<PojoMethodArg> _value = f.getValue();
          boolean _hasElements_1 = false;
          for(final PojoMethodArg a : _value) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate("\n", "");
            }
            _builder.append("    moreResultClasses.put(\"");
            String _name_5 = a.getName();
            _builder.append(_name_5, "");
            _builder.append("\", ");
            PojoType _type = a.getType();
            PojoEntity _ref = _type.getRef();
            QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_ref);
            _builder.append(_fullyQualifiedName, "");
            _builder.append(".class);");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("  ");
    _builder.append("if (moreResultClasses != null) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("sqlControl = new SqlStandardControl(sqlControl);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("((SqlStandardControl) sqlControl).setMoreResultClasses(moreResultClasses);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return sqlControl;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileIfx(final PojoDao d) {
    StringConcatenation _builder = new StringConcatenation();
    ImportManager _importManager = new ImportManager(true);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    this.addImplements(d, importManager);
    _builder.newLineIfNotEmpty();
    this.addExtends(d, importManager);
    _builder.newLineIfNotEmpty();
    PojoEntity _pojo = d.getPojo();
    final CharSequence classBody = this.compileIfx(d, _pojo, importManager);
    _builder.newLineIfNotEmpty();
    {
      EObject _eContainer = d.eContainer();
      boolean _notEquals = (!Objects.equal(_eContainer, null));
      if (_notEquals) {
        _builder.append("package ");
        EObject _eContainer_1 = d.eContainer();
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer_1);
        _builder.append(_fullyQualifiedName, "");
        _builder.append(";");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import org.sqlproc.engine.SqlSession;");
    _builder.newLine();
    _builder.append("import org.sqlproc.engine.SqlControl;");
    _builder.newLine();
    _builder.append("import ");
    PojoEntity _pojo_1 = d.getPojo();
    String _completeName = this.completeName(_pojo_1);
    _builder.append(_completeName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(classBody, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileIfx(final PojoDao d, final PojoEntity e, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public interface ");
    String _name = d.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    {
      EList<PojoMethod> _methods = d.getMethods();
      for(final PojoMethod m : _methods) {
        {
          String _name_1 = m.getName();
          boolean _equals = Objects.equal(_name_1, "scaffold");
          if (_equals) {
            CharSequence _compileInsertIfx = this.compileInsertIfx(d, e, importManager);
            _builder.append(_compileInsertIfx, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            CharSequence _compileGetIfx = this.compileGetIfx(d, e, importManager);
            _builder.append(_compileGetIfx, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            CharSequence _compileUpdateIfx = this.compileUpdateIfx(d, e, importManager);
            _builder.append(_compileUpdateIfx, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            CharSequence _compileDeleteIfx = this.compileDeleteIfx(d, e, importManager);
            _builder.append(_compileDeleteIfx, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            CharSequence _compileListIfx = this.compileListIfx(d, e, importManager);
            _builder.append(_compileListIfx, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            CharSequence _compileCountIfx = this.compileCountIfx(d, e, importManager);
            _builder.append(_compileCountIfx, "  ");
            _builder.newLineIfNotEmpty();
          } else {
            boolean _isCallUpdate = Utils.isCallUpdate(m);
            if (_isCallUpdate) {
              _builder.append("  ");
              CharSequence _compileCallUpdateIfx = this.compileCallUpdateIfx(d, m, importManager);
              _builder.append(_compileCallUpdateIfx, "  ");
            } else {
              boolean _isCallFunction = Utils.isCallFunction(m);
              if (_isCallFunction) {
                CharSequence _compileCallFunctionIfx = this.compileCallFunctionIfx(d, m, importManager);
                _builder.append(_compileCallFunctionIfx, "  ");
              } else {
                boolean _or = false;
                boolean _isCallQuery = Utils.isCallQuery(m);
                if (_isCallQuery) {
                  _or = true;
                } else {
                  boolean _isCallQueryFunction = Utils.isCallQueryFunction(m);
                  _or = (_isCallQuery || _isCallQueryFunction);
                }
                if (_or) {
                  boolean _isCallQueryFunction_1 = Utils.isCallQueryFunction(m);
                  CharSequence _compileCallQueryIfx = this.compileCallQueryIfx(d, m, importManager, _isCallQueryFunction_1);
                  _builder.append(_compileCallQueryIfx, "  ");
                } else {
                  boolean _isCallSelectFunction = Utils.isCallSelectFunction(m);
                  if (_isCallSelectFunction) {
                    CharSequence _compileCallSelectFunctionIfx = this.compileCallSelectFunctionIfx(d, m, importManager);
                    _builder.append(_compileCallSelectFunctionIfx, "  ");
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileCallQueryIfx(final PojoDao d, final PojoMethod m, final ImportManager importManager, final boolean isFunction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type = m.getType();
    CharSequence _compileType = this.compileType(_type, importManager);
    _builder.append(_compileType, "");
    _builder.append(" ");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.append("(SqlSession sqlSession, ");
    {
      EList<PojoMethodArg> _args = m.getArgs();
      boolean _hasElements = false;
      for(final PojoMethodArg ma : _args) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_1 = ma.getType();
        CharSequence _compileType_1 = this.compileType(_type_1, importManager);
        _builder.append(_compileType_1, "");
        _builder.append(" ");
        String _name_1 = ma.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_2 = m.getType();
    CharSequence _compileType_2 = this.compileType(_type_2, importManager);
    _builder.append(_compileType_2, "");
    _builder.append(" ");
    String _name_2 = m.getName();
    _builder.append(_name_2, "");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_1 = m.getArgs();
      boolean _hasElements_1 = false;
      for(final PojoMethodArg ma_1 : _args_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_3 = ma_1.getType();
        CharSequence _compileType_3 = this.compileType(_type_3, importManager);
        _builder.append(_compileType_3, "");
        _builder.append(" ");
        String _name_3 = ma_1.getName();
        _builder.append(_name_3, "");
      }
    }
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_4 = m.getType();
    CharSequence _compileType_4 = this.compileType(_type_4, importManager);
    _builder.append(_compileType_4, "");
    _builder.append(" ");
    String _name_4 = m.getName();
    _builder.append(_name_4, "");
    _builder.append("(SqlSession sqlSession, ");
    {
      EList<PojoMethodArg> _args_2 = m.getArgs();
      boolean _hasElements_2 = false;
      for(final PojoMethodArg ma_2 : _args_2) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_5 = ma_2.getType();
        CharSequence _compileType_5 = this.compileType(_type_5, importManager);
        _builder.append(_compileType_5, "");
        _builder.append(" ");
        String _name_5 = ma_2.getName();
        _builder.append(_name_5, "");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_6 = m.getType();
    CharSequence _compileType_6 = this.compileType(_type_6, importManager);
    _builder.append(_compileType_6, "");
    _builder.append(" ");
    String _name_6 = m.getName();
    _builder.append(_name_6, "");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_3 = m.getArgs();
      boolean _hasElements_3 = false;
      for(final PojoMethodArg ma_3 : _args_3) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_7 = ma_3.getType();
        CharSequence _compileType_7 = this.compileType(_type_7, importManager);
        _builder.append(_compileType_7, "");
        _builder.append(" ");
        String _name_7 = ma_3.getName();
        _builder.append(_name_7, "");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileCallFunctionIfx(final PojoDao d, final PojoMethod m, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type = m.getType();
    CharSequence _compileType = this.compileType(_type, importManager);
    _builder.append(_compileType, "");
    _builder.append(" ");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.append("(SqlSession sqlSession, ");
    {
      EList<PojoMethodArg> _args = m.getArgs();
      boolean _hasElements = false;
      for(final PojoMethodArg ma : _args) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_1 = ma.getType();
        CharSequence _compileType_1 = this.compileType(_type_1, importManager);
        _builder.append(_compileType_1, "");
        _builder.append(" ");
        String _name_1 = ma.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_2 = m.getType();
    CharSequence _compileType_2 = this.compileType(_type_2, importManager);
    _builder.append(_compileType_2, "");
    _builder.append(" ");
    String _name_2 = m.getName();
    _builder.append(_name_2, "");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_1 = m.getArgs();
      boolean _hasElements_1 = false;
      for(final PojoMethodArg ma_1 : _args_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_3 = ma_1.getType();
        CharSequence _compileType_3 = this.compileType(_type_3, importManager);
        _builder.append(_compileType_3, "");
        _builder.append(" ");
        String _name_3 = ma_1.getName();
        _builder.append(_name_3, "");
      }
    }
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_4 = m.getType();
    CharSequence _compileType_4 = this.compileType(_type_4, importManager);
    _builder.append(_compileType_4, "");
    _builder.append(" ");
    String _name_4 = m.getName();
    _builder.append(_name_4, "");
    _builder.append("(SqlSession sqlSession, ");
    {
      EList<PojoMethodArg> _args_2 = m.getArgs();
      boolean _hasElements_2 = false;
      for(final PojoMethodArg ma_2 : _args_2) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_5 = ma_2.getType();
        CharSequence _compileType_5 = this.compileType(_type_5, importManager);
        _builder.append(_compileType_5, "");
        _builder.append(" ");
        String _name_5 = ma_2.getName();
        _builder.append(_name_5, "");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_6 = m.getType();
    CharSequence _compileType_6 = this.compileType(_type_6, importManager);
    _builder.append(_compileType_6, "");
    _builder.append(" ");
    String _name_6 = m.getName();
    _builder.append(_name_6, "");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_3 = m.getArgs();
      boolean _hasElements_3 = false;
      for(final PojoMethodArg ma_3 : _args_3) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_7 = ma_3.getType();
        CharSequence _compileType_7 = this.compileType(_type_7, importManager);
        _builder.append(_compileType_7, "");
        _builder.append(" ");
        String _name_7 = ma_3.getName();
        _builder.append(_name_7, "");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileCallUpdateIfx(final PojoDao d, final PojoMethod m, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public int ");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.append("(SqlSession sqlSession, ");
    {
      EList<PojoMethodArg> _args = m.getArgs();
      boolean _hasElements = false;
      for(final PojoMethodArg ma : _args) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type = ma.getType();
        CharSequence _compileType = this.compileType(_type, importManager);
        _builder.append(_compileType, "");
        _builder.append(" ");
        String _name_1 = ma.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public int ");
    String _name_2 = m.getName();
    _builder.append(_name_2, "");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_1 = m.getArgs();
      boolean _hasElements_1 = false;
      for(final PojoMethodArg ma_1 : _args_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_1 = ma_1.getType();
        CharSequence _compileType_1 = this.compileType(_type_1, importManager);
        _builder.append(_compileType_1, "");
        _builder.append(" ");
        String _name_3 = ma_1.getName();
        _builder.append(_name_3, "");
      }
    }
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public int ");
    String _name_4 = m.getName();
    _builder.append(_name_4, "");
    _builder.append("(SqlSession sqlSession, ");
    {
      EList<PojoMethodArg> _args_2 = m.getArgs();
      boolean _hasElements_2 = false;
      for(final PojoMethodArg ma_2 : _args_2) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_2 = ma_2.getType();
        CharSequence _compileType_2 = this.compileType(_type_2, importManager);
        _builder.append(_compileType_2, "");
        _builder.append(" ");
        String _name_5 = ma_2.getName();
        _builder.append(_name_5, "");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public int ");
    String _name_6 = m.getName();
    _builder.append(_name_6, "");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_3 = m.getArgs();
      boolean _hasElements_3 = false;
      for(final PojoMethodArg ma_3 : _args_3) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_3 = ma_3.getType();
        CharSequence _compileType_3 = this.compileType(_type_3, importManager);
        _builder.append(_compileType_3, "");
        _builder.append(" ");
        String _name_7 = ma_3.getName();
        _builder.append(_name_7, "");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileCallSelectFunctionIfx(final PojoDao d, final PojoMethod m, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type = m.getType();
    CharSequence _compileType = this.compileType(_type, importManager);
    _builder.append(_compileType, "");
    _builder.append(" ");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.append("(SqlSession sqlSession, ");
    {
      EList<PojoMethodArg> _args = m.getArgs();
      boolean _hasElements = false;
      for(final PojoMethodArg ma : _args) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_1 = ma.getType();
        CharSequence _compileType_1 = this.compileType(_type_1, importManager);
        _builder.append(_compileType_1, "");
        _builder.append(" ");
        String _name_1 = ma.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_2 = m.getType();
    CharSequence _compileType_2 = this.compileType(_type_2, importManager);
    _builder.append(_compileType_2, "");
    _builder.append(" ");
    String _name_2 = m.getName();
    _builder.append(_name_2, "");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_1 = m.getArgs();
      boolean _hasElements_1 = false;
      for(final PojoMethodArg ma_1 : _args_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_3 = ma_1.getType();
        CharSequence _compileType_3 = this.compileType(_type_3, importManager);
        _builder.append(_compileType_3, "");
        _builder.append(" ");
        String _name_3 = ma_1.getName();
        _builder.append(_name_3, "");
      }
    }
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_4 = m.getType();
    CharSequence _compileType_4 = this.compileType(_type_4, importManager);
    _builder.append(_compileType_4, "");
    _builder.append(" ");
    String _name_4 = m.getName();
    _builder.append(_name_4, "");
    _builder.append("(SqlSession sqlSession, ");
    {
      EList<PojoMethodArg> _args_2 = m.getArgs();
      boolean _hasElements_2 = false;
      for(final PojoMethodArg ma_2 : _args_2) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_5 = ma_2.getType();
        CharSequence _compileType_5 = this.compileType(_type_5, importManager);
        _builder.append(_compileType_5, "");
        _builder.append(" ");
        String _name_5 = ma_2.getName();
        _builder.append(_name_5, "");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public ");
    PojoType _type_6 = m.getType();
    CharSequence _compileType_6 = this.compileType(_type_6, importManager);
    _builder.append(_compileType_6, "");
    _builder.append(" ");
    String _name_6 = m.getName();
    _builder.append(_name_6, "");
    _builder.append("(");
    {
      EList<PojoMethodArg> _args_3 = m.getArgs();
      boolean _hasElements_3 = false;
      for(final PojoMethodArg ma_3 : _args_3) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        PojoType _type_7 = ma_3.getType();
        CharSequence _compileType_7 = this.compileType(_type_7, importManager);
        _builder.append(_compileType_7, "");
        _builder.append(" ");
        String _name_7 = ma_3.getName();
        _builder.append(_name_7, "");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileInsertIfx(final PojoDao d, final PojoEntity e, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" insert(SqlSession sqlSession, ");
    String _name_1 = e.getName();
    _builder.append(_name_1, "");
    _builder.append(" ");
    String _name_2 = e.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower, "");
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public ");
    String _name_3 = e.getName();
    _builder.append(_name_3, "");
    _builder.append(" insert(");
    String _name_4 = e.getName();
    _builder.append(_name_4, "");
    _builder.append(" ");
    String _name_5 = e.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_5);
    _builder.append(_firstLower_1, "");
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public ");
    String _name_6 = e.getName();
    _builder.append(_name_6, "");
    _builder.append(" insert(SqlSession sqlSession, ");
    String _name_7 = e.getName();
    _builder.append(_name_7, "");
    _builder.append(" ");
    String _name_8 = e.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_8);
    _builder.append(_firstLower_2, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public ");
    String _name_9 = e.getName();
    _builder.append(_name_9, "");
    _builder.append(" insert(");
    String _name_10 = e.getName();
    _builder.append(_name_10, "");
    _builder.append(" ");
    String _name_11 = e.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_11);
    _builder.append(_firstLower_3, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileGetIfx(final PojoDao d, final PojoEntity e, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" get(SqlSession sqlSession, ");
    String _name_1 = e.getName();
    _builder.append(_name_1, "");
    _builder.append(" ");
    String _name_2 = e.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower, "");
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public ");
    String _name_3 = e.getName();
    _builder.append(_name_3, "");
    _builder.append(" get(");
    String _name_4 = e.getName();
    _builder.append(_name_4, "");
    _builder.append(" ");
    String _name_5 = e.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_5);
    _builder.append(_firstLower_1, "");
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public ");
    String _name_6 = e.getName();
    _builder.append(_name_6, "");
    _builder.append(" get(SqlSession sqlSession, ");
    String _name_7 = e.getName();
    _builder.append(_name_7, "");
    _builder.append(" ");
    String _name_8 = e.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_8);
    _builder.append(_firstLower_2, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public ");
    String _name_9 = e.getName();
    _builder.append(_name_9, "");
    _builder.append(" get(");
    String _name_10 = e.getName();
    _builder.append(_name_10, "");
    _builder.append(" ");
    String _name_11 = e.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_11);
    _builder.append(_firstLower_3, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileUpdateIfx(final PojoDao d, final PojoEntity e, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public int update(SqlSession sqlSession, ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _name_1 = e.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_1);
    _builder.append(_firstLower, "");
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public int update(");
    String _name_2 = e.getName();
    _builder.append(_name_2, "");
    _builder.append(" ");
    String _name_3 = e.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
    _builder.append(_firstLower_1, "");
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public int update(SqlSession sqlSession, ");
    String _name_4 = e.getName();
    _builder.append(_name_4, "");
    _builder.append(" ");
    String _name_5 = e.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_5);
    _builder.append(_firstLower_2, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public int update(");
    String _name_6 = e.getName();
    _builder.append(_name_6, "");
    _builder.append(" ");
    String _name_7 = e.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_7);
    _builder.append(_firstLower_3, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileDeleteIfx(final PojoDao d, final PojoEntity e, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public int delete(SqlSession sqlSession, ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _name_1 = e.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_1);
    _builder.append(_firstLower, "");
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public int delete(");
    String _name_2 = e.getName();
    _builder.append(_name_2, "");
    _builder.append(" ");
    String _name_3 = e.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
    _builder.append(_firstLower_1, "");
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public int delete(SqlSession sqlSession, ");
    String _name_4 = e.getName();
    _builder.append(_name_4, "");
    _builder.append(" ");
    String _name_5 = e.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_5);
    _builder.append(_firstLower_2, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public int delete(");
    String _name_6 = e.getName();
    _builder.append(_name_6, "");
    _builder.append(" ");
    String _name_7 = e.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_7);
    _builder.append(_firstLower_3, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileListIfx(final PojoDao d, final PojoEntity e, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public List<");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append("> list(SqlSession sqlSession, ");
    String _name_1 = e.getName();
    _builder.append(_name_1, "");
    _builder.append(" ");
    String _name_2 = e.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower, "");
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public List<");
    String _name_3 = e.getName();
    _builder.append(_name_3, "");
    _builder.append("> list(");
    String _name_4 = e.getName();
    _builder.append(_name_4, "");
    _builder.append(" ");
    String _name_5 = e.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_5);
    _builder.append(_firstLower_1, "");
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public List<");
    String _name_6 = e.getName();
    _builder.append(_name_6, "");
    _builder.append("> list(SqlSession sqlSession, ");
    String _name_7 = e.getName();
    _builder.append(_name_7, "");
    _builder.append(" ");
    String _name_8 = e.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_8);
    _builder.append(_firstLower_2, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public List<");
    String _name_9 = e.getName();
    _builder.append(_name_9, "");
    _builder.append("> list(");
    String _name_10 = e.getName();
    _builder.append(_name_10, "");
    _builder.append(" ");
    String _name_11 = e.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_11);
    _builder.append(_firstLower_3, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileCountIfx(final PojoDao d, final PojoEntity e, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("public int count(SqlSession sqlSession, ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _name_1 = e.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_1);
    _builder.append(_firstLower, "");
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public int count(");
    String _name_2 = e.getName();
    _builder.append(_name_2, "");
    _builder.append(" ");
    String _name_3 = e.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
    _builder.append(_firstLower_1, "");
    _builder.append(", SqlControl sqlControl);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public int count(SqlSession sqlSession, ");
    String _name_4 = e.getName();
    _builder.append(_name_4, "");
    _builder.append(" ");
    String _name_5 = e.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_5);
    _builder.append(_firstLower_2, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public int count(");
    String _name_6 = e.getName();
    _builder.append(_name_6, "");
    _builder.append(" ");
    String _name_7 = e.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_7);
    _builder.append(_firstLower_3, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public List<PojoProperty> listFeatures(final PojoEntity e) {
    ArrayList<PojoProperty> _arrayList = new ArrayList<PojoProperty>();
    final ArrayList<PojoProperty> list = _arrayList;
    PojoEntity _superType = Utils.getSuperType(e);
    boolean _notEquals = (!Objects.equal(_superType, null));
    if (_notEquals) {
      PojoEntity _superType_1 = Utils.getSuperType(e);
      List<PojoProperty> _listFeatures = this.listFeatures(_superType_1);
      list.addAll(_listFeatures);
    }
    List<PojoProperty> _listFeatures1 = this.listFeatures1(e);
    list.addAll(_listFeatures1);
    return list;
  }
  
  public List<PojoProperty> listFeatures1(final PojoEntity e) {
    EList<PojoProperty> _features = e.getFeatures();
    final Function1<PojoProperty,Boolean> _function = new Function1<PojoProperty,Boolean>() {
        public Boolean apply(final PojoProperty f) {
          boolean _isList = Utils.isList(f);
          return Boolean.valueOf(_isList);
        }
      };
    Iterable<PojoProperty> _filter = IterableExtensions.<PojoProperty>filter(_features, _function);
    return IterableExtensions.<PojoProperty>toList(_filter);
  }
  
  public List<PojoProperty> requiredFeatures(final PojoEntity e) {
    ArrayList<PojoProperty> _arrayList = new ArrayList<PojoProperty>();
    final ArrayList<PojoProperty> list = _arrayList;
    PojoEntity _superType = Utils.getSuperType(e);
    boolean _notEquals = (!Objects.equal(_superType, null));
    if (_notEquals) {
      PojoEntity _superType_1 = Utils.getSuperType(e);
      List<PojoProperty> _requiredFeatures = this.requiredFeatures(_superType_1);
      list.addAll(_requiredFeatures);
    }
    List<PojoProperty> _requiredFeatures1 = this.requiredFeatures1(e);
    list.addAll(_requiredFeatures1);
    return list;
  }
  
  public ArrayList<PojoProperty> requiredSuperFeatures(final PojoEntity e) {
    ArrayList<PojoProperty> _arrayList = new ArrayList<PojoProperty>();
    final ArrayList<PojoProperty> list = _arrayList;
    PojoEntity _superType = Utils.getSuperType(e);
    boolean _notEquals = (!Objects.equal(_superType, null));
    if (_notEquals) {
      PojoEntity _superType_1 = Utils.getSuperType(e);
      List<PojoProperty> _requiredFeatures = this.requiredFeatures(_superType_1);
      list.addAll(_requiredFeatures);
    }
    return list;
  }
  
  public List<PojoProperty> requiredFeatures1(final PojoEntity e) {
    EList<PojoProperty> _features = e.getFeatures();
    final Function1<PojoProperty,Boolean> _function = new Function1<PojoProperty,Boolean>() {
        public Boolean apply(final PojoProperty f) {
          boolean _isRequired = Utils.isRequired(f);
          return Boolean.valueOf(_isRequired);
        }
      };
    Iterable<PojoProperty> _filter = IterableExtensions.<PojoProperty>filter(_features, _function);
    return IterableExtensions.<PojoProperty>toList(_filter);
  }
  
  public PojoProperty hasIsDef(final PojoEntity e) {
    EList<PojoProperty> _features = e.getFeatures();
    final Function1<PojoProperty,Boolean> _function = new Function1<PojoProperty,Boolean>() {
        public Boolean apply(final PojoProperty f) {
          String _name = f.getName();
          boolean _equals = Objects.equal(_name, "isDef");
          return Boolean.valueOf(_equals);
        }
      };
    return IterableExtensions.<PojoProperty>findFirst(_features, _function);
  }
  
  public PojoProperty hasToInit(final PojoEntity e) {
    EList<PojoProperty> _features = e.getFeatures();
    final Function1<PojoProperty,Boolean> _function = new Function1<PojoProperty,Boolean>() {
        public Boolean apply(final PojoProperty f) {
          String _name = f.getName();
          boolean _equals = Objects.equal(_name, "toInit");
          return Boolean.valueOf(_equals);
        }
      };
    return IterableExtensions.<PojoProperty>findFirst(_features, _function);
  }
  
  public boolean isAttribute(final PojoProperty f) {
    boolean _or = false;
    boolean _or_1 = false;
    String _native = f.getNative();
    boolean _notEquals = (!Objects.equal(_native, null));
    if (_notEquals) {
      _or_1 = true;
    } else {
      PojoEntity _ref = f.getRef();
      boolean _notEquals_1 = (!Objects.equal(_ref, null));
      _or_1 = (_notEquals || _notEquals_1);
    }
    if (_or_1) {
      _or = true;
    } else {
      JvmType _type = f.getType();
      boolean _notEquals_2 = (!Objects.equal(_type, null));
      _or = (_or_1 || _notEquals_2);
    }
    return _or;
  }
  
  public List<PojoProperty> simplAttrs(final PojoProperty f) {
    EList<PojoProperty> _attrs = f.getAttrs();
    final Function1<PojoProperty,Boolean> _function = new Function1<PojoProperty,Boolean>() {
        public Boolean apply(final PojoProperty f2) {
          boolean _or = false;
          String _native = f2.getNative();
          boolean _notEquals = (!Objects.equal(_native, null));
          if (_notEquals) {
            _or = true;
          } else {
            JvmType _type = f2.getType();
            boolean _notEquals_1 = (!Objects.equal(_type, null));
            _or = (_notEquals || _notEquals_1);
          }
          return Boolean.valueOf(_or);
        }
      };
    Iterable<PojoProperty> _filter = IterableExtensions.<PojoProperty>filter(_attrs, _function);
    return IterableExtensions.<PojoProperty>toList(_filter);
  }
  
  public CharSequence compileExtends(final PojoEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      PojoEntity _superType = Utils.getSuperType(e);
      boolean _notEquals = (!Objects.equal(_superType, null));
      if (_notEquals) {
        _builder.append("extends ");
        PojoEntity _superType_1 = Utils.getSuperType(e);
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_superType_1);
        _builder.append(_fullyQualifiedName, "");
        _builder.append(" ");
      } else {
        String _extends = this.getExtends(e);
        boolean _notEquals_1 = (!Objects.equal(_extends, ""));
        if (_notEquals_1) {
          _builder.append("extends ");
          String _extends_1 = this.getExtends(e);
          _builder.append(_extends_1, "");
          _builder.append(" ");
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compileImplements(final PojoEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _or = false;
      boolean _isImplements = this.isImplements(e);
      if (_isImplements) {
        _or = true;
      } else {
        String _sernum = Utils.getSernum(e);
        boolean _notEquals = (!Objects.equal(_sernum, null));
        _or = (_isImplements || _notEquals);
      }
      if (_or) {
        _builder.append("implements ");
        {
          EObject _eContainer = e.eContainer();
          EList<EObject> _eContents = _eContainer.eContents();
          Iterable<Implements> _filter = Iterables.<Implements>filter(_eContents, Implements.class);
          boolean _hasElements = false;
          for(final Implements f : _filter) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            JvmType _implements = f.getImplements();
            String _simpleName = _implements.getSimpleName();
            _builder.append(_simpleName, "");
          }
        }
        {
          String _sernum_1 = Utils.getSernum(e);
          boolean _notEquals_1 = (!Objects.equal(_sernum_1, null));
          if (_notEquals_1) {
            {
              boolean _isImplements_1 = this.isImplements(e);
              if (_isImplements_1) {
                _builder.append(", ");
              }
            }
            _builder.append("Serializable");
          }
        }
        _builder.append(" ");
      }
    }
    return _builder;
  }
  
  public CharSequence compileExtends(final PojoDao e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      PojoDao _superType = Utils.getSuperType(e);
      boolean _notEquals = (!Objects.equal(_superType, null));
      if (_notEquals) {
        _builder.append("extends ");
        PojoDao _superType_1 = Utils.getSuperType(e);
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_superType_1);
        _builder.append(_fullyQualifiedName, "");
        _builder.append(" ");
      } else {
        String _extends = this.getExtends(e);
        boolean _notEquals_1 = (!Objects.equal(_extends, ""));
        if (_notEquals_1) {
          _builder.append("extends ");
          String _extends_1 = this.getExtends(e);
          _builder.append(_extends_1, "");
          _builder.append(" ");
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compileImplements(final PojoDao d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _or = false;
      boolean _or_1 = false;
      boolean _isImplements = this.isImplements(d);
      if (_isImplements) {
        _or_1 = true;
      } else {
        String _sernum = Utils.getSernum(d);
        boolean _notEquals = (!Objects.equal(_sernum, null));
        _or_1 = (_isImplements || _notEquals);
      }
      if (_or_1) {
        _or = true;
      } else {
        String _implPackage = this.getImplPackage(d);
        boolean _notEquals_1 = (!Objects.equal(_implPackage, null));
        _or = (_or_1 || _notEquals_1);
      }
      if (_or) {
        _builder.append("implements ");
        {
          EObject _eContainer = d.eContainer();
          EList<EObject> _eContents = _eContainer.eContents();
          Iterable<Implements> _filter = Iterables.<Implements>filter(_eContents, Implements.class);
          boolean _hasElements = false;
          for(final Implements f : _filter) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            JvmType _implements = f.getImplements();
            String _simpleName = _implements.getSimpleName();
            _builder.append(_simpleName, "");
          }
        }
        {
          String _sernum_1 = Utils.getSernum(d);
          boolean _notEquals_2 = (!Objects.equal(_sernum_1, null));
          if (_notEquals_2) {
            {
              boolean _isImplements_1 = this.isImplements(d);
              if (_isImplements_1) {
                _builder.append(", ");
              }
            }
            _builder.append("Serializable");
          }
        }
        {
          String _implPackage_1 = this.getImplPackage(d);
          boolean _notEquals_3 = (!Objects.equal(_implPackage_1, null));
          if (_notEquals_3) {
            {
              boolean _or_2 = false;
              boolean _isImplements_2 = this.isImplements(d);
              if (_isImplements_2) {
                _or_2 = true;
              } else {
                String _sernum_2 = Utils.getSernum(d);
                boolean _notEquals_4 = (!Objects.equal(_sernum_2, null));
                _or_2 = (_isImplements_2 || _notEquals_4);
              }
              if (_or_2) {
                _builder.append(", ");
              }
            }
            String _name = d.getName();
            _builder.append(_name, "");
          }
        }
        _builder.append(" ");
      }
    }
    return _builder;
  }
  
  public boolean compile(final Extends e, final ImportManager importManager) {
    JvmType _extends = e.getExtends();
    boolean _addImportFor = importManager.addImportFor(_extends);
    return _addImportFor;
  }
  
  public void addImplements(final PojoEntity e, final ImportManager importManager) {
    EObject _eContainer = e.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    Iterable<Implements> _filter = Iterables.<Implements>filter(_eContents, Implements.class);
    for (final Implements impl : _filter) {
      JvmType _implements = impl.getImplements();
      importManager.addImportFor(_implements);
    }
  }
  
  public void addExtends(final PojoEntity e, final ImportManager importManager) {
    EObject _eContainer = e.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    Iterable<Extends> _filter = Iterables.<Extends>filter(_eContents, Extends.class);
    for (final Extends ext : _filter) {
      JvmType _extends = ext.getExtends();
      importManager.addImportFor(_extends);
    }
  }
  
  public void addImplements(final PojoDao e, final ImportManager importManager) {
    EObject _eContainer = e.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    Iterable<Implements> _filter = Iterables.<Implements>filter(_eContents, Implements.class);
    for (final Implements impl : _filter) {
      JvmType _implements = impl.getImplements();
      importManager.addImportFor(_implements);
    }
  }
  
  public void addExtends(final PojoDao e, final ImportManager importManager) {
    EObject _eContainer = e.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    Iterable<Extends> _filter = Iterables.<Extends>filter(_eContents, Extends.class);
    for (final Extends ext : _filter) {
      JvmType _extends = ext.getExtends();
      importManager.addImportFor(_extends);
    }
  }
  
  public String getExtends(final PojoEntity e) {
    EObject _eContainer = e.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    Iterable<Extends> _filter = Iterables.<Extends>filter(_eContents, Extends.class);
    for (final Extends ext : _filter) {
      JvmType _extends = ext.getExtends();
      return _extends.getSimpleName();
    }
    return "";
  }
  
  public boolean isImplements(final PojoEntity e) {
    EObject _eContainer = e.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    Iterable<Implements> _filter = Iterables.<Implements>filter(_eContents, Implements.class);
    for (final Implements ext : _filter) {
      return true;
    }
    return false;
  }
  
  public String getExtends(final PojoDao e) {
    EObject _eContainer = e.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    Iterable<Extends> _filter = Iterables.<Extends>filter(_eContents, Extends.class);
    for (final Extends ext : _filter) {
      JvmType _extends = ext.getExtends();
      return _extends.getSimpleName();
    }
    return "";
  }
  
  public boolean isImplements(final PojoDao e) {
    EObject _eContainer = e.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    Iterable<Implements> _filter = Iterables.<Implements>filter(_eContents, Implements.class);
    for (final Implements ext : _filter) {
      return true;
    }
    return false;
  }
  
  public String getImplPackage(final PojoDao e) {
    EObject _eContainer = e.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    Iterable<ImplPackage> _filter = Iterables.<ImplPackage>filter(_eContents, ImplPackage.class);
    for (final ImplPackage ext : _filter) {
      return ext.getName();
    }
    return null;
  }
  
  public String completeName(final PojoEntity e) {
    String _package = Utils.getPackage(e);
    String _plus = (_package + ".");
    String _name = e.getName();
    return (_plus + _name);
  }
}
