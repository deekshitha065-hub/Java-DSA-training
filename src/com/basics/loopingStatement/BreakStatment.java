package com.basics.loopingStatement;

public class BreakStatment {
    public static void main(String[] args) {
        // break statement ends the loop and goes out of the loop
        for(int i=1; i<5;i++){
            if(i==3){
                break;
            }
            System.out.println(i + " ");
        }
    }
}
