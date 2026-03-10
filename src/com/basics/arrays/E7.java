package com.basics.arrays;
//varargs-> ...for an array{its internally uses arrays}

public class E7 {
        public static void display(int... arr){
            for(int n: arr){
                System.out.print(n+" ");
            }
            System.out.println();
        }

    public static void main(String[] args) {
        int[] array={0,9,8,7,7};
        display(array);

    }
}
