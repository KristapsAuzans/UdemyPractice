package Section5.Exercises2;

public class LargestPrime {
    public static void main(String[] args) {
        getLargestPrime(24);
        getLargestPrime(217);

    }

    public static int getLargestPrime(int number) {
        System.out.println("number " + number);
        int result = 0;
        if (number <= 1) {
            result = -1;
        } else {
            for (int i = 2; i < number; i++) {
                while (number % i == 0) {
                    System.out.println(i);
                    number = number / i;
                    if (i > result) {
                        result = i;
                    }
                }
            }
            if (number > result) {
                result = number;
            }
        }
        return result;
    }
}

