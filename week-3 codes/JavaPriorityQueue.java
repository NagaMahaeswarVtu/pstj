import java.util.*;

public class JavaPriorityQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        System.out.println("Priority Queue: " + queue);

        System.out.println("Elements removed according to priority:");

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

        System.out.println();

        sc.close();
    }
}