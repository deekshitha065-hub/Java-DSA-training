package com.basics.oops.consructorChanning;

public class Employee {
    int id;
    String name;
    double salary;
    static String company="accenture";
    Employee(){
        this(89,"shaaa",69000);
    }
    Employee(int id, String name){
        this(67,"fhaaa",90000);
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println(id + " " + name + " " + salary + " " + company);
    }

    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2 = new Employee(89,"shaaa",69000);
        Employee e3= new Employee(67,"fhaaa",90000);
        e1.display();
        e2.display();
        e3.display();
    }
}
