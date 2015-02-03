package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.Performer;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.dao.impl.BaseDaoImpl;
	
public interface PerformerDao {
	public Performer insert(SqlSession sqlSession, Performer performer, SqlControl sqlControl);
	public Performer insert(Performer performer, SqlControl sqlControl);
	public Performer insert(SqlSession sqlSession, Performer performer);
	public Performer insert(Performer performer);
	public Performer get(SqlSession sqlSession, Performer performer, SqlControl sqlControl);
	public Performer get(Performer performer, SqlControl sqlControl);
	public Performer get(SqlSession sqlSession, Performer performer);
	public Performer get(Performer performer);
	public int update(SqlSession sqlSession, Performer performer, SqlControl sqlControl);
	public int update(Performer performer, SqlControl sqlControl);
	public int update(SqlSession sqlSession, Performer performer);
	public int update(Performer performer);
	public int delete(SqlSession sqlSession, Performer performer, SqlControl sqlControl);
	public int delete(Performer performer, SqlControl sqlControl);
	public int delete(SqlSession sqlSession, Performer performer);
	public int delete(Performer performer);
	public List<Performer> list(SqlSession sqlSession, Performer performer, SqlControl sqlControl);
	public List<Performer> list(Performer performer, SqlControl sqlControl);
	public List<Performer> list(SqlSession sqlSession, Performer performer);
	public List<Performer> list(Performer performer);
	public int count(SqlSession sqlSession, Performer performer, SqlControl sqlControl);
	public int count(Performer performer, SqlControl sqlControl);
	public int count(SqlSession sqlSession, Performer performer);
	public int count(Performer performer);
}
