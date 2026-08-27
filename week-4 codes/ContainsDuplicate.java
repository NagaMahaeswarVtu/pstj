import java.util.*;

public class ContainsDuplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        boolean duplicate = false;

        for (int num : nums) {

            if (set.contains(num)) {
                duplicate = true;
                break;
            }

            set.add(num);
        }

        System.out.println("Contains duplicate: " + duplicate);

        sc.close();
    }
}
