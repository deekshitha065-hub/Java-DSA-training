package com.basics.garbageCollection;

public class GCDemo {
    public static void main(String[] args) {
        GCDemo obj=new GCDemo();
        obj=null;
        System.gc();
        /*
        now a days its done by object class and JVM automatically
        called after program excution by the object class
        for cutter,garbage collection by jvm
         */
        System.out.println("GC Requested");
    }
}
