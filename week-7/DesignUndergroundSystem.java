import java.util.*;

public class DesignUndergroundSystem {
    HashMap<Integer, String> station = new HashMap<>();
    HashMap<Integer, Integer> time = new HashMap<>();
    HashMap<String, int[]> data = new HashMap<>();

    void checkIn(int id, String s, int t) {
        station.put(id, s);
        time.put(id, t);
    }

    void checkOut(int id, String s, int t) {
        String route = station.get(id) + "-" + s;
        int[] d = data.getOrDefault(route, new int[2]);

        d[0] += t - time.get(id);
        d[1]++;

        data.put(route, d);
    }

    double getAverageTime(String a, String b) {
        int[] d = data.get(a + "-" + b);
        return (double) d[0] / d[1];
    }

    public static void main(String[] args) {
        DesignUndergroundSystem u =
                new DesignUndergroundSystem();

        u.checkIn(1, "A", 3);
        u.checkOut(1, "B", 8);

        System.out.println("Average Time: "
                + u.getAverageTime("A", "B"));
    }
}

