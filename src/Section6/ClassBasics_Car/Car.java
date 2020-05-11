package Section6.ClassBasics_Car;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("focus")|| validModel.equals(("porsche"))){
        this.model = model;}
        else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}
