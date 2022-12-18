package week07_10_22_2022;

public class T2_ChangingWord {
    public static void main(String[] args) {
        String message = "I love cats! I have a cat named Coco. My cat's very smart!";
        String search="cat";
        String change= "dog";

      String task= message.substring(0,7)+change+message.substring(10,22)+change+message.substring(25,41)+change+message.substring(44);

        System.out.println(task);

        System.out.println("-------------------------------");

        int indexOfFirstCat = message.indexOf(search);
        int endOfWord =indexOfFirstCat+search.length();

        message=message.substring(0,indexOfFirstCat)+change+message.substring(endOfWord);


        //we need to check th message contains cat or not

        while (message.contains(search)){

            indexOfFirstCat = message.indexOf(search);
            endOfWord =indexOfFirstCat+search.length();
            message=message.substring(0,indexOfFirstCat)+change+message.substring(endOfWord);


        }

        System.out.println( message);



    }
}
/*
-- Task 2:  Write a program that replaces every occurrence of "cat" in the message with "dog", using indexOf and substring.

  input:

  String message = "I love cats! I have a cat named Coco. My cat's very smart!";

  output:

 "I love dogs! I have a dog named Coco. My dog's very smart!";
 */