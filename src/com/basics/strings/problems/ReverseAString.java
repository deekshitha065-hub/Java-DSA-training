package com.basics.strings.problems;

public class ReverseAString {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("nohtyp");
        System.out.println("original "+ str);
        str.reverse();
        System.out.println("reversed "+ str);
    }
}
