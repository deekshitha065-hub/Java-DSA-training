package com.basics.oops.pillars.inheritance.single;

public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


class lecture extends Employee{
    String subject;
    lecture(int id, String name,String subject){
        super(id, name);
        this.subject=subject;
    }
     void details(){
        System.out.println(id + " " + name + " " + subject);
    }

    public static void main(String[] args) {
        lecture lecture=new lecture(190,"fggdh","SNHPU");
        lecture.details();
    }

}
