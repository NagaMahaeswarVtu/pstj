import java.time.LocalDate;
import java.util.Scanner;

public class DayOfTheYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (YYYY-MM-DD): ");
        String input = sc.next();

        LocalDate date = LocalDate.parse(input);

        int dayNumber = date.getDayOfYear();

        System.out.println("Day of the year: " + dayNumber);

        sc.close();
    }
}
