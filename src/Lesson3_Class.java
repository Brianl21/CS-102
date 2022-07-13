package CS102;

public class Lesson3_Class {
    public static void main(String[] args) {
        //constructor a circle with default radius = 1
        Circle c1 = new Circle();
        System.out.println(c1.radius);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        c1.setRadius(10);
        System.out.println(c1.radius);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        Circle c2 = new Circle(20);
        System.out.println(c2.radius);
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());

        Test t1 = new Test();
        System.out.println(t1.a);
    }
}

class Circle {
    //date field
    double radius;

    //constructors
    //default constructor
    Circle() {
        radius = 1;
    }

    Circle(double r) {
        radius = r;
    }

    //method
    void setRadius(double r) {
        radius = r;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
class Test{
    int a = 2;
    Test(){

    }
    Test( int aa){
        a= aa;
    }
}
