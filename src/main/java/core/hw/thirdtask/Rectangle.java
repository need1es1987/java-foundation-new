package core.hw.thirdtask;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    @Override
    public double getArea() {
        double area = sideA * sideB;
        return (area);
    }

    @Override
    public double getPerimeter() {
        double perimeter = (sideA + sideB) * 2;
        return (perimeter);
    }
}
