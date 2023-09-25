package task4;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4, 5);;
        printArea(rectangle);
        printArea(square);
    }
    public static void printArea(Rectangle r) {
        System.out.println(r.area());
    }
}
