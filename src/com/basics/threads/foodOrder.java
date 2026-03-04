package com.basics.threads;

public class foodOrder extends Thread{
    String task;
    foodOrder(String task){
        this.task=task;
    }
    public void run(){
        System.out.println(task+"started");
    }

    public static void main(String[] args) {
        foodOrder cooking =new foodOrder("Cooking");
        foodOrder packing=new foodOrder("packing");
        foodOrder delivery=new foodOrder("Asigning Delivery agent");
        cooking.start();
        packing.start();
        delivery.start();
    }
}
/*
extend thread
override thread
use start()

 */