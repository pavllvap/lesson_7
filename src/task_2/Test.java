package task_2;

public class Test {
    public static void main(String[] args) {
        Printable printable = new CEO();
        Printable printable1 = new Developer();
        Printable printable2 = new Booker();
        printable.printPosition();
        printable1.printPosition();
        printable2.printPosition();
    }
}
