package com.advanced.dsa.algos.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubblesort(int[] arr) {
        int n= arr.length;
        for (int i=1;i<n;i++){
            for(int j=0;j<n-1;j++){//second last element
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];//swap arr[j]&arr[j+1]
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
        }

    }
}

    public static void main(String[] args) {
        int arr[] ={5,7,3,2,9,4,1,5,8,5,8,4,4,4,6666,54344,35545,34,56656,45445,3454345,1};
        System.out.println(Arrays.toString(arr));
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
