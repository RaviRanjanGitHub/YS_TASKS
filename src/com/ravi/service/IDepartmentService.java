package com.ravi.service;

import com.ravi.model.DepartmentDto;

public interface IDepartmentService {

	public DepartmentDto saveDept(DepartmentDto dept);
	
	public DepartmentDto updateDept(DepartmentDto dept);
	
	public DepartmentDto deleteDept(DepartmentDto dept);
	
	public DepartmentDto getDeptById(int deptId);
	
}
