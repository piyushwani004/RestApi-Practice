package com.example.demo.entity;

public class Courses {

	private long id;
	private String Name;
	private String Desc;

	public Courses(long id, String name, String desc) {
		super();
		this.id = id;
		Name = name;
		Desc = desc;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}

}
