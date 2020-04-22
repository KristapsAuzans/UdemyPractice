package Section5.Exercises2;

public class SharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(42, 977);
        hasSharedDigit(31, 34);
        hasSharedDigit(89, 80);
        hasSharedDigit(1, 99);
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        boolean result = false;
        if ((firstNumber > 99 || firstNumber < 10) || (secondNumber > 99 || secondNumber < 10)) {
            result = false;
            System.out.println(firstNumber+ " and " + secondNumber+ " don't have shared digits");
        } else {
            int firstDigit1 = firstNumber / 10;
            int lastDigit1 = firstNumber % 10;
            int firstDigit2 = secondNumber / 10;
            int lastDigit2 = secondNumber % 10;
            if (firstDigit1 == firstDigit2 || firstDigit1 == lastDigit2 || lastDigit1 == firstDigit2 || lastDigit1 == lastDigit2) {
                result = true;
            }
            System.out.println(firstNumber+ " and " + secondNumber+ " Have shared digits");
        }
        return result;
    }
}
