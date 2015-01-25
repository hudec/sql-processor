package org.sample;

import org.sqlproc.engine.SqlSession;

public interface Dao<E extends Object> {

	E get(SqlSession sqlSession, E entity);

	E insert(SqlSession sqlSession, E entity);

	int update(SqlSession sqlSession, E entity);
}
