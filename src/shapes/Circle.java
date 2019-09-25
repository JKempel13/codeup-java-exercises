package shapes;

import util.Input;

public class Circle {
    private double radius;
    Input test = new Input();


    public Circle(double radius) {
        System.out.println("what is the radius?");
        double userInput = test.getDouble();
        System.out.println(userInput);

    }
    public double getArea(){
        return Math.PI * (radius * radius);
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

}
