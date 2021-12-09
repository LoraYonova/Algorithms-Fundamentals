package combinatorialProblems;

import java.util.Scanner;

public class VariationsWithRepetition {
    public static String[] elements;
    public static String[] variations;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        elements = scan.nextLine().split("\\s+");

        int k = Integer.parseInt(scan.nextLine());

        variations = new String[k];

        variation(0);
    }

    private static void variation(int index) {
        if (index == variations.length) {
            print();
            return;
        }


        for (int i = 0; i < elements.length; i++) {
            variations[index] = elements[i];
            variation(index + 1);

        }
    }

    private static void print() {
        System.out.println(String.join(" ", variations));
    }
}
