package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
    Input input = new Input();
    Circle circle = new Circle(input.getDouble("Give me the radius:"));
        System.out.println("Circumference = " + circle.getCircumference());
        System.out.println("Area = " + circle.getArea());
    }
}
