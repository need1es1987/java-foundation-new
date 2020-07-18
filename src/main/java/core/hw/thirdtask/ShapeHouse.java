package core.hw.thirdtask;

public class ShapeHouse {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(15, 8, 21);
        System.out.println("Площадь треугольника со сторонами: " + triangle.getSideA() + ", " + triangle.getSideB()
                + ", " + triangle.getSideC() + " = " + triangle.getArea());
        System.out.println("Периметр треугольника со сторонами: " + triangle.getSideA() + ", " + triangle.getSideB()
                + ", " + triangle.getSideC() + " = " + triangle.getPerimeter());

        Square square = new Square(15.2);
        System.out.println("Площадь квадрата со стороной: " + square.getSideA() + " = " + square.getArea());
        System.out.println("Периметр квадрата со стороной: " + square.getSideA() + " = " + square.getPerimeter());

        Rectangle rectangle = new Rectangle(28, 7);
        System.out.println("Площадь прямоугольника со сторонами: " + rectangle.getSideA() + ", " + rectangle.getSideB()
                + " = " + rectangle.getArea());
        System.out.println("Периметр прямоугольника со сторонами: " + rectangle.getSideA() + ", " + rectangle.getSideB()
                + " = " + rectangle.getPerimeter());
    }

}
