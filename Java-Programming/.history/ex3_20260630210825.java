public class ex3 {
    public static void main(String[] args) {
        ex3 object = new ex3(10, 20);
        object.display();
        
    }

    int a;
    int b;

    public ex3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void display() {
        System.out.println(a + " " + b);
    }
}
