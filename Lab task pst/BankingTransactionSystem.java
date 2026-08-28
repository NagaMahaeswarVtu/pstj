import java.util.Scanner;

public class BankingTransactionSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of transactions
        int n = sc.nextInt();

        int balance = 0;

        // Process transactions
        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            int amount = sc.nextInt();

            if (operation.equalsIgnoreCase("Deposit")) {
                balance += amount;
            } 
            else if (operation.equalsIgnoreCase("Withdrawal")) {
                balance -= amount;
            }
        }

        // Display final balance
        System.out.println(balance);

        sc.close();
    }
}
