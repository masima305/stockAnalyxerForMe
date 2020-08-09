package com.myfinance.sprapp;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommonDao {

	@Autowired
	private SqlSession sqlSession;

	//하나만 선택한다.
	public <T> T selectOne(String target) throws Exception	{
		return sqlSession.selectOne(target);
	}

	public <E> List<E> selectList(String statement ) throws Exception {
		return sqlSession.selectList(statement);
	}

	public <E> List<E> selectList(String statement, Object parameter) throws Exception {
		return sqlSession.selectList(statement, parameter);
	}


	public int insert(String statement, Object parameter) throws Exception {
		return sqlSession.insert(statement, parameter);
	}
}
