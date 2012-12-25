package org.sqlproc.sample.simple.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.sample.simple.model.Media;
import org.sqlproc.sample.simple.model.Person;
import org.sqlproc.sample.simple.model.PersonLibrary;

public class PersonLibraryDao1 extends BaseDaoImpl {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public void insertPersonLibrary(Person person, Media... media) {
        SqlCrudEngine sqlInsertPersonLibrary = getCrudEngine("INSERT_PERSON_LIBRARY");
        if (media != null) {
            for (Media media1 : media) {
                PersonLibrary personLibrary = new PersonLibrary(person.getId(), media1.getId());
                int count = sqlInsertPersonLibrary.insert(getSqlSession(), personLibrary);
                logger.info("insert person library: " + count + ": " + personLibrary);
                if (count > 0)
                    person.getLibrary().add(media1);
            }
        }
    }

    public PersonLibrary getPersonLibrary(PersonLibrary personLibrary) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_PERSON_LIBRARY");
        PersonLibrary p = sqlEngine.get(getSqlSession(), PersonLibrary.class, personLibrary);
        logger.info("get person library: " + p);
        return p;
    }

    public PersonLibrary updatePersonLibrary(PersonLibrary personLibrary) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_PERSON_LIBRARY");
        int count = sqlEngine.update(getSqlSession(), personLibrary);
        logger.info("update person library: " + count);
        return (count > 0) ? personLibrary : null;
    }

    public boolean deletePersonLibrary(PersonLibrary personLibrary) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_PERSON_LIBRARY");
        int count = sqlEngine.delete(getSqlSession(), personLibrary);
        logger.info("delete person library: " + count);
        return (count > 0);
    }

}
