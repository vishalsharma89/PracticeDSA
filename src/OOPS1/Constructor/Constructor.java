package OOPS1.Constructor;


class Geeks{
//    Constructor
    Geeks(){
        System.out.println("Constructors called");
    }
}


class Default{
    int num;
    String name;
    float marks;
//    Constructor
    Default(){
        System.out.println("Default Constructor called");
    }
    Default(int num,String name, float marks){
        this.num=num;
        this.name=name;
        this.marks=marks;
    }
}
//    Copy Constructor
class Geek {
    // data members of the class.
    String name;
    int id;

    // Parameterized Constructor
    Geek(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    Geek(Geek obj2)
    {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Geeks geek = new Geeks();
        Default def = new Default();
        Default para=new Default(58,"Vishal",85);
        System.out.println(para.num);
        System.out.println(para.name);
        System.out.println(para.marks);

        // This would invoke the parameterized constructor.
        System.out.println("First Object");
        Geek geek1 = new Geek("Vishal", 68);
        System.out.println("GeekName :" + geek1.name
                + " and GeekId :" + geek1.id);

        System.out.println();

        // This would invoke the copy constructor.
        Geek geek2 = new Geek(geek1);
        System.out.println(
                "Copy Constructor used Second Object");
        System.out.println("GeekName :" + geek2.name
                + " and GeekId :" + geek2.id);
    }
}
