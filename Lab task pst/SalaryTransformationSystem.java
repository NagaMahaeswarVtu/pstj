import java.util.*;

public class SalaryTransformationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read N
        int n = sc.nextInt();

        // Read salaries and increase each by 10%
        List<Integer> updatedSalaries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int salary = sc.nextInt();
            int updatedSalary = (int) (salary * 1.10);
            updatedSalaries.add(updatedSalary);
        }

        // Print updated salaries
        updatedSalaries.stream()
                .forEach(salary -> System.out.print(salary + " "));
    }
}