package Section5.Exercises2;

public class LargestPrime {
    public static void main(String[] args) {
        getLargestPrime(24);
        getLargestPrime(217);
        getLargestPrime(0);
        getLargestPrime(49);
    }

    public static int getLargestPrime(int number) {
        System.out.println("number " + number);
        int result = 0;
        if (number <= 1) {
            result = -1;
        } else {
            int multiplayer = 0;
            int prime = 0;
            for (int i = number; i > 1; i--) {
                if (number % i == 0) {
                    multiplayer = number / i;
                    for (int j = multiplayer; j > 0; j--) {
                        int count = 0;
                        if (multiplayer % j == 0) {
                            count++;
                            if (count == 0) {
                                prime = multiplayer;
                                System.out.println(prime);
                            }
                        }
                    }

                }
            }
        }
        return result;
    }
}

