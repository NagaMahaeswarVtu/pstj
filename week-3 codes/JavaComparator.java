import java.util.*;

class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " " + marks;
    }
}

public class JavaComparator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Enter student name and marks:");

        for (int i = 0; i < n; i++) {

            String name = sc.next();
            int marks = sc.nextInt();

            students.add(new Student(name, marks));
        }

        students.sort((s1, s2) -> {

            if (s1.marks != s2.marks) {
                return Integer.compare(s2.marks, s1.marks);
            }

            return s1.name.compareTo(s2.name);
        });

        System.out.println("Sorted Students:");

        for (Student student : students) {
            System.out.println(student);
        }

        sc.close();
    }
} 
