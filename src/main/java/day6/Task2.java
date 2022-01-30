package day6;

public class Task2 {
    public static void main(String[] args) {
       Airplane airplane = new Airplane("usa", 2022,25,10000);
            airplane.setYear(2018);
            airplane.setLength(20);
            airplane.fillUp(50);
            airplane.fillUp(100);
            airplane.info();
    }
}



