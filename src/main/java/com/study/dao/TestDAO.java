package com.study.dao;

import java.util.List;

import com.study.dto.TestVO;

public interface TestDAO {
    
    public List<TestVO> selectValue() throws Exception;
    
    public TestVO readValue(String value1) throws Exception;
    
    public void createValue(TestVO tvo) throws Exception;
    
    public void updateValue(TestVO tvo) throws Exception;
    
    public void deleteValue(String value1) throws Exception;
 }
