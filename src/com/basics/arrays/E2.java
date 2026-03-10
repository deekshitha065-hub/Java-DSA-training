package com.basics.arrays;

public class E2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arr[1]);
        arr[1]=400;
        System.out.println(arr[1]);
        //we can do this in constant time because of index
        //So - the time complexity is big 0(1)
        //Accessing and upadting elements in array -> TC(01)
        //this is because of index based access or
        //direct index moping
        //[idx=pos-1];[pos=ids+1]
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        // for each loop
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println();
        for (Object o: arr){
            System.out.print(o+" ");
        }
        System.out.println();
        String name= "HAAAAA";
        // String.length() is a method of the string class
        System.out.println(name.length());
    }
}
