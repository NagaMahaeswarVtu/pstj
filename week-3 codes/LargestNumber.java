import java.util.*;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        String[] numbers = new String[n];

        System.out.println("Enter numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.next();
        }

        Arrays.sort(numbers, (a, b) ->
                (b + a).compareTo(a + b)
        );

        if (numbers[0].equals("0")) {
            System.out.println("Largest Number: 0");
            sc.close();
            return;
        }

        StringBuilder result = new StringBuilder();

        for (String number : numbers) {
            result.append(number);
        }

        System.out.println("Largest Number: " + result);

        sc.close();
    }
}