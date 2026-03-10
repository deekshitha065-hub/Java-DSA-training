package com.basics.arrays;

import java.util.Arrays;

public class E6 {
    public static void main(String[] args) {
        int[] arr={100,200,300,400,500};
        //converts the arrays statment into String and prints in one line
        System.out.println(Arrays.toString(arr));
        int[] arr2=new int[arr.length];
        System.out.println(Arrays.toString(arr2));
        //copy the contain of one array to other
        //method 1-> loops
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];//destination[i]=source[i]
        }
        System.out.println(Arrays.toString(arr2));
        //method 2-> using array copy
        int[] arr3=new int[arr2.length];
        //src,srcpos,dest,destpos,length
        System.arraycopy(arr2,0,arr3,0,arr2.length);
        System.out.println(Arrays.toString(arr3));
        //method3->clone method
        int[] arr4=arr3.clone();
        System.out.println(Arrays.toString(arr4));
    }
}
