import java.util.*;

public class JavaDeque {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter window size: ");
        int m = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> frequency = new HashMap<>();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {

            deque.addLast(arr[i]);

            frequency.put(
                    arr[i],
                    frequency.getOrDefault(arr[i], 0) + 1
            );

            if (deque.size() > m) {

                int removed = deque.removeFirst();

                frequency.put(
                        removed,
                        frequency.get(removed) - 1
                );

                if (frequency.get(removed) == 0) {
                    frequency.remove(removed);
                }
            }

            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, frequency.size());
            }
        }

        System.out.println("Maximum unique numbers: " + maxUnique);

        sc.close();
    }
}