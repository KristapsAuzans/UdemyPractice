package Section8.Exercises.ArrayListChallange;

import java.util.Scanner;

public class Contact {
    private String name;
    private String phone;
    private Scanner scanner = new Scanner(System.in);

    public Contact(String name, String phone) {

        this.name = name;
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public static Contact createContact(String name, String phone){
        return new Contact(name, phone);
    }










}



  /* public void addContact(Contact contact) {

        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter number: ");
        phone = Integer.parseInt(scanner.nextLine());
        contactArrayList.add(contact);
        printContact();
    }

    public void printContact() {
        for (int i = 0; i < contactArrayList.size(); i++) {
            System.out.println("Name: " + getName() + " phone " + getPhone());
        }
    }
*/
