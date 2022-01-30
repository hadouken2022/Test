package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car2 = new Car();
        Motorbike motorbike2 = new Motorbike("volkswagen", "grey", 2012);
        car2.setModel("Volkswagen");
        car2.setColor("Grey");
        car2.setYearOfProduction(2012);
        car2.info();
        System.out.println(car2.yearDifference(2022));
    motorbike2.info();
        System.out.println(motorbike2.yearDifference(2020));




    }
}
