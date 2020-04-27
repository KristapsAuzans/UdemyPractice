package Section5.Exercises2;

public class NumbersToWords {
    public static void main(String[] args) {
        numberToWords(-15);

    }

    public static int getDigitCount(int number) {

        int digitCount = 0;
        if (number < 0) {
            digitCount = -1;
        }
        else if(number == 0){
            digitCount = 1;
        }
        else {
            for (int i = number; i >0; i = i / 10) {
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
            number = number * (-1);
            for (int i = number; i > 0; i = i / 10) {
                reversedNumber = reversedNumber * 10 + i % 10;

            }
            reversedNumber = reversedNumber * (-1);
        }
        System.out.println(reversedNumber);
        return reversedNumber;
    }

    public static void numberToWords(int number) {
        int digitsInOriginalNumber = getDigitCount(number);
        number = reverse(number);
        int digitsInReversedNumber = getDigitCount(number);

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
            if (digitsInOriginalNumber != digitsInReversedNumber) {
                int difference = digitsInOriginalNumber - digitsInReversedNumber;
                for (int i = difference; i > 0; i--) {
                    System.out.println("Zero");
                }

            }


        }
    }
}

