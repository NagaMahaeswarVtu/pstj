import java.util.*;
import java.util.stream.*;

public class RemoveElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to remove: ");
        int value = sc.nextInt();

        int[] result = Arrays.stream(arr)
                .filter(x -> x != value)
                .toArray();

        System.out.println("Array after removing " + value + ": "
                + Arrays.toString(result));

        System.out.println("New length: " + result.length);

        sc.close();
    }
}