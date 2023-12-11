package lesson20.entrtnng;

import java.util.LinkedList;
import java.util.Random;

public class Play2048 {
    private static int playerScore;
    private static int moveCount = 1;
    private static LinkedList<int[]> emptyPlaces = new LinkedList();
    private static final int[][] tiles = new int[4][4];

    public Play2048() {
    }

    public void exe() {
        while(!findEmptyPlace().isEmpty()) {
            placeRandom2or4();
        }

        System.out.println("Game over!");
    }

    public static LinkedList<int[]> findEmptyPlace() {
        for(int x = 0; x < 4; ++x) {
            for(int y = 0; y < 4; ++y) {
                if (tiles[x][y] == 0) {
                    emptyPlaces.add(new int[]{x, y});
                }
            }
        }

        return emptyPlaces;
    }

    public static int[] randomPlace() {
        Random random = new Random();
        int index = random.nextInt(emptyPlaces.size());
        return (int[])emptyPlaces.remove(index);
    }

    public static void placeRandom2or4() {
        if (!findEmptyPlace().isEmpty()) {
            Random random = new Random();
            int[] n = new int[]{2, 4};
            int[] place1 = randomPlace();
            tiles[place1[0]][place1[1]] = 2;
            int[] place2 = randomPlace();
            if (moveCount == 0) {
                tiles[place2[0]][place2[1]] = 2;
            } else {
                tiles[place2[0]][place2[1]] = n[random.nextInt(2)];
            }
        }

    }

    public String toString() {
        String grid = "";
        int[][] var2 = tiles;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int[] x = var2[var4];
            int[] var6 = x;
            int var7 = x.length;

            for(int var8 = 0; var8 < var7; ++var8) {
                int y = var6[var8];
                grid = grid + (y == 0 ? " " : "" + y + "  ");
            }

            grid = grid + "\n";
        }

        return grid;
    }
}
