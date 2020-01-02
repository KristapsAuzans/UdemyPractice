package Excercises1;

public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((hourOfDay >= 22 && hourOfDay <= 23) || (hourOfDay >= 0 && hourOfDay <= 8)) {
            System.out.println("true");
            return true;

        } else if (hourOfDay > 8 && hourOfDay < 22) {
            System.out.println("false");
            return false;
        } else if (hourOfDay > 23 || hourOfDay < 0) {
            System.out.println("false");
            return false;

        }

        return barking;

    }
}



      /* barking = false;
        if (hourOfDay < 8) {
            System.out.println("true");
            return true;
        } else if (hourOfDay > 22) {
            System.out.println("true");
            return true;
        } else if (hourOfDay < 0) {
            System.out.println("false");
            return false;
        } else if (hourOfDay > 23) {
            System.out.println("false");
            return false;
        }


        return barking;
        **/



