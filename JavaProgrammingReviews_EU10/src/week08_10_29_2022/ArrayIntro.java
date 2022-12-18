package week08_10_29_2022;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        int [] arrayName = {1,2,3,4,5,6};
        int [] array= new int[10];
        array[0]=10;
        array[1]=10;
        array[2]=10;
        array[3]=10;
        array[4]=10;
        array[5]=10;
        array[6]=10;
        array[7]=10;
        array[8]=10;
        array[9]=10;

        System.out.println(Arrays.toString(array));

        char[] letters={'B','S','D','Y'};
        System.out.println(Arrays.toString(letters));
        System.out.println(letters[1]);
        System.out.println(letters[3]);


        boolean[] array1= new boolean[3];

        double[] doubles = new double[2];
        doubles[1]=10;

        int[] number = {1,6,9,2,7};
        System.out.println(Arrays.toString(number));
        System.out.println("========after sort=========0");
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));


        int[] array3={1,2,3};
        int[] array4={2,1,3};
        int[] array5={2,1,3};
        System.out.println(Arrays.equals(array3,array4));
    }

}
