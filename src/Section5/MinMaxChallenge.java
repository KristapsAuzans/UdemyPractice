package Section5;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isNumber = true;
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        while (isNumber) {
            System.out.println(" Enter number: ");
            isNumber = scanner.hasNextInt();
            if (isNumber) {
                int number = scanner.nextInt();
                if(number>maxNumber){
                    maxNumber = number;

                }
                else if(number<minNumber){
                    minNumber = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Max number is: " + maxNumber+ "\n"+
                "Min number is: " + minNumber);
        scanner.close();

    }
}


//-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//-Before the user enters the number, print the message gEnter number:h
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//Hint:
//-Use an endless while loop.
//
//Bonus:
//-Create a project with the name MinAndMaxInputChallenge.