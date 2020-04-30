package Section5.Exercises2;

public class FlourPackProblem {
    public static void main(String[] args) {
        canPack(1, 0, 5);

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean result = false;
        int bigSum = bigCount * 5;
        int smallSum = smallCount * 1;
        int totalSum = bigSum + smallCount;

        if (totalSum < goal) {
            result = false;
        }
        else if(goal<0){
            result = false;
        }
                else {
            for (int i = bigSum; i > 0 && goal >=5; i = bigSum - 5) {
                goal = goal - 5;
                System.out.println("goal " + goal);
            }
            if(smallSum>=goal){
                result = true;
                System.out.println("true" );
            }
        }


        return result;
    }


}
