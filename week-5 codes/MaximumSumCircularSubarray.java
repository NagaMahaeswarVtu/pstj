import java.util.*;

public class MaximumSumCircularSubarray {

    public static int kadaneMax(int[] arr) {

        int current = arr[0];
        int maximum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            current = Math.max(
                    arr[i],
                    current + arr[i]
            );

            maximum = Math.max(maximum, current);
        }

        return maximum;
    }

    public static int kadaneMin(int[] arr) {

        int current = arr[0];
        int minimum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            current = Math.min(
                    arr[i],
                    current + arr[i]
            );

            minimum = Math.min(minimum, current);
        }

        return minimum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        int normalMaximum = kadaneMax(arr);

        int minimumSubarray = kadaneMin(arr);

        int circularMaximum =
                totalSum - minimumSubarray;

        // If all elements are negative
        if (normalMaximum < 0) {
            circularMaximum = normalMaximum;
        }

        int answer = Math.max(
                normalMaximum,
                circularMaximum
        );

        System.out.println(
                "Maximum Circular Subarray Sum: " + answer
        );

        sc.close();
    }
}
