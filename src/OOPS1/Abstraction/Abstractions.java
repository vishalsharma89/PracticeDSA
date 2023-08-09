package OOPS1.Abstraction;


//Real-Life Example: A driver will focus on the car functionality (Start/Stop -> Accelerate/ Break),
// he/she does not bother about how the Accelerate/ brake mechanism works internally.
// And this is how the abstraction works.
// Abstract class
//
//Certain key points should be remembered regarding this pillar of OOPS as follows:
//
//    The class should be abstract if a class has one or many abstract methods
//    An abstract class can have constructors, concrete methods, static method, and final method
//    Abstract class can’t be instantiated directly with the new operator. It can be possible as shown in pre tag below:
//
//A b = new B();
//
//The child class should override all the abstract methods of parent else the child class should be declared with abstract keyword
abstract class Abstraction{
    abstract void add();
}

class cal extends Abstraction{

//    Hiding implementation details
    @Override
    void add() {
        System.out.println("sum is called");
    }
}

public class Abstractions {
    public static void main(String[] args) {
Abstraction obj = new cal();
obj.add();
    }
}
