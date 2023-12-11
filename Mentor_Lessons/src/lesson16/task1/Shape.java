package lesson16.task1;

public abstract class Shape implements Drawable {
    public Shape() {
    }

    abstract double calculateArea();

    protected static void arrayPrinter(String[][] arr) {
        for(int y = 0; y < arr.length; ++y) {
            for(int x = 0; x < arr[0].length; ++x) {
                System.out.print(arr[y][x]);
            }

            System.out.println();
        }

    }
}
