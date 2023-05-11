package com.arrays;

public class MultidimensionalExample {
    public static void main(String[] args) {
        int[] oneDimensionalArray = {10, 20, 30};
        System.out.println(oneDimensionalArray);
        int[][] multiDimensionalArray = {{10, 20, 30}, {40, 50, 60}, {60, 70, 80}};
        System.out.println(multiDimensionalArray[1][2]);
        System.out.println(multiDimensionalArray[2][2]);

        double[][] doubleArray=new double[4][2];
        doubleArray[3][1]=3.65;
        System.out.println(doubleArray[3][1]);
        for(int array=0;array<multiDimensionalArray.length;array++){
            for(int item=0;item<multiDimensionalArray[array].length;item++){
                System.out.println(multiDimensionalArray[array][item] + "\t");
            }
            System.out.println();
        }
    }
}