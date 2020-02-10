package Section5.Excercises1;

public class NumberOfDays {
    public static void main(String[] args) {
        isLeapYear(2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(3, 2020);
        getDaysInMonth(4, 2020);
        getDaysInMonth(2, 2023);
        getDaysInMonth(2, 13114);
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


    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        if (year<1 || year>9999){
            days = -1;
        }
        else   {


        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            default:
                days = -1;
                break;
        }
        }
        System.out.println(days);
        return days;
    }


}
