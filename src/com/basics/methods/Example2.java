package com.basics.methods;

public class Example2 {
    static int sumofNTerms(int n){
        return n * (n+1)/2;
    }
    public static void main(String[] args) {
        // store into variable and then print
        int sum = sumofNTerms(10);
        System.out.println(sum);
        // second way is to directly print it
        System.out.println(sumofNTerms(100));
    }
}
