import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    /**
     * Полностью разобраться с кодом, попробовать переписать с нуля;
     * ^ Усовершенствовать метод проверки победы (через циклы);
     * ^ Расширить поле до 5х5 и в качестве условий победы установить серию равной 4.
     * ^^ Проработать базовый искусственный интеллект, чтобы он мог блокировать ходы игрока.
     */

    public static char[][] map;
    public static int mapSizeX;
    public static int mapSizeY;

    public static char human_player = 'X';
    public static char ai_player = 'O';
    public static char empty_dot = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void createMap() {
        mapSizeX = 5;
        mapSizeY = 5;
        map = new char[mapSizeY][mapSizeX];

        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                map[y][x] = empty_dot;
            }
        }
    }

    public static void printMap() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                System.out.print("|" + map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("------------");
    }

    public static boolean isEmptyCell(int y, int x) {
        return map[y][x] == empty_dot;
    }

    public static boolean isValidCell(int y, int x) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    public static void humanTurn() {

        int x;
        int y;

        do {
            System.out.println("Enter your coordinates!");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isValidCell(y, x) || !isEmptyCell(y, x));

        map[y][x] = human_player;

    }

    public static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(mapSizeX);
            y = random.nextInt(mapSizeY);
        } while (!isEmptyCell(y, x));
        map[y][x] = ai_player;

        System.out.println("The AI made its move:");
    }

    public static boolean isFullMap() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                if (map[y][x] == empty_dot) {
                    return false;
                }
            }
        }
        return true;
    }

    //TODO: loop that method
    public static boolean checkWin(char currentPlayer) {
        for (int i = 0; i < 4; i++) {
            if ((map[i][0] == currentPlayer && map[i][1] == currentPlayer && map[i][2] == currentPlayer && map[i][3] == currentPlayer) ||
                    (map[0][i] == currentPlayer && map[1][i] == currentPlayer && map[2][i] == currentPlayer && map[3][i] == currentPlayer) ||
                    (map[0][0] == currentPlayer && map[1][1] == currentPlayer && map[2][2] == currentPlayer && map[3][3] == currentPlayer) ||
                    (map[0][3] == currentPlayer && map[1][2] == currentPlayer && map[2][1] == currentPlayer && map[3][0] == currentPlayer))
                return true;
        }
        return false;
    }
         /*   if (map[0][0] == currentPlayer && map[0][1] == currentPlayer && map[0][2] == currentPlayer) return true;
            if (map[1][0] == currentPlayer && map[1][1] == currentPlayer && map[1][2] == currentPlayer) return true;
            if (map[2][0] == currentPlayer && map[2][1] == currentPlayer && map[2][2] == currentPlayer) return true;

                if (map[0][0] == currentPlayer && map[1][0] == currentPlayer && map[2][0] == currentPlayer) return true;
                if (map[0][1] == currentPlayer && map[1][1] == currentPlayer && map[2][1] == currentPlayer) return true;
                if (map[0][2] == currentPlayer && map[1][2] == currentPlayer && map[2][2] == currentPlayer) return true;

                if (map[0][0] == currentPlayer && map[1][1] == currentPlayer && map[2][2] == currentPlayer) return true;
                if (map[0][2] == currentPlayer && map[1][1] == currentPlayer && map[2][0] == currentPlayer) return true;

                return false;*/

    public static void main(String[] args) {
        createMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(human_player)) {
                System.out.println("Human won!");
                break;
            }
            if (isFullMap()) {
                System.out.println("Draw!");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(ai_player)) {
                System.out.println("AI won!");
                break;
            }
            if (isFullMap()) {
                System.out.println("Draw!");
                break;
            }
        }
    }
}

