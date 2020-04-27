package Section5.Exercises2;

public class PerfectNumber {
    public static void main(String[] args) {
        isPerfectNumber(28);
        isPerfectNumber(6);
        isPerfectNumber(-5);
        isPerfectNumber(25);
    }

    public static boolean isPerfectNumber(int number) {
        boolean result = false;
        if(number<1){
            result = false;
        }
        else{
            int sum = 0;
            for(int i = 1; i<number; i++){
                if(number%i==0){
                    sum = sum+i;
                }
            }
            if(number==sum){
                result = true;
            }
        }

        return result;
    }
}
