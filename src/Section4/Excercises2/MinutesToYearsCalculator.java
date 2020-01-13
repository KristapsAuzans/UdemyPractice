package Section4.Excercises2;

public class MinutesToYearsCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int years = (int) minutes / 24 / 60 / 365;
            int days = (int) minutes % (24 * 60 * 365) / 24 / 60;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
        }


}
