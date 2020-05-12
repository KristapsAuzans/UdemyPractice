package Section6.Exercises.SimpleCalculator;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;

    }

    public double getAdditionResult() {
        double result = firstNumber + secondNumber;
        return result;
    }

    public double getSubtractionResult() {
        double result = firstNumber - secondNumber;
        return result;
    }

    public double getMultiplicationResult() {
        double result = firstNumber * secondNumber;
        return result;
    }

    public double getDivisionResult() {
        double result;
        if (secondNumber != 0) {
            result = firstNumber / secondNumber;
        } else {
            result = 0;
        }
        return result;

    }


}
