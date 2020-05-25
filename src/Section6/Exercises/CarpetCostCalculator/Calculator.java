package Section6.Exercises.CarpetCostCalculator;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        double totalCosts = floor.getArea() *carpet.getCost();
        return totalCosts;
    }
}
