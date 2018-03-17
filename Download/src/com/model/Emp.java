package com.model;

public class Emp {

	private String id;
	private String name;
	private String job;
	private String tel;
	private Dept dept;

	public Emp(String id, String name, String job, String tel, Dept dept) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.tel = tel;
		this.dept = dept;
	}

	public Emp() {
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

}
