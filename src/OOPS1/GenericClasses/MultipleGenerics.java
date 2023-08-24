package OOPS1.GenericClasses;


class Test1<T,U>{
    T obj1; // an object type of type T
    U obj2; // an object type of type U
//    Constructor
    Test1(T obj1,U obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

//    To print objects of T and U
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
public class MultipleGenerics {
    public static void main(String[] args) {
        Test1<String,Integer> obj= new Test1<String,Integer>("Vishal",45);
        obj.print();
    }
}
