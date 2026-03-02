package com.basics.oops.pillars.abstraction.abstractclasses;

abstract class Vechile {
    //two typesof method;
    //1. normal or contraced method
    void vechile_type(){
        System.out.println("two wheeler or four wheeler");
    }
    // abstract method
    abstract void start();
    //this abstract method will be defiened in the child class
    //if there are only abstract method -> 100% abstraction
    //if there is 1 normal method -> not abstraction
}
class vstrom900 extends Vechile{


    @Override
    void start() {
        System.out.println("strats with petrol");

    }
}
class Gurkaha extends Vechile{

    @Override
    void start() {
        System.out.println(" Gurkaha starts with battery");

    }
}
class demo{
    public static void main(String[] args) {
        vstrom900 bike=new vstrom900();
        Gurkaha car=new Gurkaha();
        bike.start();
        bike.vechile_type();
        car.start();
        car.vechile_type();
    }
}
