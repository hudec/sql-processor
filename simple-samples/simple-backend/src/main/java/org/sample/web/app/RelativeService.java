package org.sample.web.app;


import org.sample.dao.RelativeDao;
import org.sample.model.Relative;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;

public class RelativeService {
	
	protected RelativeDao relativeDao;

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Transactional
	public Relative insertRelative(Relative relative) {
		logger.info("insertRelative -> " + relative);
        Relative p = relativeDao.insert(relative);
        logger.info("insertRelative <- " + p);
        return p;
	}
	
	@Required
    public void setRelativeDao(RelativeDao relativeDao) {
        this.relativeDao = relativeDao;
    }
	
}
