package Section8.Exercises.ArrayListChallange;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("28318002");


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printActions();
                    break;
                case 1:
                    addNewContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    mobilePhone.printContactList();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }

    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone: ");
        String newPhone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhone);
        if(mobilePhone.updateContact(existingContact, newContact)){
            System.out.println("COnntact has been updated");
        }
        else{
            System.out.println("Error updating record");
        }

    }


    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContact)){
            System.out.println( "Successfully deleted contact");
        }
        else{
            System.out.println("Error deleting contact");
        }
    }
    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new contact phone: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file")
            ;
        }
    }

    private static void startPhone() {
        System.out.println("Start phone...");
    }

    private static void printActions() {
        System.out.println("\n Press");
        System.out.println("\t 0 - To read instructions");
        System.out.println("\t 1 - To add mobile phone");
        System.out.println("\t 2- To update mobile phone");
        System.out.println("\t 3 - To remove mobile phone");
        System.out.println("\t 4 - To print phone list");
        System.out.println("\t 5 - To quit the contact list");
        System.out.println("\t Choose your actions");
    }


}
