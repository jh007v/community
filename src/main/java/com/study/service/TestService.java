package com.study.service;

import java.util.List;

import com.study.dto.TestVO;
 
public interface TestService {
    
    public List<TestVO> selectValue() throws Exception;
}
