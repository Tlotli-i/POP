public class SingleInheritance {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();   
        Dog dog = new Dog();
        dog.eat();
    }
}
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
