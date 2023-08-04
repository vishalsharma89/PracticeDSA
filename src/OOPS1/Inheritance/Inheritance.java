package OOPS1.Inheritance;

class Box {
    public double width;
    public double height;
    public double depth;

    // construct clone of an object
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box(Box ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
}

class BoxWeight extends Box {
    double weight; // weight of box

    // construct clone of an object

    BoxWeight(BoxWeight ob) { // pass object to constructor
        super(ob);
        weight = ob.weight;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Box box = new Box(4,4,4);


    }
}
