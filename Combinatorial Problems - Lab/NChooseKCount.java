package combinatorialProblems;

import java.util.Scanner;

public class NChooseKCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int k = Integer.parseInt(scan.nextLine());

        int binomial = binomial(n, k);

        System.out.println(binomial);

    }

    private static int binomial(int n, int k) {
        if (k > n) {
            return 0;
        }

        if (k == 0 || k == n) {
            return 1;
        }

        return binomial(n - 1, k - 1) + binomial(n - 1, k);


    }
}
