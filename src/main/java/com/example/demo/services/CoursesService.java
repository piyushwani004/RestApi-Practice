package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Courses;

public interface CoursesService {

	public List<Courses> getCourses();

	public Courses getCourse(long courseId);

	public Courses addCourse(Courses course);

	public Courses updateCourse(Courses course);

	public void deleteCourse(long parseLong);
}
