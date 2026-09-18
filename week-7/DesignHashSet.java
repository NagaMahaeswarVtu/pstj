import java.util.*;

public class DesignHashSet.java {
    ArrayList<Integer> set = new ArrayList<>();

    void add(int key) {
        if (!set.contains(key))
            set.add(key);
    }

    void remove(int key) {
        set.remove(Integer.valueOf(key));
    }

    boolean contains(int key) {
        return set.contains(key);
    }

    public static void main(String[] args) {
        DesignHashSet h = new DesignHashSet();

        h.add(10);
        h.add(20);

        System.out.println("Contains 10: " + h.contains(10));

        h.remove(10);

        System.out.println("Contains 10: " + h.contains(10));
    }
}
