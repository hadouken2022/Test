package day6;

import java.util.Random;

public class Teacher {
    private String имя;
    private String предмет;

    public Teacher(String имя, String предмет) {
        this.имя = имя;
        this.предмет = предмет;
    }

    public void evaluate(Student student) {
        int min = 2;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 2);
        String оценка = null;
        switch (i) {
            case 2:
                оценка = "неудовлетворительно";
                break;
            case 3:
                оценка = "удовлетворительно";
                break;
            case 4:
                оценка = "хорошо";
                break;
            case 5:
                оценка = "отлично";
                break;
        }
        System.out.println("Преподаватель " + имя + " оценил студента с именем " + student.getИмя() + " по предмету " + предмет + " на оценку " + оценка + ".");
    }
}
