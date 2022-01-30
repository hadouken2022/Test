package day6;

public class Airplane {
    private String manufacter;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacter, int year, int length, int weight) {
        this.manufacter = manufacter;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacter + ", " + "год выпуска: " + year + ", " + "длина: " + length + ", " + "вес: " + weight + ", " + "количество топлива в баке: " + fuel);
    }

    public int fillUp(int n) {
        return fuel += n;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
}


