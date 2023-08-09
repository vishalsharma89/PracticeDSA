package OOPS1.Encapsulation;

//Encapsulation is the process of wrapping code and data together into a single unit.
//
//    Real-Life Example:
//
//    A capsule which is mixed of several medicines. The medicines are hidden data to the end user.


//In order to achieve encapsulation in java follow certain steps as proposed below:
//
//    Declare the variables as private
//    Declare the setters and getters to set and get the variable values

// A Java class which is a fully encapsulated class.
public class Car
{
    // private variable
    private String name;
    // getter method for name
    public String getName()
    {
        return name;

    }
    // setter method for name
    public void setName(String name)
    {
        this.name = name;
    }

}



