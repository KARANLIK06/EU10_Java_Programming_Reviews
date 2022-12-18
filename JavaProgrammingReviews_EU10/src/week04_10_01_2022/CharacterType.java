package week04_10_01_2022;

public class CharacterType {
    /*
    Given a character, the task is to check whether the given character is in upper case, lower case, or non-alphabetic         character

                            Input: ch = 'A'
                            Output: A is an UpperCase character

                            Input: ch = 'a'
                            Output: a is an LowerCase character

                            Input: ch = '0'
                            Output: 0 is not an aplhabetic character
     */
    public static void main(String[] args) {
        char ch= 'a';
        boolean isUpperCase= ch>='A'&& ch<='Z';
        boolean isLowerCase= ch>='a'&& ch<='z';
        boolean isNotAlphabetic = !(isUpperCase||isLowerCase);
        String result ="";
      /*  if (isUpperCase){
            result=ch+" is an UpperCase character";
        }else if (isLowerCase){
            result=ch+" is a LowerCase character";
        }else{
            result=ch+" is not an aplhabetic character";
        }
        System.out.println("result = " + result);
*/

        if (isUpperCase) {
            result = ch + " is an UpperCase character";
        }
        if (isLowerCase) {
            result = ch + " is a LowerCase character";
        }
        if (isNotAlphabetic) {
            result = ch + " is not an aplhabetic character";

        }
        System.out.println("result = " + result);
    }

}
