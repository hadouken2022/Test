package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[6];
        for (int i = 0; i < 6; i++) {
            int k = random.nextInt(11) + 90;
            array[i] = k;
        }
        Player player1 = new Player(array[0]);
        Player player2 = new Player(array[1]);
        Player player3 = new Player(array[2]);
        Player player4 = new Player(array[3]);
        Player player5 = new Player(array[4]);
        Player player6 = new Player(array[5]);
        Player player7 = new Player(array[0]);
        Player.info();
        while (player1.getStamina() != Player.MIN_STAMINA) {
            player1.run();
        }
        Player.info();
    }

}
