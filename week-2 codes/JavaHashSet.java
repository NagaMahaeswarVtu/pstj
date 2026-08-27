import java.util.*;

public class JavaHashSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pairs: ");
        int n = sc.nextInt();

        Set<String> set = new HashSet<>();

        System.out.println("Enter pairs:");

        for (int i = 0; i < n; i++) {

            String first = sc.next();
            String second = sc.next();

            String pair = first + "#" + second;

            set.add(pair);

            System.out.println(set.size());
        }

        sc.close();
    }
}