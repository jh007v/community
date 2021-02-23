package com.study.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.study.dao.TestDAO;
import com.study.dto.TestVO;

@Service
public class TestServiceImpl implements TestService {

	@Inject
	private TestDAO dao;

	
	@Override
	public List<TestVO> selectValue() throws Exception {
		return dao.selectValue();
	}

}
