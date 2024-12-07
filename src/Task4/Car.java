package Task4;

public class Car extends Vehicle {
    public void startEngine() {
        System.out.println("Car is working");
    }

}
//If we want to make this code to work out, we have two ways to solve the problem. The first one is we can delete "final" from the first class, the second one is we can create new method in subclass.