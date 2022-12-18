package week05_10_08_2022;

public class StringMethod {
    public static void main(String[] args) {
        String number ="0123456";
        System.out.println(number.indexOf('3'));
        System.out.println(number.indexOf("56"));
        System.out.println(number.indexOf("16"));
        System.out.println(number.indexOf("05"));

        String sentence ="Java is a programming language";
        System.out.println(sentence.indexOf("programming"));
        System.out.println(sentence.indexOf("programming2"));

        String sentence3="Java is a hard prog language";
        System.out.println(sentence3.replace("hard","easy"));
        System.out.println(sentence3.replace("hard","fun"));

        String sentence4="java is not same with java";
        System.out.println(sentence4.replaceFirst("java","c#"));

        String sentence5="Cydeo";
        System.out.println(sentence5.substring(1, sentence5.length()-1));
        //System.out.println(sentence5.substring(2));
        String sentence6=" ";
        System.out.println(sentence6.length());

        String sentence7 ="Java is a good language";
        String edc ="Java";
        System.out.println(sentence7.startsWith(edc));
        System.out.println(sentence7.endsWith("language"));


    }
}
