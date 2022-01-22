package day4;
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
int[][] doubleArray = new int[12][8];
Random rand = new Random();
int arraySum = 0;
for(int i = 0; i < 12;i++)
    for(int j = 0; j < 8;j++){
        doubleArray[i][j] = rand.nextInt(50);
    }
int maxIndex = 0;
int maxSum = 0;
for(int i = 0; i < doubleArray.length; i++){
    int sum = 0;
    for(int j = 0; j < doubleArray[i].length; j++){
        sum += doubleArray[i][j];
        if(maxSum <= sum){
            maxSum = sum;
            maxIndex = i;
        }
    }
}

//        for(int i = 0; i < 12;i++) {
//            for (int j = 0; j < 8; j++)
//                System.out.print(doubleArray[i][j] + " ");
//                System.out.println();
//
//        }
//        for(int i = 0; i < 12;i++) {
//            for (int j = 0; j < 8; j++)
//                System.out.print(doubleArray[i][j] + " ");
//            System.out.println();
//        }
        System.out.println(maxIndex);
    }
}
