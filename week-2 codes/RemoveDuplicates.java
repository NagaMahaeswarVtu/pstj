import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n == 0) {
            System.out.println("Result: []");
            sc.close();
            return;
        }

        int index = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] != arr[i - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }

        int[] result = Arrays.copyOf(arr, index);

        System.out.println("Array after removing duplicates: "
                + Arrays.toString(result));

        System.out.println("Number of unique elements: " + index);

        sc.close();
    }
}