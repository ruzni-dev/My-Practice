public class ex3 {
    public static void main(String[] args) {
        demo1 object = new demo1(10, 20);
        object.display();
        
    }

    

    public class demo1 {
        int a;
        int b;

        public demo1(int a, int b) {
            this.a = a;
            this.b = b;
        }
        
        public void display() {
            System.out.println(a + " " + b);
        }
    }
}
