package Section5.Exercises2;

public class CommonDivisor {
    public static void main(String[] args) {
        getGreatestCommonDivisor(41, 62);
        getGreatestCommonDivisor(15, 45);
        getGreatestCommonDivisor(18, 36);
        getGreatestCommonDivisor(-3, -9);

    }

    public static int getGreatestCommonDivisor(int first, int second) {


        int divisor = 0;
        if (first < 10 || second < 10) {
            divisor = -1;
        }

        else{
            for(int i = 1; i<first; i++){
                int firstReminder = first%i;
                int secondReminder = second%i;
                if(firstReminder==0 &&secondReminder==0){
                    divisor = i;
                }
            }
        }
        System.out.println(divisor);
        return divisor;
    }
}
