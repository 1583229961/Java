package com.demo.model;

public class Card {
	
    @Override
    public String toString() {
        return  "Card [id=" + getId() + ", cardNo=" + cardNo + ", city=" + city + ",address="+address+",userid="+userid+"]";
    }
    private int id;
    private String cardNo;
    private String city;
    private String address;
    private int userid;
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCardNo() {
        return cardNo;
    }
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
