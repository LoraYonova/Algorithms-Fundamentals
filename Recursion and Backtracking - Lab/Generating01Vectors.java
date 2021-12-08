package recursionAndBacktrackingLab;

import java.util.Scanner;

public class Generating01Vectors {
    public static int[] element;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        element = new int[n];

        generatingVectors(0);

    }

    private static void generatingVectors(int index) {
        if (index >= element.length) {
            print();
            return;
        }

        for (int i = 0; i <= 1; i++) {
          element[index] = i;
        generatingVectors(index + 1);

        }

    }

    private static void print() {
        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i]);
        }
        System.out.println();

    }
}
