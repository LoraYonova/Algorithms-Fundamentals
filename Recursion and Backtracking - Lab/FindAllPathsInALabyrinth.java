package recursionAndBacktrackingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllPathsInALabyrinth {
    static List<Character> path = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = Integer.parseInt(scan.nextLine());
        int col = Integer.parseInt(scan.nextLine());

        char [][] matrix = new char[row][col];

        for (int i = 0; i < row; i++) {
            String input = scan.nextLine();
            matrix[i] = input.toCharArray();
        }

        findPath(matrix, 0, 0, ' ');


    }

    private static void findPath(char[][] matrix, int row, int col, char direction) {

        if (!isInnBound(matrix, row, col) || matrix[row][col] == 'V' || matrix[row][col] == '*') {
            return;
        }

        path.add(direction);

        if (matrix[row][col] == 'e') {
            printPath();
            path.remove(path.size() - 1);
            return;
        }

        matrix[row][col] = 'V';

        findPath(matrix, row - 1, col, 'U');
        findPath(matrix, row + 1, col, 'D');
        findPath(matrix, row, col - 1, 'L');
        findPath(matrix, row, col + 1, 'R');

        matrix[row][col] = '-';
        path.remove(path.size() - 1);
    }

    private static void printPath() {
        for (int i = 1; i < path.size() ; i++) {
            System.out.print(path.get(i));
        }
        System.out.println();

    }

    private static boolean isInnBound(char[][] matrix, int row, int col) {
        return row < matrix.length && row >= 0 && col < matrix[row].length && col >= 0;
    }
}
