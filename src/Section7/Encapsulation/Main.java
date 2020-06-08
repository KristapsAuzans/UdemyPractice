package Section7.Encapsulation;

public class Main {
    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("Kristaps", 79, "mace");
        System.out.println("Initial health is "+ player.getHealth());
    }
}
