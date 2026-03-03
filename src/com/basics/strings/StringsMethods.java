package com.basics.strings;

import java.util.Arrays;

public class StringsMethods {
    public static void main(String[] args) {
        String str = "Tripillar solutions";
        System.out.println("Length;"+" "+ str.length());
        System.out.println("char at index 2: "+str.charAt(2));
        System.out.println("chsr At last index "+ str.charAt(str.length()-1));
        System.out.println("upper "+ str.toUpperCase());
        System.out.println("lower "+ str.toLowerCase());
        System.out.println("substring(0:9)"+ str.substring(0,9));
        System.out.println("equals "+ str.equals("Tripillar solutions"));
        System.out.println("equal(case doesnt matter)"+ str.equalsIgnoreCase("tripillar solutions"));
        String jumbled="dee1is1from1ece1sec1a";
        String words = Arrays.toString(jumbled.split("1"));
        System.out.println( words);

        String name="       fhaaaa   ";
        System.out.println(name.trim());
        char[] letters ={'g','f','f'};
        String word = new String(letters);
        System.out.println(word);

    }
}

