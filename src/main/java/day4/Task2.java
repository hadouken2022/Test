package day4;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int maxNumber = 0;
        int minNumber = 10000;
        int counter = 0;
        int sumElements = 0;
        Random rand = new Random();
        for(int i = 0; i< array.length; i++){
            array[i] = rand.nextInt(10000);
        }
for(int chisla:array){
    System.out.println(chisla);
    if(maxNumber <= chisla){
        maxNumber = chisla;
    }
    if(chisla < minNumber){
        minNumber = chisla;
    }
    if(chisla % 10 ==0){
        counter++;
    }
    if(chisla % 10 == 0){
        sumElements = chisla + sumElements;
    }
}

        System.out.println();
        System.out.println("Наибольший элемент массива " + maxNumber);
        System.out.println("Наименьший элемент массива " + minNumber);
        System.out.println("Количество элементов массива, оканчивающихся на 0 " + counter);
        System.out.println("Сумма элементов, оканчивающихся на 0 " + sumElements);
    }
}
