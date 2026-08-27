import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NumberOfDaysBetweenDates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (YYYY-MM-DD): ");
        String date1Input = sc.next();

        System.out.print("Enter second date (YYYY-MM-DD): ");
        String date2Input = sc.next();

        LocalDate date1 = LocalDate.parse(date1Input);
        LocalDate date2 = LocalDate.parse(date2Input);

        long days = Math.abs(
                ChronoUnit.DAYS.between(date1, date2)
        );

        System.out.println("Number of days between dates: " + days);

        sc.close();
    }
}