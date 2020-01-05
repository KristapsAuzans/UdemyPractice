package Excercises1;

public class LeapYearCalculator {
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);

    }

    public static boolean isLeapYear(int year) {
        boolean leapYearTester = false;
        if (year <= 0 || year >= 10000) {
            leapYearTester = false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYearTester = true;
                } else {
                    leapYearTester = false;
                }
            } else {
                leapYearTester = true;
            }
        } else {
            leapYearTester = false;
        }
        return leapYearTester;
    }
}
