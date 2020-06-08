package Section7.Exercises.Car;

import java.util.Random;

class Car {
    private boolean engine;

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine() {
        return this.name + " starts engine";
    }

    public String accelerate() {
       return name + " accelerates";
    }

    public String brake() {

       return this.name + " brakes";
    }

}


class Ford extends Car {


    public Ford() {
        super(3, "Focus");


    }

    @Override
    public String startEngine() {
       return "starts engine very quite";
    }
}


class BMW extends Car {


    public BMW() {
        super(4, "Žurka");

    }

    @Override
    public String accelerate() {
       return "Is dangerous on road";
    }
}

class Toyota extends Car {


    public Toyota() {
        super(2, "Corrolla");

    }

    @Override
    public String brake() {
        return "Brake very slowly";
    }
}


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            Car randomCar = carGenerator();
            System.out.println("Car: " + randomCar.getName() + "\n" +
                    "Has " + randomCar.getWheels() + " wheels and " + randomCar.getCylinders() + " cylindres" + "\n" +
            randomCar.startEngine() + "\n"+
                    randomCar.accelerate() + "\n"+
                    randomCar.brake()+ "\n");
        }
    }


    public static Car carGenerator() {
        int randomCar = (int) (Math.random() * 3 + 1);
        switch (randomCar) {
            case 1:
                return new Ford();
            case 2:
                return new BMW();
            case 3:
                return new Toyota();
        }
        return null;
    }
}