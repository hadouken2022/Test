package day5;


public class Task2 {
    public static void main(String[] args) {
Motorbike motorbike1 = new Motorbike("volkswagen", "grey", 2012);
        System.out.println(motorbike1.getModel());
        System.out.println(motorbike1.getColor());
        System.out.println(motorbike1.getYearOfProduction());
    }
}
class Motorbike{
    private String model;
    private String color;
    private int yearOfProduction;

    public Motorbike(String model, String color, int yearOfProduction){
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getYearOfProduction(){
        return yearOfProduction;
    }
}