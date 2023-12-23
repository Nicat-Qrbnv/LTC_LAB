package lesson25.exercise;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 5, 3, 7, 2, 8, 5, 9, 7);

        ArrayList<Integer> uniqueNumbers = findUniqueNumbers(numbers);

        System.out.println (numbers);
        System.out.println (uniqueNumbers);
    }

    private static ArrayList<Integer> findUniqueNumbers (List<Integer> nums) {

//        ArrayList<Integer> temp = new ArrayList<>(List.copyOf(nums));
//        Collections.sort(temp);
        ArrayList<Integer> unqNumbers = new ArrayList<>();

        for (int n : nums) {
            if (!unqNumbers.contains(n)) {
                unqNumbers.add(n);
            }
        }

        return unqNumbers;
    }
}
