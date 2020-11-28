package Lab_5_6;

public class Tester {
    public static void main(String[] args) {
        MovableCircle test = new MovableCircle(0,0,2,2,4);
        test.moveUp();
        test.moveRight();
        System.out.println("circle - " + test.toString());

        MovablePoint p1 = new MovablePoint(-5,-5,1,1);
        p1.moveDown();
        p1.moveLeft();
        System.out.println("point - " + p1.toString());

        MovableRectangle rect = new MovableRectangle(0,5,3,0,1,1,3,3);
        System.out.println("(0) rect - " + rect.toString());
        rect.moveUp();
        rect.moveRight();
        System.out.println("(1) rect - " + rect.toString());
        rect.moveLeft();
        rect.moveDown();
        System.out.println("(2) rect - " + rect.toString());
    }
}
