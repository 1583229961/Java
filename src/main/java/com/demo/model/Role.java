package com.demo.model;

import java.util.List;

public class Role {
	@Override
    public String toString() {
        // TODO Auto-generated method stub
        return  "Role [id=" + getId() + ", name=" + name +",desp="+desp+"]";

    }
    private int id;
    private String name;
    private String desp;
    private List<User> users;
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
    public String getDesp() {
        return desp;
    }
    public void setDesp(String desp) {
        this.desp = desp;
    }
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }

}
