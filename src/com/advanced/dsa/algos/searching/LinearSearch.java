package com.advanced.dsa.algos.searching;

import java.util.Arrays;

public class LinearSearch {
    public static int Linearsearch(int[] arr,int key){
        for (int i=0;i< arr.length;i++){
            if(arr[i]==key){
                return i; //return the index where the key is present
            }
        }
        return -1;//if dont't find the return to the invalid index
    }

    public static void main(String[] args) {
        int[] arr={9,4,3,5,6,2,3};
        int key=6;
        int index=Linearsearch(arr,key);
        if(index==-1){
            System.out.println(key + " the is not present in the array " + Arrays.toString(arr));

        }else{
            System.out.println(key + " the is not present in the array " + index + Arrays.toString(arr));
        }
    }
}
