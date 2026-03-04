package com.basics.garbageCollection;

public class Test {
    protected void finalize() throws Throwable{
        System.out.println("object destroyed");
    }

    public static void main(String[] args) {
        Test t =new Test();
        t=null;
        for (int i=1;i<100;i++){
            System.gc();
        }
    }
}
// Now-a-days all clutter is auto-cleared after excecution by JVM