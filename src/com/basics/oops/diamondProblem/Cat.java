package com.basics.oops.diamondProblem;

public interface Cat {
    default void sound(){
        System.out.println("meom&*");
    }
}
interface Dog{
    default void sound(){
        System.out.println("fhaa");

    }
}
class Cog implements Cat, Dog{
    @Override
    public void sound() {
        // we can can use any one of this -> it removes ambiguity/confusion
        // System.out.println("ra ra ara rattttt");
        //Dog.super.sound();
        Cat.super.sound();
    }
}
class Demo{
    public static void main(String[] args) {
        Cog cog=new Cog();
        cog.sound();
    }
}