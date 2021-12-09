package combinatorialProblems;

import java.util.Scanner;

public class CombinationsWithRepetition {
    public static String[] elements;
    public static String[] combinations;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        elements = scan.nextLine().split("\\s+");

        int k = Integer.parseInt(scan.nextLine());

        combinations = new String[k];

        variation(0, 0);
    }

    private static void variation(int index, int start) {
        if (index == combinations.length) {
            print();
            return;
        }


        for (int i = start; i < elements.length; i++) {

            combinations[index] = elements[i];
            variation(index + 1, i);

        }
    }

    private static void print() {
        System.out.println(String.join(" ", combinations));
    }
}
