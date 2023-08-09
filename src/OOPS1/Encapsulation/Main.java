package OOPS1.Encapsulation;
import OOPS1.Encapsulation.Car;
public class Main {
    public static void main(String[] args) {
        // creating instance of the encapsulated class
        Car car = new Car();

        // setting value in the name member

        car.setName("Honda");

        // getting value of the name member
        System.out.println(car.getName());
    }

}
