package Section8.Exercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] myList = getIntegers(5);
        printArray(myList);
        sortIntegers(myList);
    }

    public static Integer[] getIntegers(Integer number) {
        Integer values[] = new Integer[number];
        System.out.println("Enter 5 array values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }

    public static void printArray(Integer[] array) {
        String print = "";
        for (int i = 0; i < array.length; i++) {
            print = print + array[i] + " ";
        }
        System.out.println("Array values are: " + print);
    }

    public static Integer[] sortIntegers(Integer[] array) {
        int descending[] = new int[array.length];
        int counter = 0;
        int largestNumber = 0;
       /* while (counter < array.length) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > largestNumber) {
                    largestNumber = array[i];
                    descending[counter]=largestNumber;
                }
            }
            counter++;
        }*/

        Arrays.sort(array, Collections.reverseOrder());
        printArray(array);
        return array;
    }

}


// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.