package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Courses;
import com.example.demo.entity.Employee;
import com.example.demo.services.CoursesService;
import com.example.demo.services.EmployeeService;

@RestController
public class MyController {

	@Autowired
	private CoursesService courseService;

	@Autowired
	private EmployeeService employeService;

	// demo home Page
	@GetMapping("/home")
	public String home() {
		return "This is Home Page";
	}

	// *************** course Api *********************************//

	// get the All courses
	@GetMapping("/courses")
	public List<Courses> getCourses() {
		return this.courseService.getCourses();
	}

	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}

	@PostMapping("/courses")
	public Courses addCourses(@RequestBody Courses course) {
		return this.courseService.addCourse(course);
	}

	@PutMapping("/courses/{courseId}")
	public Courses updateCourse(@RequestBody Courses course) {
		return this.courseService.updateCourse(course);
	}

	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {

		try {

			this.courseService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	// *************** Employee Api *********************************//

	@GetMapping("/employees")
	public List<Employee> getEmployes() {
		return this.employeService.getEmployes();
	}

	@GetMapping("/employee/{employeeId}")
	public Employee addEmployee(@PathVariable String employeeId) {
		return this.employeService.getEmployee(Long.parseLong(employeeId));
	}

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employeeId) {
		return this.employeService.addEmployee(employeeId);
	}

	@PutMapping("/employee/{employeeId}")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeService.updateEmployee(employee);
	}

	@DeleteMapping("/employee/{employeeId}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String employeeId) {

		try {

			this.employeService.deleteEmployee(Long.parseLong(employeeId));
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
