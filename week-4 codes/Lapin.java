import java.util.*;

public class Lapin {

    public static boolean isLapindrome(String s) {

        int n = s.length();

        int[] left = new int[26];
        int[] right = new int[26];

        int mid = n / 2;

        // Left half
        for (int i = 0; i < mid; i++) {
            left[s.charAt(i) - 'a']++;
        }

        // Right half
        int start = (n % 2 == 0) ? mid : mid + 1;

        for (int i = start; i < n; i++) {
            right[s.charAt(i) - 'a']++;
        }

        return Arrays.equals(left, right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();

            if (isLapindrome(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
