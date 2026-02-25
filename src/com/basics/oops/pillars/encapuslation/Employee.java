package com.basics.oops.pillars.encapuslation;

public class Employee {
    private int id;
    private String emailid;
    //setters
    public void setId(int id){
        this.id=id;
    }

    public void setEmailid(String emailid){
        this.emailid=emailid;
    }

    public int getId() {
        return id;
    }

    public String getEmailid() {
        return emailid;
    }
}
