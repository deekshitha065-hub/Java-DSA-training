package com.basics.arrays.problems;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={2,2,3,4,5,5,5,5,6};
        int count=0;
        int candidate=0;
        for(int i=0; i<arr.length;i++){
            if(count==0){
                candidate=arr[i];

            }
            if(arr[i]==candidate){
                count++;
            }else{
                count--;
            }
        }
        System.out.println("majority canditate  "+ candidate);
    }
}
