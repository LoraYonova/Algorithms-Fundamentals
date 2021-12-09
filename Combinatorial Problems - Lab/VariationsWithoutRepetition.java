package combinatorialProblems;

import java.util.Scanner;

public class VariationsWithoutRepetition {
    public static String[] elements;
    public static String[] variations;
    public static boolean[] used;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        elements = scan.nextLine().split("\\s+");

        int k = Integer.parseInt(scan.nextLine());

        variations = new String[k];
        used = new boolean[elements.length];


        variation(0);
    }

    private static void variation(int index) {
        if (index == variations.length) {
            print();
            return;
        }


        for (int i = 0; i < elements.length; i++) {
            if (!used[i]) {
                used[i] = true;
                variations[index] = elements[i];
                variation(index + 1);
                used[i] = false;
            }
        }
    }

    private static void print() {
        System.out.println(String.join(" ", variations));
    }


}
