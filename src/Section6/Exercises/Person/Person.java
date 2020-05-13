package Section6.Exercises.Person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
        if (age > 12 && age < 20) {
            teen = true;
        }
        return teen;
    }

    public String getFullName() {
        String output;
        String firstName = getFirstName();
        String lastName = getLastName();
        if (firstName.isEmpty() && lastName.isEmpty()) {
            output="";
        } else if (firstName.isEmpty()) {
           output = lastName;
        } else if (lastName.isEmpty()) {
            output = firstName;
        } else {
          output= firstName + " "+ lastName;
        }
        return output;
    }


}
