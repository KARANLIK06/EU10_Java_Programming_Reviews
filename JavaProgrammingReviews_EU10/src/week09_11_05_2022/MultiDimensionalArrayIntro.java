package week09_11_05_2022;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
        int[] firstArray ={1,2,3};
        int[] secondArray ={4,5,6};
        int[] thirdArray ={7,8,9};

        int[][] twoDimenArray ={
                {1,2,3},
                {4,5,6},
                {7,8,9,10}
        };
        int[][] array2D={firstArray,secondArray,thirdArray};
        System.out.println(twoDimenArray[0][1]);

        for (int i = 0; i < twoDimenArray.length; i++) {
            System.out.println(i+1+". Array");

            for (int j = 0; j < twoDimenArray[i].length ; j++) {
                System.out.print(twoDimenArray[i][j]);

            }
            System.out.println();
            System.out.println("=========");
        }



    }
}
