package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Irina Petrovna", "Russian language");
        Student student = new Student("Ivan");
        teacher.evaluate(student);
    }
}
