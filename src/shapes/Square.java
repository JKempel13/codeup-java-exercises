package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    void setLength(double length) {
        super.length = length;
    }

    @Override
    void setWidth(double width) {
        super.width = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * super.length;
    }

    @Override
    public double getArea() {
        return Math.pow(super.length, 2);
    }
}
