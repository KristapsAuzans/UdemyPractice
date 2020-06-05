package Section7.Composition.Exercises.Toilet;

public class ToiletBowl {
    private String lid;
    private String watter;

    public ToiletBowl(String lid, String watter) {
        this.lid = lid;
        this.watter = watter;
    }

    public void flush(){
        System.out.println("You flush the water");
    }



}
