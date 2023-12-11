package a1.lesson14.normal.task3;

public class MathOperations {
    private static String operator;
    public static void inputConverter (String input) {
        getOperators(input);
        String[] operands = input.replaceAll(" ", "").split(operator);
        if (isDouble(operands[0]) || isDouble(operands[1])) {
            double[] num = new double[] {Double.parseDouble(operands[0]), Double.parseDouble(operands[1])};
            switch (operator) {
                default -> System.out.println ("Wrong Operation!");
                case "\\+" -> sum(num[0], num[1]);
                case "\\-" -> extract(num[0], num[1]);
                case "\\*" -> multiply(num[0], num[1]);
                case "\\/" -> divide(num[0], num[1]);
            }
        } else {
            int[] num = new int[] {Integer.parseInt(operands[0]), Integer.parseInt(operands[1])};
            switch (operator) {
                default -> System.out.println ("Wrong Operation!");
                case "\\+" -> sum(num[0], num[1]);
                case "\\-" -> extract(num[0], num[1]);
                case "\\*" -> multiply(num[0], num[1]);
                case "\\/" -> divide(num[0], num[1]);
            }
        }
    }

    public static void getOperators (String input) {
        if (input.indexOf('+') > 0) {
            operator = "\\+";
        } else if (input.indexOf('-') > 0) {
            operator = "\\-";
        } else if (input.indexOf('*') > 0) {
            operator = "\\*";
        } else if (input.indexOf('/') > 0) {
            operator = "\\/";
        }
    }

    public static boolean isDouble(String numS) {
        return numS.indexOf('.') > 0;
    }

    //sum
    public static void sum (int a, int b) {
        System.out.println (a + " + " + b + " = " + (a+b));
    }
    public static void sum (double a, double b) {
        System.out.printf ("%.2f + %.2f = %.2f\n", a, b, (a+b));
    }

    //extract
    public static void extract (int a, int b) {
        System.out.println (a + " - " + b + " = " + (a-b));
    }
    public static void extract (double a, double b) {
        System.out.printf ("%.2f - %.2f = %.2f\n", a, b, (a-b));
    }

    //multiply

    public static void multiply (int a, int b) {
        System.out.println (a + " * " + b + " = " + (a*b));
    }
    public static void multiply (double a, double b) {
        System.out.printf ("%.2f * %.2f = %.2f\n", a, b, (a*b));
    }

    //divide

    public static void divide (int a, int b) {
        System.out.printf ("%d / %d = %d and remainder %d\n",a, b, (a/b), (a%b));
    }
    public static void divide (double a, double b) {
        System.out.printf ("%.2f / %.2f = %.2f\n",a, b, (a/b));
    }
}
