import java.util.*;

public class TimeConversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time in 12-hour format: ");

        String time = sc.next();

        String period = time.substring(8, 10);

        int hour = Integer.parseInt(
                time.substring(0, 2)
        );

        String minutesSeconds = time.substring(2, 8);

        if (period.equals("AM")) {

            if (hour == 12) {
                hour = 0;
            }

        } else {

            if (hour != 12) {
                hour += 12;
            }
        }

        System.out.printf(
                "24-hour format: %02d%s%n",
                hour,
                minutesSeconds
        );

        sc.close();
    }
}
