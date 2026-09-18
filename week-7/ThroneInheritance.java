import java.util.*;

public class ThroneInheritance {

    String king;
    HashMap<String, List<String>> children = new HashMap<>();
    HashSet<String> dead = new HashSet<>();

    ThroneInheritance(String k) {
        king = k;
    }

    void birth(String parent, String child) {
        children.computeIfAbsent(parent,
                x -> new ArrayList<>()).add(child);
    }

    void death(String name) {
        dead.add(name);
    }

    void dfs(String name, List<String> order) {
        if (!dead.contains(name))
            order.add(name);

        for (String child :
                children.getOrDefault(name,
                new ArrayList<>()))
            dfs(child, order);
    }

    public static void main(String[] args) {
        ThroneInheritance t =
                new ThroneInheritance("King");

        t.birth("King", "Alice");
        t.birth("King", "Bob");
        t.birth("Alice", "Charlie");

        t.death("Alice");

        List<String> order = new ArrayList<>();
        t.dfs("King", order);

        System.out.println(order);
    }
}

