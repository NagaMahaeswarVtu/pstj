import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        List<Integer> elements = new ArrayList<>(frequency.keySet());

        elements.sort((a, b) ->
                frequency.get(b) - frequency.get(a));

        System.out.print("Top " + k + " frequent elements: ");

        for (int i = 0; i < k; i++) {
            System.out.print(elements.get(i));

            if (i < k - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();

        sc.close();
    }
}