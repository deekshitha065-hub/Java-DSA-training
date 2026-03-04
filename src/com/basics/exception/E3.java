package com.basics.exception;

public class E3 {
    static void Checkage(int age){
        if(age>=18){
            System.out.println("Acess =grANTED");
        }else{
            throw new RuntimeException("Acess denied you child lowde");
        }
        System.out.println("user satres the app");
    }
    public static void main(String[] args) {
        Checkage(20);

    }
}
