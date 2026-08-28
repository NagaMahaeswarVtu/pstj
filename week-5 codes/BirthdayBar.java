import java.util.*;

public class BirthdayBar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of squares: ");
        int n = sc.nextInt();

        int[] chocolate = new int[n];

        System.out.println("Enter chocolate values:");

        for (int i = 0; i < n; i++) {
            chocolate[i] = sc.nextInt();
        }

        System.out.print("Enter required sum (m): ");
        int m = sc.nextInt();

        System.out.print("Enter required length (d): ");
        int d = sc.nextInt();

        int count = 0;

        for (int i = 0; i <= n - d; i++) {

            int sum = 0;

            for (int j = i; j < i + d; j++) {
                sum += chocolate[j];
            }

            if (sum == m) {
                count++;
            }
        }

        System.out.println("Number of possible segments: " + count);

        sc.close();
    }
}
