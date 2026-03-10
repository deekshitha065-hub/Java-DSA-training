package com.basics.arrays;

public class E1 {
    public static void main(String[] args) {
        // Method 1
        int[] arr; //Declartaion
        arr= new int[5]; //Memory allocation [20 bytes]->{4bytes x 5block}
        System.out.println(arr[4]);
        //if do not assign any value
        // the JVM uses fallback MechNISM
        //IT USES THE DEFAULT VALUE for that paticulalr data type
        // It uses the default values of that particular data type
        // int->0, float->0.0, string->null, boolean->false, char->null
        // Declaration & Memory Allocation in single line
        int[] arr2 = new int[5];
        System.out.println(arr2[4]);
        // Method 3
        int[] arr3 = {2,8,-1,4,6}; // Assigning custom values
        System.out.println(arr3[3]);
        //method 4
        int[] arr4=new int[]{6,8,9,0};
        System.out.println(arr4[0]);
    }
}
