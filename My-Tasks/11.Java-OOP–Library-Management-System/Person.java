// Base class for Inheritance
class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayPersonInfo() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }
}