import java.util.*;

public class StringToInteger {

    public static int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        // Remove leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Sign
        int sign = 1;

        if (i < n && (s.charAt(i) == '+' ||
                      s.charAt(i) == '-')) {

            if (s.charAt(i) == '-') {
                sign = -1;
            }

            i++;
        }

        long result = 0;

        // Read digits
        while (i < n &&
               Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            result = result * 10 + digit;

            // Integer overflow
            if (sign * result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign * result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        int result = myAtoi(input);

        System.out.println("Converted integer: " + result);

        sc.close();
    }
}
