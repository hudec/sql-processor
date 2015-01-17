package org.sqlproc.sample.simple.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.sample.simple.model.Payment;
import org.sqlproc.sample.simple.model.BankAccount;
		import org.sqlproc.sample.simple.model.CreditCard;

public class PaymentDao {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected SqlEngineFactory sqlEngineFactory;
	protected SqlSessionFactory sqlSessionFactory;
			
	public PaymentDao() {
	}
			
	public PaymentDao(SqlEngineFactory sqlEngineFactory) {
		this.sqlEngineFactory = sqlEngineFactory;
	}
			
	public PaymentDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
		this.sqlEngineFactory = sqlEngineFactory;
		this.sqlSessionFactory = sqlSessionFactory;
	}

	SqlControl getMoreResultClasses(Payment payment, SqlControl sqlControl) {
		if (sqlControl != null && sqlControl.getMoreResultClasses() != null)
			return sqlControl;
		Map<String, Class<?>> moreResultClasses = null;
				if (payment != null && payment.toInit(Payment.Association.billingDetails.name())) {
			if (moreResultClasses == null)
				moreResultClasses = new HashMap<String, Class<?>>();
				moreResultClasses.put("BA", BankAccount.class);
					moreResultClasses.put("CC", CreditCard.class);
		}
		if (moreResultClasses != null) {
			sqlControl = new SqlStandardControl(sqlControl);
			((SqlStandardControl) sqlControl).setMoreResultClasses(moreResultClasses);
		}
		return sqlControl;
	}
}
