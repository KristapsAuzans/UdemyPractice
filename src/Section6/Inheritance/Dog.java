package Section6.Inheritance;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tale;
    private int teeth;
    private String coat;
    public Dog(  int size, int weight, String name, int eyes, int legs, int tale, int teeth, String coat) {
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tale = tale;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("dog chews");
        }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog picks food");
    }

    public void walk(){
        move(15);
    }

    public void run(){
        move(30);

    }
}
