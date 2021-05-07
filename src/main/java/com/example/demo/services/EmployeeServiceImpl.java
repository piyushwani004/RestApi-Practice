package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		Employee e = null;

		for (Employee employee : list) {
			if (employee.getId() == employeeId) {
				e = employee;
				break;
			}
		}

		return e;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		list.add(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		list.forEach(e -> {
			if (e.getId() == employee.getId()) {

				e.setName(employee.getName());
				e.setDept(employee.getDept());
				e.setSalary(employee.getSalary());

			}
		});

		return employee;
	}

	@Override
	public void deleteEmployee(long parseLong) {
		list = this.list.stream().filter(e -> e.getId() != parseLong).collect(Collectors.toList());

	}

}
