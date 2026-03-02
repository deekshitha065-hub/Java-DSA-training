package com.basics.oops.pillars.polymorphism.overloading;

public class Addition {
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(int a, int b,int c){
        System.out.println(a+b+c);
}
    static void add(float a, float b) {
        System.out.println(a + b);
        System.out.println("float");
    }
    static void add(double a, double b) {
        System.out.println(a + b);
        System.out.println("double");
    }
    static void add(int a, int b, int c,int d) {
        System.out.println(a + b + c + d);
    }

    public static void main(String[] args) {
        add(45,89);
        add(45,55,555);
        add(56f,5554f);
        add(564d,5453d);
        add(45,76,87,87);
    }
}
