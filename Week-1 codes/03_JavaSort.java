import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class JavaSort {

    static class Student {
        int id;
        String name;
        double cgpa;

        Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(new Student(id, name, cgpa));
        }

        students.sort((a, b) -> {

            // Higher CGPA first
            int result = Double.compare(b.cgpa, a.cgpa);

            if (result != 0) {
                return result;
            }

            // Alphabetical name
            result = a.name.compareTo(b.name);

            if (result != 0) {
                return result;
            }

            // Lower ID first
            return Integer.compare(a.id, b.id);
        });

        for (Student student : students) {
            System.out.println(student.name);
        }

        sc.close();
    }
}
