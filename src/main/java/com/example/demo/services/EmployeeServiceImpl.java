package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> list;

	public EmployeeServiceImpl() {
		super();

		list = new ArrayList<>();
		list.add(new Employee(101, "ABC", 12343.12, "IT"));
		list.add(new Employee(102, "XYZ", 12343.12, "Comp"));
		list.add(new Employee(103, "MNO", 12343.12, "Mech"));
		list.add(new Employee(104, "PQR", 12343.12, "Civil"));
		list.add(new Employee(105, "ASD", 12343.12, "IT"));
		list.add(new Employee(106, "KJH", 12343.12, "Ele"));
		list.add(new Employee(107, "AAA", 12343.12, "ITI"));
		list.add(new Employee(108, "CCC", 12343.12, "IIT"));

	}

	@Override
	public List<Employee> getEmployes() {
		return list;
	}

	@Override
	public Employee getEmployee(long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(long parseLong) {
		// TODO Auto-generated method stub
		
	}
	

}
