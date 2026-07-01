// This is a simple Java program that demonstrates the use of constructors. The `Student` class has a constructor that initializes the `name` and `age` attributes. In the `main` method, we create an instance of the `Student` class and print out the student's name and age.

public class thsKeywrd {
    public static void main(String[] args) {
        Student s = new Student("Ali", 22);
        System.out.println(s.name + " " + s.age);
    }
}

class Student {
    String name;            
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}