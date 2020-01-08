package Section4;

public class MethodOverload {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(10, 2);
        calcFeetAndInchesToCentimeters(122);

    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        double centimeters = 0;

        //vajadzētu sākt r validation, kam return -1;
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            centimeters = (double) (feet * 12 + inches) * 2.54;
        } else {
            centimeters = -1;
            return centimeters;
        }
        System.out.println(centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        int feet;
        int remainingInches = 0;
        if (inches >= 0) {
            feet = inches / 12;
            remainingInches = inches%12;
        } else {
            feet = -1;
        }

        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
