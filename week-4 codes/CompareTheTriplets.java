import java.util.*;

public class CompareTheTriplets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aliceScore = 0;
        int bobScore = 0;

        System.out.println("Enter Alice's 3 scores:");

        int[] alice = new int[3];

        for (int i = 0; i < 3; i++) {
            alice[i] = sc.nextInt();
        }

        System.out.println("Enter Bob's 3 scores:");

        int[] bob = new int[3];

        for (int i = 0; i < 3; i++) {
            bob[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {

            if (alice[i] > bob[i]) {
                aliceScore++;
            } else if (alice[i] < bob[i]) {
                bobScore++;
            }
        }

        System.out.println(
                "Alice: " + aliceScore +
                " Bob: " + bobScore
        );

        sc.close();
    }
}