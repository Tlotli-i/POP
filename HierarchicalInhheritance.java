public class HierarchicalInhheritance {
    public static void main(String[] args){
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.roar();
        Lion lion = new Lion();
        lion.eat();
        lion.roar();
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
class Mamals{
    void eat(){
        System.out.println("This mamal eats food");
    }
}
class Tiger extends Mamals{
    void roar(){
        System.out.println("The tiger roars");
    }
}
class Lion extends Mamals{
    void roar(){
        System.out.println("The lion roars");
    }
}
class Cat extends Mamals{
    void meow(){
        System.out.println("The cat meows");
    }
}