package com.basics.strings.problems;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        char[]a=s1.toCharArray();
        char[]b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);//l,i,s,t,e,n
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if(Arrays.equals(a,b)){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }
    }
}
