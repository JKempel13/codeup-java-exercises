package shapes;

public class square extends Rectangle {

    public square (double side) {
        super(side,side);
    }

    @Override
    public double getArea () {
        return Math.pow(super.length,2);
    }
    @Override
    public double getPerimeter (){
        return super.length* 4;
    }
}
