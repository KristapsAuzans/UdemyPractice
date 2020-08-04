package Section8.Exercises.AutoboxingAndUnboxing;

import Section8.Exercises.ArrayListChallange.Contact;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }


    public boolean addNewTransaction(String customerName, double transaction) {
        Customer existingCustomer = findCustomer(customerName);
        if (findCustomer(customerName) != null) {

            existingCustomer.addTransaction(transaction);
            System.out.println(customerName + " add " + transaction + " to the account. All transactions are: " + existingCustomer.getTransactions());

            return true;
        }
        return false;
    }


    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);

            if (this.customers.get(i).getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }


//    public void printCustomers() {
//        for (int i = 0; i < customers.size(); i++) {
//            System.out.println((i + 1) + "." +
//                    this.customers.get(i).getName());
//
//        }
//    }


}