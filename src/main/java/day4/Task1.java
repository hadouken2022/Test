package day4;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random rand = new Random();
int n = sc.nextInt();
int countMoreEight = 0;
int countOfOne = 0;
int chetnieChisla = 0;
int neChetnieChisla = 0;
int sum = 0;
int[] numbers = new int[n];
for(int i = 0; i < numbers.length;i++){
    numbers[i] = rand.nextInt(10);
}
for(int chislaMassiva:numbers){
    sum = sum + chislaMassiva;
    System.out.print(chislaMassiva + " ");
    if(chislaMassiva > 8){
        countMoreEight++;
    }
    else if(chislaMassiva == 1){
        countOfOne++;
    }
    else if(chislaMassiva % 2 == 0){
        chetnieChisla++;
    }
    else {
        neChetnieChisla++;
    }
}
        System.out.println();
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество чисел больше 8: " + countMoreEight);
        System.out.println("Количество чисел равных 1: " + countOfOne);
        System.out.println("Количество четных чисел: " + chetnieChisla);
        System.out.println("Количество нечетных чисел: " + neChetnieChisla);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
