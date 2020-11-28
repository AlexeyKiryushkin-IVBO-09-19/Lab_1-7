package Lab_5_6;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "radius = " + radius +
                ";     center: x = " + center.x + " y = " + center.y +
                ";     xSpeed = " + center.xSpeed + ", ySpeed = " + center.ySpeed;
    }

    @Override
    public void moveUp() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }
}
