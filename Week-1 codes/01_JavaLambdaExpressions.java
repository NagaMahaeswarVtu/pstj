import java.util.Scanner;
import java.util.function.Predicate;

class JavaLambdaExpressions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Predicate<Integer> oddEven = n -> n % 2 != 0;

        Predicate<Integer> prime = n -> {
            if (n < 2) {
                return false;
            }

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        };

        Predicate<Integer> palindrome = n -> {
            String str = String.valueOf(n);
            String reverse = new StringBuilder(str)
                    .reverse()
                    .toString();

            return str.equals(reverse);
        };

        int t = sc.nextInt();

        while (t-- > 0) {

            int type = sc.nextInt();
            int number = sc.nextInt();

            if (type == 1) {
                System.out.println(
                        oddEven.test(number) ? "ODD" : "EVEN"
                );
            }
            else if (type == 2) {
                System.out.println(
                        prime.test(number) ? "PRIME" : "COMPOSITE"
                );
            }
            else if (type == 3) {
                System.out.println(
                        palindrome.test(number)
                                ? "PALINDROME"
                                : "NOT PALINDROME"
                );
            }
        }

        sc.close();
    }
}
