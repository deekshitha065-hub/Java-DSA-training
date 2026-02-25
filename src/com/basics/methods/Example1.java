package com.basics.methods;

public class Example1 {
    static int x = 10;
    // to access method without object we use static
    static void add(int a, int b){//method defination
        //a,b ->Parameters
        //the variable is a method called parameter
        System.out.println(a+b);
    }
    public static void main(String[] args) {
       // Example1 obj = new Example1();
        add(1,2);//method call 1,2 (arguments)
        //the actual value passed duruing methods
        System.out.println(x);

    }
}
