package Excercises1;

public class EqualSumChecker {
    public static void main(String[] args) {
        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, -1, 0);
    }

    public static boolean hasEqualSum(int first, int second, int third) {
        boolean test = false;
        int sum = first + second;
        if (sum == third) {
            test = true;
        } else {
            test = false;
        }
        return test;
    }
}
