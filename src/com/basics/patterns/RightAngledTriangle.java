package com.basics.patterns;

public class RightAngledTriangle {

    static void right_angled_triangle(int n){
        for ( int r=1; r<=n; r++){
            for(int c=1; c<=r; c++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void right_angled_triangleNumber(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c);
            }
            System.out.println();
        }


            }
    public static void main (String[] args){
        right_angled_triangle(9);
        right_angled_triangleNumber(9);
        }
    }