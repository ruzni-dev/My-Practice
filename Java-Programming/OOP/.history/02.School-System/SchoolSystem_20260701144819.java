abstract class Person {
    private String name;   // Encapsulation

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void role();  // abstraction (no body)
}

class Student extends Person {

    private int age;

    Student(String name, int age) {
        super(name);   // call parent constructor
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // Method overriding (Polymorphism)
    void role() {
        System.out.println("Role: Student");
    }

    void study() {
        System.out.println(getName() + " is studying");
    }
}

class Teacher extends Person {

    private String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    void role() {
        System.out.println("Role: Teacher");
    }

    void teach() {
        System.out.println(getName() + " teaches " + subject);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {

        // Polymorphism (parent reference, child object)
        Person p1 = new Student("Ruzni", 22);
        Person p2 = new Teacher("Mr. Ali", "Math");

        // Runtime Polymorphism (method overriding)
        p1.role();
        p2.role();

        // Casting back to access child methods
        Student s = (Student) p1;
        s.study();

        Teacher t = (Teacher) p2;
        t.teach();
    }
}
