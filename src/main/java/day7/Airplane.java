package day7;

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

    public void fillUp(int n) {
        fuel += n;
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

    public int getLength() {
        return length;
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

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Самолет airplane1 длиннее, чем самолет airplane2");
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("Самолет airplane2 длиннее, чем самолет airplane1");
        } else {
            System.out.println("Airplanes are equal");
        }
    }
}



