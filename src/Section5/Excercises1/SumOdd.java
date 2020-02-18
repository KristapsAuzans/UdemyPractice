package Section5.Excercises1;

public class SumOdd {
    public static void main(String[] args) {
        isOdd(42);
        isOdd(45);
        isOdd(4);
        isOdd(7);
        isOdd(96);

        sumOdd(13, 19);

    }

    public static boolean isOdd(int number) {
        if (number < 0 || number % 2 == 0) {
            System.out.println("number " + number + " is not odd");
            return false;
        } else {
            System.out.println("number " + number + " is odd");
            return true;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        int i = 0;
        if (end < start || start < 0 || end < 0) {
            sum = -1;
        } else {
            for (i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }


        return sum;
    }


}
