package Section6.ClassBasics_Car;

public class Main {
    public static void main(String[] args) {
        Car ford = new Car();
        Car porsche = new Car();
        ford.setModel("Focus");
        System.out.println("Model is "+ ford.getModel());
    }
}
