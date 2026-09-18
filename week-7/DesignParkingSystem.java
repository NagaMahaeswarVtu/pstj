import java.util.*;

public class DesignParkingSystem {
    int big, medium, small;

    DesignParkingSystem(int b, int m, int s) {
        big = b;
        medium = m;
        small = s;
    }

    boolean addCar(int type) {
        if (type == 1 && big > 0) {
            big--;
            return true;
        }
        if (type == 2 && medium > 0) {
            medium--;
            return true;
        }
        if (type == 3 && small > 0) {
            small--;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Big spaces: ");
        int b = sc.nextInt();

        System.out.print("Medium spaces: ");
        int m = sc.nextInt();

        System.out.print("Small spaces: ");
        int s = sc.nextInt();

        DesignParkingSystem p = new DesignParkingSystem(b, m, s);

        System.out.print("Enter car type (1=Big, 2=Medium, 3=Small): ");
        int type = sc.nextInt();

        System.out.println(p.addCar(type) ? "Car Parked" : "Parking Full");

        sc.close();
    }
}

