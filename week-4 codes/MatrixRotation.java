import java.util.*;

public class MatrixRotation {

    public static void rotateLayer(
            int[][] matrix,
            int top,
            int left,
            int bottom,
            int right,
            int rotations) {

        List<Integer> elements = new ArrayList<>();

        // Top row
        for (int j = left; j <= right; j++) {
            elements.add(matrix[top][j]);
        }

        // Right column
        for (int i = top + 1; i <= bottom; i++) {
            elements.add(matrix[i][right]);
        }

        // Bottom row
        for (int j = right - 1; j >= left; j--) {
            elements.add(matrix[bottom][j]);
        }

        // Left column
        for (int i = bottom - 1; i > top; i--) {
            elements.add(matrix[i][left]);
        }

        int size = elements.size();

        rotations = rotations % size;

        int index = 0;

        // Top row
        for (int j = left; j <= right; j++) {
            matrix[top][j] =
                    elements.get((index + rotations) % size);
            index++;
        }

        // Right column
        for (int i = top + 1; i <= bottom; i++) {
            matrix[i][right] =
                    elements.get((index + rotations) % size);
            index++;
        }

        // Bottom row
        for (int j = right - 1; j >= left; j--) {
            matrix[bottom][j] =
                    elements.get((index + rotations) % size);
            index++;
        }

        // Left column
        for (int i = bottom - 1; i > top; i--) {
            matrix[i][left] =
                    elements.get((index + rotations) % size);
            index++;
        }
    }

    public static void rotateMatrix(
            int[][] matrix,
            int rows,
            int cols,
            int rotations) {

        int layers = Math.min(rows, cols) / 2;

        for (int layer = 0; layer < layers; layer++) {

            int top = layer;
            int left = layer;

            int bottom = rows - 1 - layer;
            int right = cols - 1 - layer;

            rotateLayer(
                    matrix,
                    top,
                    left,
                    bottom,
                    right,
                    rotations
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        System.out.print("Enter number of rotations: ");
        int rotations = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        rotateMatrix(
                matrix,
                rows,
                cols,
                rotations
        );

        System.out.println("Rotated Matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
