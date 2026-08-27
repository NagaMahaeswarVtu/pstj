import java.util.*;

public class MoveZeroes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int position = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < n; i++) {

            if (nums[i] != 0) {
                nums[position] = nums[i];
                position++;
            }
        }

        // Fill remaining positions with zero
        while (position < n) {
            nums[position] = 0;
            position++;
        }

        System.out.println(
                "After moving zeroes: " +
                Arrays.toString(nums)
        );

        sc.close();
    }
}
