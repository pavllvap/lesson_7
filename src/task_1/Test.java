package task_1;

public class Test {
    public static void main(String[] args) {

        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(2, 3, 4, 5);
        figures[1] = new Rectangle(7, 8);
        figures[2] = new Circle(9);
        figures[3] = new Triangle(3, 4, 5, 6);
        figures[4] = new Circle(9);
        double sumPerimeter = 0;
        double sumSquare = 0;
        for (Figure fig : figures) {
            sumPerimeter += fig.calcPerimeter();
            sumSquare += fig.calcSquare();
        }

        System.out.println(sumPerimeter);
        System.out.println(sumSquare);
    }
}
