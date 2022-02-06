package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Audi", 2015, 300, 40000);
        Airplane airplane2 = new Airplane("Genesis", 2022, 330, 35000);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
