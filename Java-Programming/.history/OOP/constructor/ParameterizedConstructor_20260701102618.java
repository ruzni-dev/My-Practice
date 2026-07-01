package constructor;
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Ali", 22);
        Student s2 = new Student("Sara", 20);

        s1.display();
        s2.display();
    }
}

class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}