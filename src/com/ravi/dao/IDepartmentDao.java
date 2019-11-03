package com.ravi.dao;

import com.ravi.model.DepartmentDto;

public interface IDepartmentDao {

   public DepartmentDto saveDept(DepartmentDto dept);
	
	public DepartmentDto updateDept(DepartmentDto dept);
	
	public DepartmentDto deleteDept(DepartmentDto dept);
	
	public DepartmentDto  getDeptById(int deptId);
	
}
