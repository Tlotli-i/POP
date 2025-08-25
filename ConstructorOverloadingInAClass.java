public class ConstructorOverloadingInAClass {
    String name;
    int age;
    double salary;
    // Constructor with one parameter
    public ConstructorOverloadingInAClass(String name) {
        this.name = name;
    }
    // Constructor with two parameters
    public ConstructorOverloadingInAClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Constructor with three parameters
    public ConstructorOverloadingInAClass(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public static void main(String[] args){
        ConstructorOverloadingInAClass obj1 = new ConstructorOverloadingInAClass("Tlotlisang");
        ConstructorOverloadingInAClass obj2 = new ConstructorOverloadingInAClass("Tlotliso", 21);
        ConstructorOverloadingInAClass obj3 = new ConstructorOverloadingInAClass("Thabo", 25, 50000.0);
        
        System.out.println("Object 1: Name = " + obj1.name);
        System.out.println("Object 2: Name = " + obj2.name + ", Age = " + obj2.age);
        System.out.println("Object 3: Name = " + obj3.name + ", Age = " + obj3.age + ", Salary = " + obj3.salary);
    }
}
