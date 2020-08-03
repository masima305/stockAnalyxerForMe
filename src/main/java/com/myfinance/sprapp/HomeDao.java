package com.myfinance.sprapp;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HomeDao {

	@Autowired
	private SqlSession sqlSession;
	
	public HomeVO selectTest() throws Exception	{
		return sqlSession.selectOne("mappers.mydao-mapper.selectTest");
	}
	
}
