package com.advanced.dsa.algos.Dynamicprogramming;

import java.util.Arrays;

public class FibonnaciMemorization {
    private static int fib(int n, int[] dp){
        //step 2 if you have the value dont calculate
        if( n<=1)return n;
        if (dp[n] !=-1){
            return dp[n];
        }
        //step3 if you dont have value calculate
        return dp[n]=fib(n-1,dp) + fib(n-2,dp);

    }
    public static void main(String[] args) {
        int n=6;
        //step 1
        int [] dp=new int[n+1];// the sort of fibonacci
        Arrays.fill(dp, -1);
        System.out.println("the fibonacci of " + n + " this is " + fib(n,dp));
    }
}
