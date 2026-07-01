public class NoArgumentConstructor {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}

class Student {
    String name;

    Student() {
        name = "Ruzni";
    }

    void display() {
        System.out.println(name);
    }
}