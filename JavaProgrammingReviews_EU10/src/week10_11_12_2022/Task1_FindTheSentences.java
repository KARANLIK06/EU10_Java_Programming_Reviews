package week10_11_12_2022;

public class Task1_FindTheSentences {
    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        getSentence(str);


    }

    public static void getSentence(String str) {
        String temp="";
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);

          /*  if(('a'<=ch&& ch<='z')||('A'<=ch&& ch<='Z')||(ch==' ')){
                temp+=ch;
            }

           */
            if(Character.isAlphabetic(ch)||ch==' '){
                temp+=ch;
            }

        }
        System.out.println(temp);
    }
}

/*
Task 1 : Find the word

                    String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

                    Write a method that returns : Welcome To Core Java

 */