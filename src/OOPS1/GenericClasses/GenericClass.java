package OOPS1.GenericClasses;


// We use < > to specify Parameter type
class Test<T>{
    // An object of type T is declared
    T obj;
    Test(T obj){
        this.obj=obj;
    }
    public T getObj() {
        return this.obj;
    }
}
public class GenericClass {
    public static void main(String[] args) {
//Instance of Integer  type
        Test<Integer> iobj = new Test<Integer>(15);
        System.out.println(iobj.getObj());

        //Instance of Integer  type
        Test<String> iobjs = new Test<String>("Vishal Sharma");
        System.out.println(iobjs.getObj());
    }
}
