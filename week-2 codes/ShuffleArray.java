import java.util.*;

public class ShuffleArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in each half: ");
        int n = sc.nextInt();

        int[] nums = new int[2 * n];

        System.out.println("Enter " + (2 * n) + " elements:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }

        System.out.println("Shuffled Array: " + Arrays.toString(result));

        sc.close();
    }
}