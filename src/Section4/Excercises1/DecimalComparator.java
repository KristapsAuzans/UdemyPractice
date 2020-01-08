package Section4.Excercises1;

public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        first = first * 1000;
        second = second * 1000;
        int checkFirst = (int) first;
        int checkSecond = (int) second;
        boolean testOutcome = false;

        if (checkFirst == checkSecond) {
            testOutcome = true;
        } else {

            testOutcome = false;
        }
        return testOutcome;
    }

}
