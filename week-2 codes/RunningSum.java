import java.util.*;
import java.util.stream.*;

public class RunningSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];

        int[] sum = {0};

        result = Arrays.stream(arr)
                .map(x -> {
                    sum[0] += x;
                    return sum[0];
                })
                .toArray();

        System.out.println("Running Sum: " + Arrays.toString(result));

        sc.close();
    }
}