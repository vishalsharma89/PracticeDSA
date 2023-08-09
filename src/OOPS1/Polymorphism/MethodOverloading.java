package OOPS1.Polymorphism;


class calc{

    int multiply(int a, int b){
        return a*b;
    }
    int multiply(int a, int b,int c){
        return a*b*c;
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        calc mul = new calc();
        System.out.println(mul.multiply(5,6));
        System.out.println(mul.multiply(5,6,8));
    }
}
