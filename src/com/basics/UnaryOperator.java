package com.basics;

public class UnaryOperator {
    public static void main(String[] args){
        int a = 1000;
        int b =1900;
        System.out.println(++a + b--);
        System.out.println("a=" + a + " b=" + b);
        System.out.println(++a + ++b);
    }
}
