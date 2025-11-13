package WILLIAM_LIN.ALL_QUESTIONS_OOPS_CONCEPT.INHERITANCE_ALL_QUESTIONS.INHERITANCE_SUPER_BASICS.Inheritance_AnimalV1;

public class InheritanceAnimalDogV1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        Dog dog = new Dog();
        dog.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animals make sound:");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dogs bark:");
    }
}
