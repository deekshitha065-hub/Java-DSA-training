package com.basics.conditionalStatements;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args){
        //Nesting condition Inside condition
        /*
        Even -> Whether it is divisble by 4 or not
        odd -> whether it is divisble by 3 or not
         */
        // object ->class name obj = new classname():
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number");
        int n = sc.nextInt();

        if(n%2==0){
            if(n%4==0){
                System.out.println(n+"is even div by 4 ");

            }else{
                System.out.println(n+"is not even div by 4");
            }
        }else{
            if(n%3==0){
                System.out.println(n+"is odd div by 3 ");

            }else{
                System.out.println(n+"is not odd div by 3");
            }
        }

    }
}
