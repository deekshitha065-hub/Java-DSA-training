package com.basics.patterns;

public class HollowSquare {
    public static void main(String[] args) {
        hollow_square(9);

    }
    static void hollow_square(int n){
        for (int r = 1; r <=n ; r++){
            for (int  c= 1;  c<=n ; c++) {
                if( r ==1|| r==n|| c==1|| c==n ){
                    System.out.print("&* ");
                }else{
                    System.out.print("   ");
                }

            }
            System.out.println(" ");

        }
    }


}
