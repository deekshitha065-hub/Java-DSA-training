package com.basics.strings;

public class DifferenceDemo {
    public static void main(String[] args) {
        String s= "java";
        //hashcode'#'->unique id or no given by JVM
        System.out.println("String before;"+ s.hashCode());
        s=s+"DSA";
        System.out.println("String after:"+ s.hashCode());
        //this imporve that string are immutable{
        //for(int i=0;i<100;i++);{
        //S=S+"DSA";
        //this bad because it creats 1000 new items
        // to do thsi we have two  special mutables
        //String buffer & Stringbulider-> java.lang
        StringBuilder bulider=new StringBuilder("java");
        System.out.println("builder be " +bulider.hashCode());
        bulider.append("DSA");
        System.out.println("builfer after " +bulider.hashCode());


    }
}
