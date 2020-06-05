package Section7.Composition.Exercises.Toilet;

public class Door {
    private boolean isDoorsOpen;

    public Door(boolean open) {
        this.isDoorsOpen = isDoorsOpen;
    }


    public void closeDoor() {

        System.out.println("doors are closed");
    }

    public void openDoor() {
        this.isDoorsOpen = true;
        System.out.println("doors are open");
    }


}
