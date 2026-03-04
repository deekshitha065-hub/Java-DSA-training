package com.basics.exception;

public class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
class main{
    static void  vote(int age) throws  InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("age must be at lest 18");
        }
        System.out.println("you can vote");
    }

    public static void main(String[] args) {
        try{
            vote(13);

        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

    }
}/*
"com.basics.exception.InvalidAgeException: "age must be at lest 18
✅ fully qualified class name = name of the class along with floder
*/