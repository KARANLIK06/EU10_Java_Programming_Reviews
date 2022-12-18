package week02_09_17_2022;

public class ConvertMinutesToYearAndDay {
    public static void main(String[] args) {
        /*

        8. Create class named ConvertMiutesToYearAndDay, write a Java program to convert minutes into a number of years and days.

     Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days
         */
        int minute = 3456789;
        int year = minute / (365 * 24 * 60);
        int remainderForDay = minute % (365 * 24 * 60);
        int day = remainderForDay / (60 * 24);
        int remainderForHours = remainderForDay % (60 * 24);
        int hours = remainderForHours / 60;
        minute = remainderForHours % 60;
        System.out.println("remainderForDay = " + remainderForDay);
        System.out.println("remainderForHours = " + remainderForHours);
        System.out.println("resulrs"+0+1);

        System.out.println("3456789 minutes is approximately " + year + " years and " + day + " days " + hours + " hours " + minute + " minute");

    }
}
