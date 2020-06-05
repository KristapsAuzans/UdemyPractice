package Section7.Composition.Exercises.Toilet;

public class Main {
    public static void main(String[] args) {
        Door door = new Door(false);
        Light light = new Light(false);
        PaperStock paperStock = new PaperStock(4);
        ToiletBowl toiletBowl = new ToiletBowl( "closed", "clean");
        Toilet theToilet = new Toilet(door, toiletBowl, light, paperStock);
        theToilet.getDoor().openDoor();
        theToilet.getLight().switchOn();
        theToilet.getToiletBowl().flush();
        theToilet.getPaperStock().addRolls(5);



    }
}
