// Student class inherits Person and implements Borrowable
class Student extends Person implements Borrowable {

    public Student(String name, int id) {
        super(name, id);
    }

    @Override
    public void borrowItem() {
        System.out.println(name + " borrowed a library item.");
    }

    @Override
    public void returnItem() {
        System.out.println(name + " returned a library item.");
    }
}