package com.demo.model;

public class Course {
    @Override
    public String toString() { 
        return  "Course [id=" + getId() + ", name=" + name +",userid="+userid+"]";
    }
    private int id;
    private String name;
    private int userid;
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
