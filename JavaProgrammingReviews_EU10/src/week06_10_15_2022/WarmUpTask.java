package week06_10_15_2022;

public class WarmUpTask {
    public static void main(String[] args) {
        String word1="Code";
        String temp="";

        for (int i = 0; i <word1.length() ; i++) {
            String  str = word1.substring(0,i+1);
            temp+=str;

        }
        System.out.println(temp);
    }

}
/*
 Given a non-empty string like "Code" print a string like below output.

 *                                 Code → "CCoCodCode"
 *                                 abc → "aababc"
 *                                 ab → "aab"
 */