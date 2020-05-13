package Section6.Bank;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;


    public BankAccount(){
        System.out.println("constructor test");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private int phoneNumber;


    public double deposit(double depositSum) {
        double totalSum =  getBalance()+ depositSum;
        System.out.println("you have withdraw " + depositSum + " current balance " +totalSum);
        this.balance = totalSum;
        return totalSum;
    }

    public double withdrawal(double withdrawSum) {
        double totalSum= getBalance();
        if(totalSum>=withdrawSum){
            totalSum = getBalance()-withdrawSum;
            System.out.println("you have withdraw " + withdrawSum + " current balance " +totalSum);
            this.balance = totalSum;
        }
        else{
            System.out.println("Not enough money");
        }

        return totalSum;
    }



}
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.