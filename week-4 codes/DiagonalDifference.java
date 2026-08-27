import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int primary = 0;
        int secondary = 0;

        for (int i = 0; i < n; i++) {

            primary += matrix[i][i];

            secondary += matrix[i][n - 1 - i];
        }

        int difference = Math.abs(primary - secondary);

        System.out.println("Primary diagonal sum: " + primary);
        System.out.println("Secondary diagonal sum: " + secondary);
        System.out.println("Diagonal Difference: " + difference);

        sc.close();
    }
}
