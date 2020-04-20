package Section5.Excercises1;

public class SumDigit {
    public static void main(String[] args) {

        sumDigits(124);
        sumDigits(445);
        sumDigits(5);

    }

    private static int sumDigits(int number) {
        int result=0;
        if(number>=10){
        while (number > 0) {
            result = result+number % 10;
            number /= 10;
                    }}
        else    {
            result = -1;
        }
        System.out.println(result);
        return result;

    }
}
