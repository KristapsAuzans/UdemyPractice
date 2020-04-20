package Section5.Exercises2;

public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(373);
        isPalindrome(43);
        isPalindrome(222);
        isPalindrome(-222);

    }

    public static boolean isPalindrome(int number) {
        boolean result = false;
        if (number < 0)
            number = -number;
        int reverseNumber = 0;
        int oneDigit = 0;


        for (int i = number; i > 0; i = i / 10) {
            oneDigit = i % 10;
            reverseNumber = reverseNumber * 10 + oneDigit;
        }
        if (number == reverseNumber) {
            System.out.println("Polindroms" + number);

            result = true;
        } else {
            System.out.println("Nav polindroms" + number);
        }
        return result;
    }
}
