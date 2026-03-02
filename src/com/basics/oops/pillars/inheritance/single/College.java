package com.basics.oops.pillars.inheritance.single;

public class College {
    static String name="fhjjk";
    String address;
    int pincode;

    public College( String address, int pincode) {
        this.address = address;
        this.pincode = pincode;
    }

}
 class Department extends College{
    String block;
    int lecture_count;
    Department(String address, int pincode , int lecture_count,String block){
        super(address,pincode);
        this.lecture_count=lecture_count;
        this.block=block;
    }
    void Departmentdetails(){
        System.out.println(block+ " " + lecture_count+ " "+address+" "+pincode+" "+College.name);
    }

public static void main(String[] args) {
        Department Department =new Department("banglore",560073,67,"c");
        Department.Departmentdetails();

}
    }
    /*
✅super.something-> variable from parent class
✔️super()->constructor for parent class
❌ don't use super for consrtuctor
ℹ️ this are important for interview & vives
     */