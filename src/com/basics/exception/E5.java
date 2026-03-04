package com.basics.exception;

import java.io.IOException;

public class E5 {
    static void readfile() throws IOException {
        throw new IOException("tying to not read. ");
    }

    public static void main(String[] args) {
        try {
            function_a();
        } catch (IOException e) {
            System.out.println(e.getMessage());


        }
    }


    static void function_a() throws IOException {
        function_b();
    }

    static void function_b() throws IOException {
        readfile();

    }
}
/*
//for checked exceptions
//throws keyword doesnt handle exception
//it only process information to the calling method
//the calling method has to handle exception
//the throws keyword is used in method signature
//the process of passing of information is called ducking
 */