import java.util.*;

public class GradingStudents {

    static int grade(int g) {
        if (g < 38)
            return g;

        int next = ((g / 5) + 1) * 5;

        if (next - g < 3)
            return next;

        return g;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int g = sc.nextInt();
            System.out.println(grade(g));
        }

        sc.close();
    }
}

