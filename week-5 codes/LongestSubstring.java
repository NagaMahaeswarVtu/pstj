import java.util.*;

public class LongestSubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String s = sc.nextLine();

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            while (set.contains(current)) {

                set.remove(s.charAt(left));

                left++;
            }

            set.add(current);

            maxLength = Math.max(
                    maxLength,
                    right - left + 1
            );
        }

        System.out.println(
                "Length of longest substring: " +
                maxLength
        );

        sc.close();
    }
}
