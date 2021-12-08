package recursionAndBacktrackingLab;

import java.util.Scanner;

public class RecursiveDrawing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        recursiveDrawing(n);

    }

    private static void recursiveDrawing(int n) {
        if (n == 0) {
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();

        recursiveDrawing(n - 1);

        for (int i = 1; i <= n ; i++) {
            System.out.print("#");
        }
        System.out.println();
    }


}
