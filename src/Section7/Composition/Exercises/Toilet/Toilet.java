package Section7.Composition.Exercises.Toilet;

public class Toilet {
    private Door door;
    private ToiletBowl toiletBowl;
    private Light light;
    private PaperStock paperStock;

    public Toilet(Door door, ToiletBowl toiletBowl, Light light, PaperStock paperStock) {
        this.door = door;
        this.toiletBowl = toiletBowl;
        this.light = light;
        this.paperStock = paperStock;
    }

    public Door getDoor() {
        return door;
    }

    public ToiletBowl getToiletBowl() {
        return toiletBowl;
    }

    public Light getLight() {
        return light;
    }

    public PaperStock getPaperStock() {
        return paperStock;
    }
}
