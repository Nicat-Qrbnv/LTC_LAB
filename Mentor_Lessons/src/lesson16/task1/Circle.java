package lesson16.task1;

import java.awt.*;
import java.util.Arrays;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        int rad = (int)this.radius;
        int dmtr = (int)(2.0 * this.radius);
        String[][] s = new String[dmtr][dmtr];
        String[][] var4 = s;
        int x = s.length;

        int frstDot;
        for(frstDot = 0; frstDot < x; ++frstDot) {
            String[] strA = var4[frstDot];
            Arrays.fill(strA, "   ");
        }

        for(int y = 0; y < rad; ++y) {
            for(x = 0; x < dmtr; ++x) {
                frstDot = rad - 1 - y;
                int scndDot = dmtr - 1 - frstDot;
                s[y][frstDot] = " . ";
                s[y][scndDot] = " . ";
                s[dmtr - 1 - frstDot][rad - 1 - frstDot] = " . ";
                s[dmtr - 1 - frstDot][dmtr - 1 - y] = " . ";
                if ((double)rad < this.radius) {
                    s[0][dmtr / 2] = " . ";
                    s[dmtr - 1][dmtr / 2] = " . ";
                    s[dmtr / 2][0] = " . ";
                    s[dmtr / 2][dmtr - 1] = " . ";
                }
            }
        }

        arrayPrinter(s);
    }

    public double calculateArea() {
        return 3.14 * this.radius * this.radius;
    }
}