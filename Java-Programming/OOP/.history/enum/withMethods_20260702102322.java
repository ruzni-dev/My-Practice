enum Level {
    LOW, MEDIUM, HIGH;

    public void display() {
        System.out.println("Level is: " + this);
    }
}

public class withMethods {
    public static void main(String[] args) {
        Level l = Level.HIGH;
        l.display();
    }
}
