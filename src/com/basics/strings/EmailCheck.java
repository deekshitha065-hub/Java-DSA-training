package com.basics.strings;

public class EmailCheck {
    public static void main(String[] args) {
        String email1 = "student@gmail.com";
        String email2 = "ertyui_edui";
        if (email1.contains("@") && email1.endsWith(".com")) {
            System.out.println("vaild email");
        } else {
            System.out.println("in vaild");
        }
        if (email2.contains("@") && email2.endsWith(".com")) {
            System.out.println("vaild email");
        } else {
            System.out.println("in vaild");
        }
        String usn=" 1SG23EC0351";
        System.out.println(usn.startsWith(" 1SG"));
        System.out.println(usn.startsWith("yu"));
    }
}