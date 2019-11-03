package com.ravi.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ravi.dao.IDepartmentDao;
import com.ravi.model.DepartmentDto;

@Repository
public class DepartmentDaoImpl implements IDepartmentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public DepartmentDto saveDept(DepartmentDto dept) {
		Session currentsession = sessionFactory.getCurrentSession();
		currentsession.saveOrUpdate(dept);
		return dept;
	}

	@Override
	public DepartmentDto updateDept(DepartmentDto dept) {
		Session currentsession = sessionFactory.getCurrentSession();
		currentsession.saveOrUpdate(dept);
		return dept;
	}

	@Override
	public DepartmentDto deleteDept(DepartmentDto dept) {
		DepartmentDto departmentDto = (DepartmentDto) sessionFactory.getCurrentSession().load(DepartmentDto.class, dept.getDepttId());
		
		if (departmentDto!=null) {
			this.sessionFactory.getCurrentSession().delete(departmentDto);
			
		}
		return departmentDto;
	}

	@Override
	public DepartmentDto getDeptById(int deptId) {
		return (DepartmentDto) sessionFactory.getCurrentSession().get(
				DepartmentDto.class, deptId);
	}

}
