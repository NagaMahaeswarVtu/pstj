import java.util.*;

public class FindAndReplacePattern {

    public static boolean matchesPattern(
            String word,
            String pattern) {

        if (word.length() != pattern.length()) {
            return false;
        }

        Map<Character, Character> wordToPattern =
                new HashMap<>();

        Map<Character, Character> patternToWord =
                new HashMap<>();

        for (int i = 0; i < word.length(); i++) {

            char w = word.charAt(i);
            char p = pattern.charAt(i);

            // Word -> Pattern
            if (wordToPattern.containsKey(w) &&
                wordToPattern.get(w) != p) {

                return false;
            }

            // Pattern -> Word
            if (patternToWord.containsKey(p) &&
                patternToWord.get(p) != w) {

                return false;
            }

            wordToPattern.put(w, p);
            patternToWord.put(p, w);
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter words:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        System.out.print("Enter pattern: ");
        String pattern = sc.next();

        System.out.println("Matching words:");

        for (String word : words) {

            if (matchesPattern(word, pattern)) {
                System.out.println(word);
            }
        }

        sc.close();
    }
}
