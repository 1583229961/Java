package com.demo.model;

import java.util.List;

public class User {
	
    @Override
	public String toString() {
    	
		return "Id:"+this.getId()+" JOb:"+this.getJob();
	}
    private String job;
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	private String branch;
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	private String phone;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	private int Id;
    private String Name;
	private int Age; 
    private double Money;
    private int password;
    private String sex;
    public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public User()
    {
    	
    }
    
    public User(int id, int password, String job,String branch,String phone) {
		
		Id=id;
		this.password=password;
		this.job=job;
		this.branch=branch;
		this.phone=phone;
	}
    
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public int getAge() {
		return Age;
	}
	
	public void setAge(int age) {
		Age = age;
	}
	
	public double getMoney() {
		return Money;
	}
	
	public void setMoney(double money) {
		Money = money;
	}
    
}
