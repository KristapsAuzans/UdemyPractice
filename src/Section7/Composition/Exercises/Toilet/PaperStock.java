package Section7.Composition.Exercises.Toilet;

public class PaperStock {
    private int rolls;

    public PaperStock(int rolls) {
        this.rolls = rolls;
    }

    public int getRolls() {
        return rolls;
    }

    public int addRolls(int rolls) {
        System.out.println("ruļļi pirms papildināšanas: " + this.rolls);
        this.rolls += rolls;

        System.out.println("ruļļi pēc papildināšanas: " + this.rolls);
        return this.rolls;

    }
}
