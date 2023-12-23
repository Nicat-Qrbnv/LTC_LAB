package lesson20.entrtnng;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Play2048 {
    private static int playerScore;
    private static int moveCount = 0;
    private static final LinkedList<int[]> emptyPlaces = new LinkedList<>();
    private static final int[][] tiles = new int[4][4];

    public Play2048() {
    }

    public void exe() {

//        Scanner scanner = new Scanner(System.in);
        findEmptyPlace();
        placeRandom2or4();
        System.out.println (this);
        while(!emptyPlaces.isEmpty()) {

//            String input = scanner.next();
            moveUp ();
            moveCount++;
            placeRandom2or4();

            System.out.println (moveCount);
            System.out.println (this);
        }

        System.out.println(" Game over!");
    }

    public static void findEmptyPlace() {
        for(int y = 0; y < 4; ++y) {
            for(int x = 0; x < 4; ++x) {
                if (tiles[y][x] == 0) {
                    emptyPlaces.add(new int[]{y, x});
                }
            }
        }
    }

    public static int[] randomPlace() {
        Random random = new Random();
        int index = random.nextInt(emptyPlaces.size());
        return emptyPlaces.remove(index);
    }

    public static void placeRandom2or4() {
        if (!emptyPlaces.isEmpty()) {
            Random random = new Random();
            int[] n = new int[]{2, 4};
            int[] place1 = randomPlace();

            if (moveCount == 0) {
                tiles[place1[0]][place1[1]] = 2;

                int[] place2 = randomPlace();
                tiles[place2[0]][place2[1]] = 2;
            } else {
                tiles[place1[0]][place1[1]] = n[random.nextInt(2)];
            }

        }
    }

    public static void moveUp () {

        for ( int y = 0; y<3; y++){
            for (int x = 0; x<4; x++) {
                if (tiles[y][x] == tiles[y + 1][x] || tiles[y][x] == 0) {
                    tiles[y][x] += tiles[y + 1][x];
                    tiles[y + 1][x] = 0;
                    emptyPlaces.add(new int[]{y+1, x});
                }

            }
        }

//        switch (input.toLowerCase()) {
//            case "w" -> moveUp();
//            case "s" -> moveDown();
//            case "a" -> move;
//            case "d" -> ;
//        }
    }

    public String toString() {
        StringBuilder grid = new StringBuilder();

        for (int[] x : tiles) {

            for(int y : x) {
                grid.append(y == 0 ? "[ ] " : "[" + y + "] ");
            }
            grid.append("\n");
        }

        return grid.toString();
    }
}
