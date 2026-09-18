import java.util.*;

public class DesignBrowserHistory {
    ArrayList<String> history = new ArrayList<>();
    int current = 0;

    DesignBrowserHistory(String home) {
        history.add(home);
    }

    void visit(String url) {
        history.subList(current + 1, history.size()).clear();
        history.add(url);
        current++;
    }

    String back(int steps) {
        current = Math.max(0, current - steps);
        return history.get(current);
    }

    String forward(int steps) {
        current = Math.min(history.size() - 1, current + steps);
        return history.get(current);
    }

    public static void main(String[] args) {
        DesignBrowserHistory b =
                new DesignBrowserHistory("google.com");

        b.visit("youtube.com");
        b.visit("github.com");

        System.out.println("Back: " + b.back(1));
        System.out.println("Forward: " + b.forward(1));
    }
}
