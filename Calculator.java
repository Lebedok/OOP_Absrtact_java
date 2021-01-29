package OOP.Abstraction.Abstract.Shape;

public class Calculator {

    public static void main(String[] args) {

        Rectangle rc = new Rectangle("Rectangle", 10.5, 5.5);

        System.out.println(rc.getArea());
        System.out.println(rc.getPerimeter());

        Triangle tr = new Triangle("Triangle", 3, 4, 5, 3);

        tr.draw();
        System.out.println(tr.getArea());
        System.out.println(tr.getPerimeter());
    }
}
