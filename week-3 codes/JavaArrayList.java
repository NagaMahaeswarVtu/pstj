import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Original ArrayList: " + list);

        System.out.print("Enter index to access: ");
        int index = sc.nextInt();

        System.out.println("Element at index " + index + ": "
                + list.get(index));

        System.out.print("Enter index to update: ");
        int updateIndex = sc.nextInt();

        System.out.print("Enter new value: ");
        int newValue = sc.nextInt();

        list.set(updateIndex, newValue);

        System.out.println("After update: " + list);

        System.out.print("Enter index to remove: ");
        int removeIndex = sc.nextInt();

        list.remove(removeIndex);

        System.out.println("After removal: " + list);

        sc.close();
    }
}
