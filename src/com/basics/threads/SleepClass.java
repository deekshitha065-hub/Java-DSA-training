package com.basics.threads;

public class SleepClass {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Printing numbers 1 to 5:");
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Printing number:"+i);
            Thread.sleep(9000);
        }
        System.out.println("Successfully Printed 1 to 5");
    }
}
/*
code explanation:
here,the thread is paused for afixed amount of time(sleep);
the thread cannot relase any lock and it is automatically after the given time
it will just interrupt the exceution of the thread for that time
 */