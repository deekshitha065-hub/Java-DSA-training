package com.basics.exception;

public class E1 {
    public static void main(String[] args) {
        int i, j, k=0;
        i=10;
        j= 10;
        try {
            k = i / j;
            String name="java";
            System.out.println(name.charAt(6));
        }catch (ArithmeticException e){
            System.out.println(" oi randi hadu madake hagala lowde");
            e.printStackTrace();
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("the index isooo09b");
        }catch (Exception e){
            System.out.println("somthing happen");
        }
        finally{
            System.out.println("this block will always exceute");
            System.out.println("this damage you mentally");
        }
        System.out.println("the value of k "+ k);

    }
}