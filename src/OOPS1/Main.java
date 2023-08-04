package OOPS1;

public class Main  {
    public static void main(String[] args) {

        Student student1=new Student();
        student1.rno=52;
        student1.name="Vishal Sharma";
        student1.marks=90.0f;
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
        Singleton obj=Singleton.getInstance();
    }
}
class Student{
    int rno;
    String name;
    float marks;
}