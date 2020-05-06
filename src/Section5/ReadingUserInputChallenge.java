package Section5;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number #" + i);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                result = result + number;
            } else {
                System.out.println("Invalid value");
                i--;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum of all numbers = " + result);
    }

}


//-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
//-If hasNextInt() returns false, print the message gInvalid Numberh. Continue reading until you have read 10 numbers.
//-Use the nextInt() method to get the number and add it to the sum.
//-Before the user enters each number, print the message gEnter number #x:h where x represents the count, i.e. 1, 2, 3, 4, etc.
//-For example, the first message printed to the user would be gEnter number #1:h, the next gEnter number #2: h, and so on.
//
//Hint:
//-Use a while loop.
//-Use a counter variable for counting valid numbers.
//-Close the scanner after you donft need it anymore.
//-Create a project with the name ReadingUserInputChallenge.