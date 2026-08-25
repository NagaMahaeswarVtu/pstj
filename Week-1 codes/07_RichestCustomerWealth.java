import java.util.Scanner;

class RichestCustomerWealth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int customers = sc.nextInt();
        int accounts = sc.nextInt();

        int maxWealth = 0;

        for (int i = 0; i < customers; i++) {

            int wealth = 0;

            for (int j = 0; j < accounts; j++) {
                wealth += sc.nextInt();
            }

            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }

        System.out.println(maxWealth);

        sc.close();
    }
}
