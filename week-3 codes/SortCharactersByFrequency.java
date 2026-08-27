import java.util.*;

public class SortCharactersByFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Map<Character, Integer> frequency = new HashMap<>();

        for (char c : input.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        List<Character> characters =
                new ArrayList<>(frequency.keySet());

        characters.sort((a, b) -> {

            int frequencyCompare =
                    Integer.compare(frequency.get(b), frequency.get(a));

            if (frequencyCompare != 0) {
                return frequencyCompare;
            }

            return Character.compare(a, b);
        });

        StringBuilder result = new StringBuilder();

        for (char c : characters) {

            int count = frequency.get(c);

            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        System.out.println("Sorted by frequency: " + result);

        sc.close();
    }
}