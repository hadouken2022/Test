package day6;

public class Car {
    private String model;
    private String color;
    private int yearOfProduction;

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String carColor) {
        color = carColor;
    }

    public String getColor() {
        return color;
    }

    public void setYearOfProduction(int carYearofProduction) {
        yearOfProduction = carYearofProduction;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - yearOfProduction);
    }
}
