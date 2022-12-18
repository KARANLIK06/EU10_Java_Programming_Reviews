package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        //how to creat an Arraylist

        ArrayList<String> cities = new ArrayList<>();
        //ArrayList<String> cities = new ArrayList<String>();
        // how to add element
        cities.add("London");       // return boolean
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Rome");

        // how to print it

        // for Array  Arrays.toString(arrayName)
        System.out.println(cities);

        //how to add one element at the beginning
        cities.add(0,"Vienna");
        System.out.println(cities);

        //how to get element
        System.out.println(cities.get(0));

        // how to update your element

        System.out.println(cities.set(2, "NewYork"));
        System.out.println("------------After Update--------------");
        System.out.println(cities);

        // how to learn position of the element or index of element

        System.out.println(cities.indexOf("NewYork"));      // 2
        System.out.println(cities.indexOf("Paris"));        // if it is not exist you will get -1
        System.out.println(cities.indexOf("New"));


        //  lastIndexOf()
        cities.add("London");
        System.out.println(cities);

        //  [Vienna, London, NewYork, Istanbul, Rome, London]
        System.out.println(cities.indexOf("London"));
        System.out.println(cities.lastIndexOf("London"));

        System.out.println("====================================");

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(1);
        System.out.println(numbers);

        System.out.println("===========================");

        ArrayList<Integer> numbers1=new ArrayList<>();
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        numbers1.add(1);
        System.out.println(numbers1);

        // how to remove element

        numbers1.remove(1);
        System.out.println(numbers1);

        Integer b=4;
        numbers1.remove(b);
        System.out.println(numbers1);

        numbers1.remove(new Integer(5));
        System.out.println(numbers1);


        System.out.println("-------------------------------------------------------------------------");


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mesut","Osman","Seyma"));
        System.out.println(names);

        System.out.println("========----------=========---------========");

        System.out.println(numbers);
/*
        for (Integer number : numbers) {  // we are not able to use like this because for each iterations the indexes are changing
            if (number<3){
                numbers.remove(number);
            }
            System.out.println(numbers);
        }

 */

            numbers.removeIf(p -> p<3);

        System.out.println(numbers);

    }
}
