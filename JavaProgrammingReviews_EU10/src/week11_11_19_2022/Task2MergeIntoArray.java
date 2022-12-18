package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2MergeIntoArray {

    /*

Task 2 :

Create a method that get two arraylists as a parameters the return the array which has contains all elements in it.

input:

first arraylist :1,2,3

second arraylist :4,5,6

output:

1,2,3,4,5,6
     */

    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(4, 5, 6));

        Integer[] merge = mergeIntoArray(first, second);
        System.out.println(Arrays.toString(merge));

    }

    //first parameter               second parameter
    public static Integer[] mergeIntoArray(ArrayList<Integer> first, ArrayList<Integer> second) {

        Integer[] result = new Integer[first.size() + second.size()];

        int index = 0;
        for (Integer each : first) {
            result[index++] = each;
           /*

           result[0]=1;
           result[1]=2;
           result[2]=3;
            */
        }
        //index =3
        System.out.println(index);

        for (Integer integer : second) {
            //I need to go on with 3 as an index
            result[index++] = integer;

           /*
           result[3]=4;
           result[4]=5;
           result[5]=6;

            */
        }

        return result;


    }
}
