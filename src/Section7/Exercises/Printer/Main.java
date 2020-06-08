package Section7.Exercises.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer("HP", 51,  true);
        printer.refillToner(45);
        printer.refillToner(2);
        printer.refillToner(3);
        printer.checkDuplex();
        printer.printPage(1);
        printer.printPage(5);
    }

}
