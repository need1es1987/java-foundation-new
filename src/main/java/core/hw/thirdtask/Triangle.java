package core.hw.thirdtask;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return (area);
    }

    @Override
    public double getPerimeter() {
        double perimeter = sideA + sideB + sideC;
        return (perimeter);
    }
}
