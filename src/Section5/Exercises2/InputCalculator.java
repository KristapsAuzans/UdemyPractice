package Section5.Exercises2;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double calculations;
        long average = 0;
        int number;
        int count = 0;
        boolean isNumber;
        while (true) {
            isNumber = scanner.hasNextInt();
            if (isNumber) {
                count++;
                number = scanner.nextInt();
                sum = sum + number;
                calculations = ((double) sum / (double) count);
                average = Math.round(calculations);
            } else {
                break;
            }

        }
        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
