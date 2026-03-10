package com.basics.arrays.problems;

public class SpaiseAMtrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 9}, {0, 0, 0}, {0, 9, 8}
        };
        int row = matrix.length;
        int cols = matrix.length;
        int zeroCount=0, nonzerocount=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;

                } else {
                    nonzerocount++;
                }
            }
        }
        if (zeroCount > nonzerocount) {

            System.out.println("matrix is spares");
        }else{
            System.out.println("matrix is not spares");
        }

    }
}