package core.hw.thirdtask;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Square extends Shape {

    private double sideA;

    @Override
    public double getArea() {
        double area = sideA * sideA;
        return (area);
    }

    @Override
    public double getPerimeter() {
        double perimeter = sideA * 4;
        return (perimeter);
    }
}
