package com.model;

import java.util.List;
import java.util.Set;

public class Dept {

	private String id;
	private String name;
	private List<Emp> emps;

	public Dept(String id, String name, List<Emp> emps) {
		super();
		this.id = id;
		this.name = name;
		this.emps = emps;
	}

	public Dept() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

}
