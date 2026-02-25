package com.basics.oops.withConstructer;

import javax.naming.Name;

public class Student {
    //instance variables
    int USN;
    String Name;
    int marks;
    static String college = "SNPUS";
    Student(int USN,String Name,int marks,String college) {
        this.USN = USN;
        this.Name = Name;
        this.marks = marks;

    }
    void evaluatemarks() {
        if (marks < 66) {
            System.out.println(Name +" he is a shit");
        } else {
            System.out.println(Name +"he is not shit");
        }
    }
    void studentDetailes() {
        System.out.println(Name + " " + USN + " " + marks + " " + college);
    }
    public static void main(String[] args) {
        // objection creation synatax ; classname.obj=new classroom()
        Student s1 = new Student(101,"abhi",99,"SNPUS");

        Student s2 =new Student(908,"lod",65,"SNPUS");

        s1.evaluatemarks();
        s2.evaluatemarks();
        s1.studentDetailes();
        s2.studentDetailes();
    }
}
