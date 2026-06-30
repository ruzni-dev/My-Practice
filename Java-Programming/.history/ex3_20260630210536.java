public class ex3 {
    public static void main(String[] args) {
        demo1 obj = new demo1(10, 20);
        obj.display();
        
    }

    int a;
    int b;

    public demo1(int a, int b) {
        this.a = 10;
        this.b = 20;
    }

    public display() {
        System.out.println(a + " " + b);
    }
}
