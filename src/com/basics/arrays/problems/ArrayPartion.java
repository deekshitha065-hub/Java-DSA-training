package com.basics.arrays.problems;

import java.util.Arrays;

public class ArrayPartion {
    public static void main(String[] args) {
        int[] arr={3,8,5,1,27,6};
        System.out.println(Arrays.toString(arr));
        int i=0;
        int r= arr.length-1;
        while(i<r){
            if(arr[i]%2==0){
                i++;
            }
            if(arr[r]%2 !=0){
                r--;
            }
            if(i<r){
                int temp=arr[i];
                arr[i]=arr[r];
                arr[r]=temp;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
