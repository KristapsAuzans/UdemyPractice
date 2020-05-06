package Section5;

public class EvenNumber {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while (number <= finishNumber) {
            number++;

            if (!isEvenNumber(number)) {
                count++;
                if (count <= 5) {
                    continue;
                } else {
                    break;
                }
            }
            System.out.println("Even number " + number);
        }
    }

    private static boolean isEvenNumber(int number) {
        boolean check = false;

        if (number % 2 == 0) {
            check = true;
        } else {
        }
        return check;
    }


    public static class ReadingUserInputChallenge {
    }
}
