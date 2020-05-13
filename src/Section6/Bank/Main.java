package Section6.Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("LVHABA93758303215", 421, "John Smith","js@gmail.com");


        /*bankAccount.setAccountNumber("LVHABA93758303215");
        bankAccount.setCustomerName("John Smith");
        bankAccount.setBalance(421);
        bankAccount.setEmail("js@gmail.com");
        bankAccount.setPhoneNumber(32453261);
        bankAccount.deposit(52);
        bankAccount.withdrawal(500);*/
        System.out.println("Bank account = " +bankAccount.getAccountNumber() + "\n"+
                "Client = "+ bankAccount.getCustomerName() + " phone = "+ bankAccount.getPhoneNumber()+ " mail = "+ bankAccount.getEmail()+"\n"+
                "current balance = "+ bankAccount.getBalance());

    }
}
