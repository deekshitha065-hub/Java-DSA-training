package com.basics.arrays;

public class E5 {
    //how to pass array in mrthod function
    public static void printArray(int[] arr) {
            for(int x:arr){
                System.out.print(x+"");
            }
        System.out.println();
    }
    public static int[] createArray(){
        return new int[]{7,8,-1,9};
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        printArray(arr);
        int[] result=createArray();
        for (int num:result){
            System.out.print(num+" ");
        }
        System.out.println();

        printArray(new int[]{10,80,49,90});
        //anonynoums array -> it is directly passed in the method call()
        //after the method call we cannot access the array element
    }
}
