package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.EmployeeDAO;
import com.niit.model.EmployeeVO;


@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;
	
	 @Transactional(readOnly = true)
	public List<EmployeeVO> listOfEmployeeVO() 
	{
		return dao.listOfEmployeeVO();
	}

	
	
}
