package day5;

public class Task1 {
    public static void main(String[] args) {
Car car1 = new Car();
car1.setModel("Volkswagen");
car1.setColor("Grey");
car1.setYearOfProduction(2012);
        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getYearOfProduction());
    }
}
class Car{
   private String model;
   private String color;
   private int yearOfProduction;
public void setModel(String carModel){
    model = carModel;
}
public String getModel(){
    return model;
}
public void setColor(String carColor){
    color = carColor;
}
public String getColor(){
    return color;
}
public void setYearOfProduction(int carYearofProduction){
    yearOfProduction = carYearofProduction;
}
public int getYearOfProduction(){
    return yearOfProduction;
}
}
