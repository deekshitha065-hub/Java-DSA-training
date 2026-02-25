package com.basics.oops.withoutConstructer;

public class Student {
    //instance variables
    int USN;
    String Name;
    int marks;
    String college ;
    void evaluatemarks() {
        if (marks < 66) {
            System.out.println(Name +" he is a shit");
        } else {
            System.out.println(Name +"he is not shit");
        }
    }
    void studentDetailes(){
        System.out.println(Name+" " + USN+" "+ marks+" "+college);
    }
    public static void main(String[] args) {
        // objection creation synatax ; classname.obj=new classroom()
        Student s1 = new Student();
        s1.USN = 101;
        s1.Name="abhi";
        s1.marks=99;
        s1.college="SNPUS";
        Student s2 =new Student();
        s2.USN=908;
        s2.Name="jayaakkaaaaaaa";
        s2.marks=65;
        s2.college="SNPUS";
        s1.evaluatemarks();
        s2.evaluatemarks();
        s1.studentDetailes();
        s2.studentDetailes();
    }
}
