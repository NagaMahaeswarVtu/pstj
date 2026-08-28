import java.util.*;

public class StringMatching {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter words:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i != j &&
                    words[j].contains(words[i])) {

                    result.add(words[i]);

                    break;
                }
            }
        }

        System.out.println(
                "Matching strings: " + result
        );

        sc.close();
    }
}
