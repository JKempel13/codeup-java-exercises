package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());


        Rectangle box2 = new square(5);
        System.out.println((int)box2.getPerimeter());
        System.out.println((int)box2.getArea());
    }
}
