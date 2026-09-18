class Animal {
    void walk() {
        System.out.println("I am walking");
    }

    void eat() {
        System.out.println("I am eating");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Bird b = new Bird();

        b.walk();
        b.eat();
        b.fly();
    }
}

