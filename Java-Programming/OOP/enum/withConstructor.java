enum Size {
    SMALL(10),
    MEDIUM(20),
    LARGE(30);

    int value;

    Size(int value) {
        this.value = value;
    }
}

public class withConstructor {
    public static void main(String[] args) {
        System.out.println(Size.SMALL.value);
    }
}
