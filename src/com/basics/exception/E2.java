package com.basics.exception;

public class E2 {
    public static void main(String[] args) {
        int i, j, k=0;
        i=10;
        j=2;
        try{
            k=i/j;
            String str="Snpus";
            System.out.println(str.charAt(9));


        }catch (ArithmeticException | StringIndexOutOfBoundsException e){//Multi catch block by using '|' this symbol we can impelement
            System.out.println("Error");
        }finally{
            System.out.println(" end of code excutiion");
        }
        System.out.println("the value of k "+k);

    }
}
