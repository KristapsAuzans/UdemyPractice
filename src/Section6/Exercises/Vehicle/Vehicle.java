package Section6.Exercises.Vehicle;

public class Vehicle {
    private String name;
    private int speed;
    private String color;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public Vehicle(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    public void move(int speed){
        System.out.println("This vehicles moves with " + speed + " km/h");
    }

    public void increaseSpeed(int speed){
        this.speed = getSpeed()+speed;
        System.out.println("New speed is "+ getSpeed());
    }

    public void decreaseSpeed(int speed){
        this.speed = getSpeed()-speed;
        System.out.println("New speed is "+ getSpeed());
    }

}
