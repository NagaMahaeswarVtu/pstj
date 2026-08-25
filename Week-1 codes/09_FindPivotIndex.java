import java.util.Scanner;

class FindPivotIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        int totalSum = 0;

        for (int i = 0; i < n; i++) {

            nums[i] = sc.nextInt();
            totalSum += nums[i];
        }

        int leftSum = 0;
        int pivotIndex = -1;

        for (int i = 0; i < n; i++) {

            int rightSum =
                    totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {

                pivotIndex = i;
                break;
            }

            leftSum += nums[i];
        }

        System.out.println(pivotIndex);

        sc.close();
    }
}
