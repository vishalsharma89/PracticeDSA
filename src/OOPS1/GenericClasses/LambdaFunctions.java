package OOPS1.GenericClasses;


interface FuncInterface{
//    An abstract Function
    void abstractFun(int x);

//    A non-abstract Function
    default void normalFunc(){
        System.out.println("Hello");
    }
}

public class LambdaFunctions {
    public static void main(String[] args) {
//        Lambda expression to implement above functional interface.
//        This interface by default implements abstraction()
        FuncInterface fobj = (int x)->System.out.println(2*x);

        fobj.abstractFun(5);
    }
}
