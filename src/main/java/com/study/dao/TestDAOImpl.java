package com.study.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.study.dto.TestVO;

@Repository
public class TestDAOImpl implements TestDAO {

	@Inject
	private SqlSession sqlSession;
	    
	private static final String Namespace = "com.study.mapper.testMapper";

	
	@Override
	public List<TestVO> selectValue() throws Exception {
		
		return sqlSession.selectList(Namespace+".selectValue");
		
	}


	@Override
	public TestVO readValue(String value1) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(Namespace+".readValue", value1);
	}


	@Override
	public void updateValue(TestVO tvo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(Namespace+".updateValue", tvo);
	}


	@Override
	public void deleteValue(String value1) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(Namespace+".deleteValue", value1);
	}


	@Override
	public void createValue(TestVO tvo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(Namespace+".createValue", tvo);
	}


}
