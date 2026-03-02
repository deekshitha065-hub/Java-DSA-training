package com.basics.oops.pillars.inheritance.single;

public class Person {
    String name;
    Person(String name){
        this.name=name;
    }
}
class Student extends Person{
    int RollNo;
    Student(int RollNo, String name){
        super(name);
        this.RollNo=RollNo;
    }
    void Display(){
        System.out.println(RollNo + " " + name);
    }

    public static void main(String[] args) {
        Student student = new Student(351, "abhikav");
        student.Display();
    }
}
