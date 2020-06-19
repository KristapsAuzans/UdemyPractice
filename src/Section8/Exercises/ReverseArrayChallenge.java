package Section8.Exercises;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 1, 5, 9};
        System.out.println("Array " + Arrays.toString(numbers));
        reverse(numbers);
    }

    public static void reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        int counter = 0;
        for (int i = array.length-1; i >= 0; i--) {
            reversedArray[counter] = array[i];
            counter++;
        }

        System.out.println("Reversed Array " + Arrays.toString(reversedArray));
    }


}




/*
-Write a method called reverse() with an int array as a parameter.

-The method should not return any value. In other words, the method is allowed to modify the array parameter.

-In main() test the reverse() method and print the array both reversed and non-reversed.

-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


Tip:
	-Create a new console project with the name eReverseArrayChallengef
 */