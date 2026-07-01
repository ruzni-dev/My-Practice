package constructor;

public class thisKeyword {
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