package test;

import java.util.*;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Ann", "Bob", "Carol", "David", "Fred"};
        String[] randomList = randomlySelectedValues(10, names,
                () -> new Random().nextInt(0, names.length));
        System.out.println(Arrays.toString(randomList));

    }

    public static String[] randomlySelectedValues (int count, String[] values, Supplier<Integer> s) {

        String[] selectedValues = new String[count];
        for (int i = 0; i < count; i++) {
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }
}
