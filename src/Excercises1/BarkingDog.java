package Excercises1;

public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        {
            if (barking == false || hourOfDay < 0 || hourOfDay > 23) {
                return false;
            } else if (barking == true && hourOfDay >= 0 && hourOfDay < 8) {
                return true;
            } else if (barking == true && hourOfDay > 22 && hourOfDay <= 23) {
                return true;
            } else return false;
        }
    }
}





