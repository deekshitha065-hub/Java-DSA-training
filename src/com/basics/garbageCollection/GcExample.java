package com.basics.garbageCollection;

public class GcExample {
    public static void main(String[] args) {
        String s1=new String("java");
        String s2=new String("python");
        s1 = s2;
        System.gc();
        /* we wrote previso version
        now its not mandatory
        now,int scp -> "java" is not aviable
        this proves that garbage collection is automatic
         */
        System.out.println(s1);
    }
}
