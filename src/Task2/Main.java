package Task2;

public class Main {
    public static void main(String[] args) {
        Animal.speak();
        Dog.speak();

        Animal animal = new Animal();
        Animal dogAsAnimal = new Dog();


        Dog dog = new Dog();
        Animal.speak();
        dogAsAnimal.speak();

        Dog.speak();

    }

}
