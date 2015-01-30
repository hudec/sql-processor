package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.Subscriber;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.dao.impl.BaseDaoImpl;
	
public interface SubscriberDao {
	
		public Subscriber insert(SqlSession sqlSession, Subscriber subscriber, SqlControl sqlControl);
		public Subscriber insert(Subscriber subscriber, SqlControl sqlControl);
		public Subscriber insert(SqlSession sqlSession, Subscriber subscriber);
		public Subscriber insert(Subscriber subscriber);
	
		public Subscriber get(SqlSession sqlSession, Subscriber subscriber, SqlControl sqlControl);
		public Subscriber get(Subscriber subscriber, SqlControl sqlControl);
			public Subscriber get(SqlSession sqlSession, Subscriber subscriber);
		public Subscriber get(Subscriber subscriber);
	
		public int update(SqlSession sqlSession, Subscriber subscriber, SqlControl sqlControl);
		public int update(Subscriber subscriber, SqlControl sqlControl);
		public int update(SqlSession sqlSession, Subscriber subscriber);
		public int update(Subscriber subscriber);
	
		public int delete(SqlSession sqlSession, Subscriber subscriber, SqlControl sqlControl);
		public int delete(Subscriber subscriber, SqlControl sqlControl);
		public int delete(SqlSession sqlSession, Subscriber subscriber);
		public int delete(Subscriber subscriber);
	
		public List<Subscriber> list(SqlSession sqlSession, Subscriber subscriber, SqlControl sqlControl);
		public List<Subscriber> list(Subscriber subscriber, SqlControl sqlControl);
		public List<Subscriber> list(SqlSession sqlSession, Subscriber subscriber);
		public List<Subscriber> list(Subscriber subscriber);
	
		public int count(SqlSession sqlSession, Subscriber subscriber, SqlControl sqlControl);
		public int count(Subscriber subscriber, SqlControl sqlControl);
		public int count(SqlSession sqlSession, Subscriber subscriber);
		public int count(Subscriber subscriber);
}
