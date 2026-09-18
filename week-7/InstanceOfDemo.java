import java.util.*;

class Student {}
class Rockstar {}
class Hacker {}

public class InstanceOfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int student = 0, rockstar = 0, hacker = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            Object obj;

            if (s.equalsIgnoreCase
                ("Student"))
                obj = new Student();
            else if (s.equalsIgnoreCase("Rockstar"))
                obj = new Rockstar();
            else
                obj = new Hacker();

            if (obj instanceof Student) student++;
            if (obj instanceof Rockstar) rockstar++;
            if (obj instanceof Hacker) hacker++;
        }

        System.out.println(student + " " + rockstar + " " + hacker);
        sc.close();
    }
}
