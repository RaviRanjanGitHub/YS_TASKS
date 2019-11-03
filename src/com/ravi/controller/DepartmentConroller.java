package com.ravi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.model.DepartmentDto;
import com.ravi.service.IDepartmentService;

@RestController
@RequestMapping("/rest")
public class DepartmentConroller {

	@Autowired
	private IDepartmentService service;
	
	@PostMapping("/save")
	public DepartmentDto saveDept(@RequestBody DepartmentDto dept) {
		return service.saveDept(dept);
	}
	@PostMapping("/update")
	public DepartmentDto updateDept(@RequestBody DepartmentDto dept) {
		return service.updateDept(dept);
	}
	@PostMapping("/delete")
	public DepartmentDto deleteDept(@RequestBody DepartmentDto dept) {
		return service.deleteDept(dept);
	}
	@GetMapping("/getdept/{deptId}")
	public DepartmentDto getDeptById(@PathVariable int deptId) {
		return service.getDeptById(deptId);
	}
}
