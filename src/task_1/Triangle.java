package task_1;

public class Triangle extends Figure{

    private double height_side_1;
    private double side_1;
    private double side_2;
    private double side_3;



    public Triangle(double h, double side_1, double side_2, double side_3) {
        this.height_side_1 = h;
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
    }


    public double getHeight_side_1() {
        return height_side_1;
    }

    public void setHeight_side_1(double height_side_1) {
        this.height_side_1 = height_side_1;
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

    public double getSide_3() {
        return side_3;
    }

    public void setSide_3(double side_3) {
        this.side_3 = side_3;
    }

    @Override
    public double calcSquare() {
        return (side_1 * height_side_1) / 2;
    }

    @Override
    public double calcPerimeter() {
        return side_1 + side_2 + side_3;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "height_side_1=" + height_side_1 +
                ", side_1=" + side_1 +
                ", side_2=" + side_2 +
                ", side_3=" + side_3 +
                '}';
    }
}
