package com.basics.methods;

public class Example5 {
    static int hammingweight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("HW-11:" + hammingweight(11));
        System.out.println("HW-8" + hammingweight(8));
        System.out.println("HW-64" + hammingweight(64));
        System.out.println("HW-15" + hammingweight(15));

    }
}
