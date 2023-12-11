package lesson16.task1;

import java.util.Arrays;

public class Square extends Shape {
    private double width;
    private double length;

    public Square(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void draw() {
        int wid = (int)this.width;
        int len = (int)this.length;
        String[][] s = new String[len][wid];
        String[][] var4 = s;
        int var5 = s.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            String[] strA = var4[var6];
            Arrays.fill(strA, "   ");
        }

        Arrays.fill(s[0], " . ");
        Arrays.fill(s[len - 1], " . ");

        for(int l = 1; l < len - 1; ++l) {
            s[l][0] = " . ";
            s[l][wid - 1] = " . ";
        }

        arrayPrinter(s);
    }

    public double calculateArea() {
        return this.width * this.length;
    }
}