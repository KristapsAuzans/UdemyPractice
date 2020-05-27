package Section6.Exercises.Vehicle;

public class Ford extends Car {
    private String model;

    public Ford(int speed, String color, int doors, int gears, String fuel, String model) {
        super(speed, color, doors, gears, fuel);
        this.model = model;
    }

    @Override
    public void turnRight() {
        super.turnRight();
        System.out.println(model +  " turns right");
    }

    public String getModel() {
        return model;
    }


    public void turnLeft() {
        super.turnLeft();
        System.out.println( model + " turns left");
    }

    public void parameters(){
        System.out.println(getModel() + " is driving with " +  getSpeed()+" km/h "+ "\n"+
                "It has " + getColor()+ " color and " + getDoors() + " doors.");
    }
}
