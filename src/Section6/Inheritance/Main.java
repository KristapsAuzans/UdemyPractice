package Section6.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(1, 1, 5, 5, "Animal");
        Dog dog = new Dog(20, 323, "husky", 2, 4, 1, 34, "brown");
        dog.eat();
        dog.walk();
        dog.run();

    }
}
