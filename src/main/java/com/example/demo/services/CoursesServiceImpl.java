package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Courses;

@Service
public class CoursesServiceImpl implements CoursesService {

	private List<Courses> list;

	public CoursesServiceImpl() {
		list = new ArrayList<>();
		
		list.add(new Courses(101, "java", "Java Course"));
		list.add(new Courses(102, "python", "python Course"));
		list.add(new Courses(103, "Android", "Android Course"));
		list.add(new Courses(104, "JavaScript", "JavaScript Course"));

	}

	@Override
	public List<Courses> getCourses() {
		return list;
	}

	@Override
	public Courses getCourse(long courseId) {

		Courses c = null;

		for (Courses courses : list) {

			if (courses.getId() == courseId) {
				c = courses;
				break;
			}
		}
		return c;
	}

	@Override
	public Courses addCourse(Courses course) {
		list.add(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
		list.forEach(e -> {
			if (e.getId() == course.getId()) {
				e.setName(course.getName());
				e.setDesc(course.getDesc());
			}
		});

		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		list = this.list.stream().filter(e -> e.getId() != parseLong).collect(Collectors.toList());

	}

}
