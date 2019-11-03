package com.ravi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ravi.dao.IDepartmentDao;
import com.ravi.model.DepartmentDto;
import com.ravi.service.IDepartmentService;

@Service
@Transactional
public class DepartmentServiceImpl implements IDepartmentService {

	@Autowired
	private IDepartmentDao dao;
	
	@Override
	public DepartmentDto saveDept(DepartmentDto dept) {
		return dao.saveDept(dept);
	}

	@Override
	public DepartmentDto updateDept(DepartmentDto dept) {
		return dao.updateDept(dept);
	}

	@Override
	public DepartmentDto deleteDept(DepartmentDto dept) {
	  return dao.deleteDept(dept);
	}

	@Override
	public DepartmentDto getDeptById(int deptId) {
		return dao.getDeptById(deptId);
	}

}
