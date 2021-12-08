package recursionAndBacktrackingLab;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum {
    public static int[] number;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         number = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();


       int sum = sumNumber(number,0);
        System.out.println(sum);

    }

    private static int sumNumber(int[] number,int index) {

        if (index >= number.length) {
            return 0;
        }

       return number[index] + sumNumber(number, index + 1);
    }
}
