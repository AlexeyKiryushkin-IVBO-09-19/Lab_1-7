package Lab_4;

public class ShapeTest {
    public static void main(String[] args) {
        Circle lab_4 = new Circle(6);
        Shape example = new Square(5, "red", true);
        System.out.println(example.toString());
        lab_4.getRadius();
        lab_4.setRadius(7);
        System.out.println(lab_4.toString());
    }
}
