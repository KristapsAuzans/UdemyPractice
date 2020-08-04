package Section8.Exercises.AutoboxingAndUnboxing;


public class Main {

    private static Bank SEB = new Bank("SEB");


    public static void main(String[] args) {
        SEB.addNewBranch("Jelgava");
        SEB.addNewBranch("Bauska");
        SEB.addCustomer("Bauska", "Kristaps", 450);
        SEB.addCustomer("Code", "Kristaps", 450);
        SEB.addCustomer("Jelgava", "Kika", 200);
        SEB.addCustomer("Bauska", "Sandra", 99950);

        SEB.listCustomers("Bauska", false);
        SEB.listCustomers("Bauska", true);
        SEB.listCustomers("Jelgava", true);



    }


}
