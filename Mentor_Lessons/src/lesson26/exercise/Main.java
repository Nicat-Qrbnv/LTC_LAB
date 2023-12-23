package lesson26.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(List.of(
                "Short",
                "MediumLength",
                "ThisIsAQuiteLongString",
                "Sdf",
                "ReasonablyLong",
                "Adf",
                "StringLength",
                "AnotherLongStringWithDifferentLength"
        ));

        List<String> list = stringList.stream().sorted((s1, s2) -> {
            int s1len = s1.length();
            int s2len = s2.length();

            int s1first = s1.charAt(0);
            int s2first = s2.charAt(0);
            return s1len != s2len ? s1len - s2len : s1first - s2first;
        }).toList();

        list.forEach(System.out::println);
    }
}
