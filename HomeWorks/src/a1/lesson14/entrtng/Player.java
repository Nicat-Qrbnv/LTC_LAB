package a1.lesson14.entrtng;

import a1.lesson14.normal.task1.Circle;
import a1.lesson14.normal.task1.Rectangle;
import a1.lesson14.normal.task1.ShapeCalculator;
import a1.lesson14.normal.task1.Triangle;

public class Player {
    private String name;
    private int points;

    public Player(String name) {
        this.name = name;
    }

    public void earnPoints (Circle c) {
        System.out.printf (c.getClass().getSimpleName() + " : %.2f\n", ShapeCalculator.calculateArea(c));
        System.out.println ("You won 5 points!");
        points+=5;
    }

    public void earnPoints (Triangle t) {
        System.out.printf (t.getClass().getSimpleName() + " : %.2f\n", ShapeCalculator.calculateArea(t));
        System.out.println ("You won 10 points!");
        points+=10;
    }

    public void earnPoints (Rectangle r) {
        System.out.printf (r.getClass().getSimpleName() + " : %.2f\n", ShapeCalculator.calculateArea(r));
        System.out.println ("You won 15 points!");
        points+=15;
    }

    public void getPlayer() {
        System.out.println (name + " has " + points + " points");
    }
}
