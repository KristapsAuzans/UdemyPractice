package Section4.Excercises1;

public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(90);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

    }

    public static void printConversion(double kilometersPerHour) {
        toMilesPerHour(kilometersPerHour);
        toMilesPerHour(kilometersPerHour);
        toMilesPerHour(kilometersPerHour);
        toMilesPerHour(kilometersPerHour);
        toMilesPerHour(kilometersPerHour);
        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");

        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;

        }
        else {
            long miles = Math.round(kilometersPerHour / 1.609);
            return miles;

        }

    }
}
