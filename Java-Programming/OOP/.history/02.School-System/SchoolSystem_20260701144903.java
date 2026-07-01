// Abstract Person class demonstrates abstraction and encapsulation.
// It provides a common interface for different kinds of people in the system.
abstract class Person {
    private String name;   // Encapsulation: hide the name field from direct access.

    // Constructor initializes the shared name property for every Person.
    Person(String name) {
        this.name = name;
    }

    // Getter method provides controlled access to the private name field.
    public String getName() {
        return name;
    }

    // Abstract method forces subclasses to provide their own role description.
    abstract void role();
}

// Student is a concrete subclass of Person with its own age property.
class Student extends Person {

    private int age;  // Encapsulation: age is private to Student.

    // Student constructor calls the parent Person constructor to set name.
    Student(String name, int age) {
        super(name);
        this.age = age;
    }

    // Getter for the student's age.
    public int getAge() {
        return age;
    }

    // Method overriding: Student provides its own implementation of role().
    @Override
    void role() {
        System.out.println("Role: Student");
    }

    // Student-specific behavior method.
    void study() {
        System.out.println(getName() + " is studying");
    }
}

// Teacher is another subclass of Person with a subject specialization.
class Teacher extends Person {

    private String subject;  // Encapsulation: subject is private to Teacher.

    // Teacher constructor sets the name and the subject taught.
    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    // Teacher-specific implementation of the abstract role() method.
    @Override
    void role() {
        System.out.println("Role: Teacher");
    }

    // Teacher-specific behavior method.
    void teach() {
        System.out.println(getName() + " teaches " + subject);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {

        // Polymorphism example: use Person reference for different subclasses.
        Person p1 = new Student("Ruzni", 22);
        Person p2 = new Teacher("Mr. Ali", "Math");

        // Runtime polymorphism occurs here. The overridden method in each
        // concrete class is executed based on the actual object type.
        p1.role();
        p2.role();

        System.out.println();

        // Cast back to child types to call methods that are not in Person.
        Student s = (Student) p1;
        s.study();

        Teacher t = (Teacher) p2;
        t.teach();
    }
}
