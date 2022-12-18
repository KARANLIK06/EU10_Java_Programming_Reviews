package week08_10_29_2022;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        String sentence ="Java is a good language";
        String [] words= sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
