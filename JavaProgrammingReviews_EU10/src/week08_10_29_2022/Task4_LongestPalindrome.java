package week08_10_29_2022;

public class Task4_LongestPalindrome {
    public static void main(String[] args) {
        String[] words={"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

       String longestPalindrome="";
        for (String eachWord : words) {
            boolean isPalindrome=true;
            for (int i = 0; i <eachWord.length()/2 ; i++) {
                char ch1= eachWord.charAt(i);
                char ch2= eachWord.charAt(eachWord.length()-1-i);

                if (ch1!=ch2){
                    isPalindrome=false;
                    break;
                }

            }
            if (isPalindrome && eachWord.length()>longestPalindrome.length()){
                longestPalindrome=eachWord;
            }



        }
        System.out.println(longestPalindrome);

    }
}
/*
Task 4 :  For Each - Nested For

            Longest Palindrome

                Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                    Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
                    Ex:
                    Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
                    Output: No palindrome
 */
