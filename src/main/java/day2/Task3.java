package day2;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
while(a + 1 < b) {
    a++;
    if (a % 5 == 0 && a % 10 != 0) {

        System.out.print(a + " ");
    } else {
    }
    ;
}
    if(a >= b){
        System.out.println("Некорректный ввод");
    }

    }
}
