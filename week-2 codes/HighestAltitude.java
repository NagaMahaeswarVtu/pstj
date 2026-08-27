import java.util.*;

public class HighestAltitude {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of changes: ");
        int n = sc.nextInt();

        int[] gain = new int[n];

        System.out.println("Enter altitude changes:");
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        int altitude = 0;
        int highest = 0;

        for (int x : gain) {

            altitude += x;

            highest = Math.max(highest, altitude);
        }

        System.out.println("Highest Altitude: " + highest);

        sc.close();
    }
}