import java.util.*;

class StudentRecord {

    int id;
    String name;
    double cgpa;

    StudentRecord(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + cgpa;
    }
}

public class JavaSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        ArrayList<StudentRecord> students = new ArrayList<>();

        System.out.println("Enter ID, name and CGPA:");

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(
                    new StudentRecord(id, name, cgpa)
            );
        }

        students.sort((s1, s2) -> {

            int cgpaCompare =
                    Double.compare(s2.cgpa, s1.cgpa);

            if (cgpaCompare != 0) {
                return cgpaCompare;
            }

            return s1.name.compareTo(s2.name);
        });

        System.out.println("Sorted Students:");

        for (StudentRecord student : students) {
            System.out.println(student);
        }

        sc.close();
    }
}
