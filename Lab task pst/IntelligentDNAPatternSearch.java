import java.util.*;

public class IntelligentDNAPatternSearch {

    // Build LPS (Longest Prefix Suffix) array
    static int[] buildLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];

        int len = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    // KMP pattern searching
    static void searchPattern(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        int[] lps = buildLPS(pattern);

        int i = 0; // Text index
        int j = 0; // Pattern index

        boolean found = false;

        while (i < n) {

            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                // Pattern found
                System.out.print((i - j) + " ");
                found = true;

                j = lps[j - 1];
            } else if (i < n && text.charAt(i) != pattern.charAt(j)) {

                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        if (!found) {
            System.out.print("-1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read DNA sequence
        String text = sc.nextLine();

        // Read pattern
        String pattern = sc.nextLine();

        searchPattern(text, pattern);

        sc.close();
    }
}
