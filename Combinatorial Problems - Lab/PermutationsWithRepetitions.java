package combinatorialProblems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PermutationsWithRepetitions {
    public static String[] elements;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        elements = scan.nextLine().split("\\s+");

        permute(0);

    }

    private static void permute(int index) {
        if (index == elements.length) {
            print(elements);
            return;
        }
        permute(index + 1);

        Set<String> swapped = new HashSet<>();
        swapped.add(elements[index]);

        for (int i = index + 1; i < elements.length; i++) {
            if (!swapped.contains(elements[i])) {
                swap(elements, index, i);
                permute(index + 1);
                swap(elements, index, i);
                swapped.add(elements[i]);
            }
        }

    }

    private static void swap(String[] elements, int index, int i) {
        String temp = elements[index];
        elements[index] = elements[i];
        elements[i] = temp;
    }


    private static void print(String[] temp) {
        System.out.println(String.join(" ", temp));
    }

}
