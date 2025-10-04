
class Shape {
    double area() {
        return 0;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double area(){
    return Math.PI*radius*radius;
    }
}
class Triangle extends Shape{
    double base,height;
    Triangle(double base, double height){
        this.base=base;
        this.height=height;
    }
    double area(){
        return 0.5*base*height;
    }
}
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}
public class PolymorphsimShapeArea {
    public static void main(String[] args) {
        Shape s=new Shape();
        s=new Circle(8);
        System.out.println("Area of a Circle" +" "+s.area());
        s=new Triangle(5,7);
        System.out.println("Area of Triangle" +" "+s.area());
        s=new Rectangle(15,12);
        System.out.println("Area of Rectangle" +" "+s.area());

    }
}
