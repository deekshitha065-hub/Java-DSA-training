package com.basics.loopingStatement;

public class ContinueStatment {
    public static void main(String[] args) {
        // break statement skips the current value
        // and gets to the beging of next step
        for(int i=1; i<5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
