package Lesson23.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LetterFrequencyCalculator {

    private HashMap <Character, Integer> letters = new HashMap<>();

    public void findLetterFreq (String st) {
        char[] chars = st.toCharArray();

        for (char c : chars) {

            if (letters.containsKey(c)) {
                letters.replace(c, (letters.get(c) + 1));
            } else {
                letters.put(c, 1);
            }

        }

        System.out.println (st + "\n" + letters.entrySet());
    }
}
