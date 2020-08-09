package com.myfinance.sprapp;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommonDao {

	@Autowired
	private SqlSession sqlSession;

	public <T> T selectOne(String target) throws Exception	{

		return sqlSession.selectOne(target);
	}
//
//		sqlSession.insert(statement);
//		sqlSession.insert(statement, parameter);
//		sqlSession.select(statement, handler);
//		sqlSession.selectList(statement, parameter);




}
