package Section5.Exercises2;

public class EvenDigitSum {
    public static void main(String[] args) {
        getEvenDigitSum(2564);
        getEvenDigitSum(41);
        getEvenDigitSum(41813);
        getEvenDigitSum(-9741);
    }

    public static int getEvenDigitSum(int number) {
        int sum;
        if (number < 0) {
            sum = -1;
        } else {
            int evenNumberSum = 0;
            for (int i = number; i > 0; i = i / 10) {
                int evenNumberTest = i % 10;
                if (evenNumberTest % 2 == 0)
                    evenNumberSum = evenNumberSum + evenNumberTest;
                System.out.println(evenNumberSum);
            }
            System.out.println("even number sum  = " + evenNumberSum);
            sum = evenNumberSum;

        }
        return sum;

    }
}
