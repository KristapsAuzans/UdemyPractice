package Section7.Exercises.Printer;

public class Printer {
    private String brand;
    private int tonerLevel;
    private int printedPages;
    private boolean isDuplex;


    public Printer(String brand, int tonerLevel, boolean isDuplex) {
        this.brand = brand;
        this.tonerLevel = tonerLevel;
        this.printedPages = 0;
        this.isDuplex = isDuplex;
    }

    public int refillToner(int levelIncrease) {
        if (tonerLevel + levelIncrease > 100) {
            this.tonerLevel = 100;
            System.out.println("Printer toner is full, "+ "remaining "+ (levelIncrease-(100-tonerLevel))+ " toner in bottle");
        } else {
            this.tonerLevel += levelIncrease;
            System.out.println("toner is " + this.tonerLevel + "% full");
        }
        return this.tonerLevel;
    }

    public int printPage(int printedPages) {
        if(!this.isDuplex){
        this.printedPages += printedPages;
        System.out.println("Total printed pages = " + this.printedPages);}
        else{
            this.printedPages += (printedPages/2+printedPages%2);
            System.out.println("Total printed pages = " + this.printedPages);
        }
        return this.printedPages;
    }
    public void checkDuplex (){
        if(isDuplex = true){
            System.out.println("This is duplex printer, you can print on both sides");
        }
        else{
            System.out.println("THis is not duplex printer, print only on one side");

        }
    }

}


// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.