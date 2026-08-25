import java.util.Arrays;
import java.util.Scanner;

class JavaComparatorPractice {

    static class Person {
        String name;
        int marks;

        Person(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {

            String name = sc.next();
            int marks = sc.nextInt();

            people[i] = new Person(name, marks);
        }

        Arrays.sort(people, (a, b) -> {

            if (a.marks != b.marks) {
                return Integer.compare(b.marks, a.marks);
            }

            return a.name.compareTo(b.name);
        });

        for (Person person : people) {
            System.out.println(
                    person.name + " " + person.marks
            );
        }

        sc.close();
    }
}
