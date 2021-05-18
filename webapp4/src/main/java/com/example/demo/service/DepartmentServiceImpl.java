package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public List<Department> getAllDepartments() {
		
		return departmentRepository.findAll();
	}

	@Override
	public Department addDepartment(Department department) {
		System.out.println(department.getDepartmentName());
		departmentRepository.insert(department);
		System.out.println(department.getDepartmentName());
		return department;
	}

}
