public class MethodOverridingWithInheritance {

    public static void main(String[] args) {
    Person person = new Person();
    person.display();
    Student student = new Student();
    student.display();
    }
}
class Person {
    void display() {
        System.out.println("This is a person.");
    }
}
class Student extends Person {
    @Override
    void display() {
        System.out.println("This is a student.");
    }
}
