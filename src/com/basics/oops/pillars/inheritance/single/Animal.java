package com.basics.oops.pillars.inheritance.single;

public class Animal {
    void eat(){
        System.out.println("Animals eat some food");
    }
}
class Cat extends Animal {
    void run() {
        System.out.println("cats run very fast");
    }


    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        cat.eat();
    }
}