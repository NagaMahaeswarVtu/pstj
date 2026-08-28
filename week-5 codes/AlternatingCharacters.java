import java.util.*;

public class AlternatingCharacters {

    public static int minimumDeletions(String s) {

        int deletions = 0;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                deletions++;
            }
        }

        return deletions;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();

            int result = minimumDeletions(s);

            System.out.println(
                    "Minimum deletions: " + result
            );
        }

        sc.close();
    }
}
