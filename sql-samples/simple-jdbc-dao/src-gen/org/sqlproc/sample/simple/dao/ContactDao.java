package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.Contact;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.dao.impl.BaseDaoImpl;
	
public interface ContactDao {
	
		public Contact insert(SqlSession sqlSession, Contact contact, SqlControl sqlControl);
		public Contact insert(Contact contact, SqlControl sqlControl);
		public Contact insert(SqlSession sqlSession, Contact contact);
		public Contact insert(Contact contact);
	
		public Contact get(SqlSession sqlSession, Contact contact, SqlControl sqlControl);
		public Contact get(Contact contact, SqlControl sqlControl);
			public Contact get(SqlSession sqlSession, Contact contact);
		public Contact get(Contact contact);
	
		public int update(SqlSession sqlSession, Contact contact, SqlControl sqlControl);
		public int update(Contact contact, SqlControl sqlControl);
		public int update(SqlSession sqlSession, Contact contact);
		public int update(Contact contact);
	
		public int delete(SqlSession sqlSession, Contact contact, SqlControl sqlControl);
		public int delete(Contact contact, SqlControl sqlControl);
		public int delete(SqlSession sqlSession, Contact contact);
		public int delete(Contact contact);
	
		public List<Contact> list(SqlSession sqlSession, Contact contact, SqlControl sqlControl);
		public List<Contact> list(Contact contact, SqlControl sqlControl);
		public List<Contact> list(SqlSession sqlSession, Contact contact);
		public List<Contact> list(Contact contact);
	
		public int count(SqlSession sqlSession, Contact contact, SqlControl sqlControl);
		public int count(Contact contact, SqlControl sqlControl);
		public int count(SqlSession sqlSession, Contact contact);
		public int count(Contact contact);
}
