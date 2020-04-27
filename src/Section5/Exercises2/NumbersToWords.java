package Section5.Exercises2;

public class NumbersToWords {
    public static void main(String[] args) {
        numbersToWords(1000);
        numbersToWords(123);
        numbersToWords(155);
    }

    public static int getDigitCount(int number) {

        int digitCount = 0;
        if (number < 0) {
            digitCount = -1;
        } else {
            for (int i = number; i > 0; i = i / 10) {
                digitCount++;
            }
        }
        return digitCount;

    }


    public static int reverse(int number) {
        int reversedNumber = 0;
        if (number > 0) {
            for (int i = number; i > 0; i = i / 10) {
                reversedNumber = reversedNumber * 10 + i % 10;

            }
        } else {
            reversedNumber = number;
        }
        System.out.println(reversedNumber);
        return reversedNumber;
    }

    public static void numbersToWords(int number) {
        int digitsInOriginalNumber = getDigitCount(number);
        number = reverse(number);
        int digitsInReversedNumber = getDigitCount(number);
        if (digitsInOriginalNumber != digitsInReversedNumber) {
            int difference = digitsInOriginalNumber - digitsInReversedNumber;
            int multiplayer = (int) Math.pow(10, difference);
            number = number * multiplayer;
            System.out.println(number);
        }
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int digit = 0;
            for (int i = number; i > 0; i = i / 10) {
                digit = i % 10;

                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }


        }
    }
}

