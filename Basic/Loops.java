package Basic;

public class Loops {
    public static void main(String[] args) {
        System.out.println("For Loop:");
        ForLoop.run();

        System.out.println("While Loop:");
        WhileLoop.run();

        System.out.println("DoWhile Loop:");
        DoWhileLoop.run();
    }
}

class ForLoop {
    public static void run() {
        for (int currentIndex = 0; currentIndex <= 10; currentIndex++) {
            System.out.println(currentIndex);
        }
    }
}

class WhileLoop {
    public static void run() {
        int currentIndex = 0;

        while (currentIndex < 10) {
            System.out.println("Iteration: " + currentIndex);
            currentIndex++;
        }
    }
}

class DoWhileLoop {
    public static void run() {
        int currentIndex = 0;

        do {
            System.out.println("Iteration: " + currentIndex);
            currentIndex++;

        } while (currentIndex <= 5);
    }
}