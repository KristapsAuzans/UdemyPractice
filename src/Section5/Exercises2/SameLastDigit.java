package Section5.Exercises2;

public class SameLastDigit {
    public static void main(String[] args) {
        hasSameLastDigit(13, 51, 16);
        hasSameLastDigit(33, 53, 47);
        hasSameLastDigit(-5, 536, 45734);
        hasSameLastDigit(134353, 0, 16);
        isValid(44);
    }

    public static boolean isValid(int number) {
        boolean result = true;
        if (number>1000 || number<10) {
            result = false;
            System.out.println("Nav vienādi cipari");
        }
        return result;
    }


    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        boolean result = false;
        if ((firstNumber > 1000 || firstNumber < 10) || (secondNumber > 1000 || secondNumber < 10)
                || (thirdNumber > 1000 || thirdNumber < 10)) {
            result = false;
            System.out.println("Nav vienādi cipari");
        } else {

            int lastDigit1 = firstNumber % 10;
            int lastDigit2 = secondNumber % 10;
            int lastDigit3 = thirdNumber % 10;

            if (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3) {
                System.out.println("Ir vienādi cipari" + lastDigit1 + lastDigit2 + lastDigit3);
                result = true;

            }

        }

        return result;
    }


}
