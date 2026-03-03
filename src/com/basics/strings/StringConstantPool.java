package com.basics.strings;

public class StringConstantPool {
    public static void main(String[] args) {
        //they have same literals value "java"
        //so they point to the same object in heap
        String s1="java";
        String s2="java";
        System.out.println(s1==s2);
        String s3=new String("java");
        System.out.println(s1==s3);//they are different objects
        System.out.println(s1.equals(s3));//check values
    }

}
