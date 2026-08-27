import java.util.Scanner;

public class DetermineStringHalvesAlike {

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' ||
               ch == 'i' || ch == 'o' ||
               ch == 'u' ||
               ch == 'A' || ch == 'E' ||
               ch == 'I' || ch == 'O' ||
               ch == 'U';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int mid = s.length() / 2;
        int firstCount = 0;
        int secondCount = 0;

        for (int i = 0; i < mid; i++) {
            if (isVowel(s.charAt(i))) {
                firstCount++;
            }
        }

        for (int i = mid; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                secondCount++;
            }
        }

        System.out.println(
            "Are the two halves alike? " +
            (firstCount == secondCount)
        );

        sc.close();
    }
}
