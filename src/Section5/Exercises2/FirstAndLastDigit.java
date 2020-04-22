package Section5.Exercises2;

public class FirstAndLastDigit {
    public static void main(String[] args) {
        sumFirstAndLastDigit(424);
        sumFirstAndLastDigit(44422);
        sumFirstAndLastDigit(4);
        sumFirstAndLastDigit(-314);
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum;
        if (number < 0) {
            sum = -1;
        } else {
            int firstDigit = 0;
            for (int i = number; i > 0; i = i / 10) {
                firstDigit = i;
            }
            int lastDigit = number % 10;
            sum = lastDigit + firstDigit;

        }
        return sum;
    }


}
