package Section6.Exercises.Person;

public class Person {
    private String FirstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        boolean teen = false;
        if (age >= 12 && age <= 20) {
            teen = true;
        }
        return teen;
    }

    public void getFullName(){

        System.out.println();
    }


}
