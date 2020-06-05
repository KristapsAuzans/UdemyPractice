package Section7.Composition.Exercises.Toilet;

public class Light {
    private boolean SwitchedOn;

    public Light(boolean switchedOn) {
        SwitchedOn = switchedOn;
    }

    public boolean isSwitchedOn() {
        return SwitchedOn;
    }

    public void switchOn(){
        this.SwitchedOn = true;
        System.out.println("Lights are switched on");
    }

    public void switchedOff(){
        this.SwitchedOn = false;
        System.out.println("Lights are switched off");
    }
}
