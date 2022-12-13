package task_1;

public class Rectangle extends Figure{

    private double side_1;
    private double side_2;


    public Rectangle(double side_1, double side_2) {
        this.side_1 = side_1;
        this.side_2 = side_2;
    }

    public double getSide_1() {
        return side_1;
    }

    public void setSide_1(double side_1) {
        this.side_1 = side_1;
    }

    public double getSide_2() {
        return side_2;
    }

    public void setSide_2(double side_2) {
        this.side_2 = side_2;
    }

    @Override
    public double calcSquare() {
        return side_1 * side_2;
    }

    @Override
    public double calcPerimeter() {
        return side_1 * 2 + side_2 * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side_1=" + side_1 +
                ", side_2=" + side_2 +
                '}';
    }
}
