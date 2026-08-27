import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter strings:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        Map<String, List<String>> map = new LinkedHashMap<>();

        for (String word : words) {

            char[] chars = word.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>())
                    .add(word);
        }

        System.out.println("Grouped Anagrams:");

        for (List<String> group : map.values()) {
            System.out.println(group);
        }

        sc.close();
    }
}