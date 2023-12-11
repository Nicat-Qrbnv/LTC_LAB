package a1.lesson14.normal.task1;

public class ShapeCalculator {

    public static double calculateArea (Circle crc) {
        return 3.14 * crc.getRadius() * crc.getRadius();
    }

    public static double calculateArea (Triangle trg) {
        return trg.getHeight() * trg.getSide() / 2;
    }

    public static double calculateArea (Rectangle rct) {
        return rct.getSide1() * rct.getSide2();
    }

}
