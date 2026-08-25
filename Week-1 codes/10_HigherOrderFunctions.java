import java.util.Scanner;
import java.util.function.Function;

class HigherOrderFunctions {

    static void processArray(
            int[] arr,
            Function<Integer, Integer> operation) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = operation.apply(arr[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Higher-order function using lambda
        processArray(arr, x -> x * 2);

        for (int i = 0; i < n; i++) {

            System.out.print(arr[i]);

            if (i < n - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();

        sc.close();
    }
}
