package recursionAndBacktrackingLab;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

      int sum = recursiveFactorial(number);
        System.out.println(sum);
    }

    private static int recursiveFactorial(int number) {
        if (number == 1) {
            return 1;
        }

      return number * recursiveFactorial(number - 1);

    }
}
