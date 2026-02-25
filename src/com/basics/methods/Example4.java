package com.basics.methods;

public class Example4 {
    static int maxPieces(int n){
        return ((n*(n+1))/2)+1;

    }
    static int maxRegion(int n){
        return ((n*(n+1))/2)+1;

    }

    public static void main(String[] args) {
        System.out.println(" maxPieces "  + maxPieces(8));
        System.out.println(" maxRegion "  + maxRegion(9));
    }
}
