abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal Constructor Called");
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    abstract void sound();
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " barks");
    }
}

public class Abstraction{
    public static void main(String[] args) {

        Dog d = new Dog("Tommy");

        d.eat();
        d.sleep();
        d.sound();
    }
}