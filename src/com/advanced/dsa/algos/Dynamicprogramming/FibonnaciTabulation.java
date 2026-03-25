package com.advanced.dsa.algos.Dynamicprogramming;

public class FibonnaciTabulation {
    public static int fib(int n){
        if(n<= 1) return n;
        //step 1 create a DP array od size n+1
        int [] dp=new int[n+1];
        //step 2: store the know Value
        dp[0]=0;
        dp[1]=1;
        //step3: calculate the unknow
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println("the fibonacci of " + n + " this is " + fib(n));
    }
}
