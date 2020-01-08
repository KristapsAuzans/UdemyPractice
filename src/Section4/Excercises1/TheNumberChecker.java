package Section4.Excercises1;

public class TheNumberChecker {
    public static void main(String[] args) {

    }

    public static boolean hasTeen(int first, int second, int third) {
        boolean test = false;
        if ((first >= 13 && first <= 19) || (second >= 13 && second <= 19) || (third >= 13 && third <= 19)) {
            test = true;

        }
        return test;
    }

    public static boolean isTeen(int first) {
        boolean test = false;
        if (first >= 13 && first <= 19) {
            test = true;

        }
        return test;
    }

}
