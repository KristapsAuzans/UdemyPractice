package Excercises1;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        int megabytes = kilobytes / 1024;

        int remainingKilobytes = kilobytes % 1024;

        if (kilobytes >= 0) {
            System.out.println(kilobytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }


}
