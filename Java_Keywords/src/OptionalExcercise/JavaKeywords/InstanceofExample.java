package OptionalExcercise.JavaKeywords;
class Animal {}
class Dog extends Animal {}

public class InstanceofExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        // Check if the object belongs to a particular class
        System.out.println("animal is an instance of Animal: " + (animal instanceof Animal)); // true
        System.out.println("dog is an instance of Dog: " + (dog instanceof Dog)); // true
        System.out.println("dog is an instance of Animal: " + (dog instanceof Animal)); // true
        System.out.println("animal is an instance of Dog: " + (animal instanceof Dog)); // false
    }
}
