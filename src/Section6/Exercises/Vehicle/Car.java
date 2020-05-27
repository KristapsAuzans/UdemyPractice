package Section6.Exercises.Vehicle;

public class Car extends Vehicle {
    private int doors;
    private int gears;
    private String fuel;

    public Car( int speed, String color, int doors, int gears, String fuel) {
        super("car", speed, color);
        this.doors = doors;
        this.gears = gears;
        this.fuel = fuel;
    }

    public int getDoors() {
        return doors;
    }

    public int changeGear(int gear){
        return gear;
    }

    public void turnRight(){
        System.out.println("turns right");
    }
    public void turnLeft(){
        System.out.println("turns left");
    }
}
