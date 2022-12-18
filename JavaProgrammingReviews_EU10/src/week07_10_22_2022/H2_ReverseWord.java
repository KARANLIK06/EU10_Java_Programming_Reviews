package week07_10_22_2022;

public class H2_ReverseWord {
    public static void main(String[] args) {
        String str = "Adam come here";
        String result = "";
        String temp = "";
        String search = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.print(ch);


        }
    }
}


/*
--  Task 4: Reverse each word in a sentence.

    input:

    String str = "Adam come here";

    output:

    madA emoc ereh
 */