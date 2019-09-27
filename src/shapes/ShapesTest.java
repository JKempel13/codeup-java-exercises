package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        myShape = new Square(6);

        Measurable myShape1;
        myShape1 = new Rectangle(6,2);


        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());
    }
}
