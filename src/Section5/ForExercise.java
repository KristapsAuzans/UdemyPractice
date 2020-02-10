package Section5;

public class ForExercise {
    public static void main(String[] args) {
       // calculateInterest(10000, 8);

        primeCounter(44, 189);
    }

    private static void calculateInterest(double amount, double interestRate) {
        double amountWithInterest = 0;
        for (double i = interestRate; i > 1; i--) {
            amountWithInterest = amount + (amount * i / 100);
            System.out.println("Amount to pay back with interest rate " + i + " is" + amountWithInterest);
        }

    }

    public static boolean isPrime(int n) {
        int count = 0;
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeCounter(int first, int last){
        int count = 0;
        for(int i = first; i<=last; i++){
        if (isPrime(i)){
            System.out.println(i);
            count++;
        }
        else if (count == 3){
            break;
        }
        }

    }
}
