package day7;

public class Player {
    private int stamina;
    public final static int MAX_STAMINA = 100;
    public final static int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        --stamina;
        if (stamina == 0) {
            --countPlayers;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            int p = 6 - countPlayers;
            System.out.println("Команды неполные. На поле еще есть " + p + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
