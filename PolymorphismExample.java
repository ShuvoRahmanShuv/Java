class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow");
    }
}

class Lion extends Animal {
    @Override
    void makeSound() {
        System.out.println("Lion roars: Roar");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.makeSound();

        a = new Cat();
        a.makeSound();

        a = new Lion();
        a.makeSound();
    }
}
