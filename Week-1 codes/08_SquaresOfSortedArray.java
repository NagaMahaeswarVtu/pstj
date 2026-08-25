import java.util.Scanner;

class SquaresOfSortedArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {

                result[i] = leftSquare;
                left++;

            } else {

                result[i] = rightSquare;
                right--;
            }
        }

        for (int i = 0; i < n; i++) {

            System.out.print(result[i]);

            if (i < n - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();

        sc.close();
    }
}
