// 🔜 Abstraction (Abstract Class)
// ➤ Create an abstract class Shape with abstract method area().
// ➤ Implement concrete subclasses: Circle, Rectangle, and Triangle.

package OOPS;

abstract class Shape {
    abstract void area();

}
class Circle extends Shape{
    @Override
    void area(){
        System.out.println("Area = 2*pi*r");
    }
}

class Rectangle extends Shape{
    @Override
    void area(){
        System.out.println("Area = l*b");
    }
}
class RightTriangle extends Shape{
    @Override
    void area(){
        System.out.println("Area = 0.5 * l * b");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Circle cir = new Circle();
        RightTriangle rt = new RightTriangle();

        rec.area();
        cir.area();
        rt.area();
    }
}