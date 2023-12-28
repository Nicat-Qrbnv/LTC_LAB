package lesson24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //task1
        numberSignChecker(-1);

        roundDoubles(2.535);

        //task2
        List<String> stringList = new ArrayList<>(List.of(
        "0",
        "01",
        "012",
        "0123",
        "01234",
        "012345",
        "0123456",
        "01234567"));
        shortStringFilterer(stringList);

        LinkedList <Integer> nums = new LinkedList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        skipFirstTwo(nums);

        //task3
        averageLengthFinder(stringList);

        productOfInts(List.of(2, 4, 10));

    }

    static void numberSignChecker (int num) {

        if (num != 0) {
            Predicate<Integer> isPositive = (n) -> (n > 0);
            System.out.println(isPositive.test(num) ? num + " is positive" : num + " is negative");
        } else {
            System.out.println (num + " isn't either");
        }
        System.out.println ();

    }

    static void roundDoubles (double num) {

        Function<Double, Long> rounder = Math::round;
        System.out.println ("Rounding: %.3f -> %d".formatted(num, rounder.apply(num)));
        System.out.println ();

    }

    static void shortStringFilterer(List<String> strs) {

        List<String> list = strs.stream().filter(str -> str.length() > 5).sorted().toList();
        System.out.println (list);
        System.out.println ();

    }

    static void skipFirstTwo (List<? extends Number> lst) {

        List<? extends Number> list = lst.stream().skip(2).toList();
        System.out.println (list);
        System.out.println ();

    }

    static void averageLengthFinder (List<String> strs) {
        int sum = strs.stream().mapToInt(String::length).sum();
        System.out.println ("%d / %d = %.2f".formatted(sum, strs.size(), ((double) sum/strs.size())));
    }

    static void productOfInts (List<Integer> nums) {
        int reduce = nums.stream().mapToInt(i -> i).reduce(1, Math::multiplyExact);
        System.out.println (reduce);
    }
}
