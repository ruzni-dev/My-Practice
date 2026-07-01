// This is a simple Java program that demonstrates encapsulation. The `Student` class has private attributes `name` and `age`, and public getter and setter methods to access and modify these attributes. In the `main` method, we create an instance of the `Student` class, set the name and age, and then print them out.

class Student {
    private String name; // Private attribute, cannot be accessed directly from outside the class
    private int age; // Private attribute, cannot be accessed directly from outside the class

    // Public setter method to set the name
    public void setName(String name) {
        this.name = name;
    }
    
    // Public getter method to retrieve the name
    public String getName() {
        return name;
    }

    // Public setter method to set the age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }   

    // Public getter method to retrieve the age
    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Ruzni");
        s.setAge(22);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
