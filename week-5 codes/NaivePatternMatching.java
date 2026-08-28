import java.util.*;

public class NaivePatternMatching {

    public static void search(
            String text,
            String pattern) {

        int n = text.length();
        int m = pattern.length();

        boolean found = false;

        System.out.println("Pattern found at indexes:");

        for (int i = 0; i <= n - m; i++) {

            int j;

            for (j = 0; j < m; j++) {

                if (text.charAt(i + j) !=
                    pattern.charAt(j)) {

                    break;
                }
            }

            if (j == m) {

                System.out.print(i + " ");

                found = true;
            }
        }

        if (!found) {
            System.out.print("No match found");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter pattern: ");
        String pattern = sc.nextLine();

        search(text, pattern);

        sc.close();
    }
}
