package Lab_5_6;

public class MovablePoint implements Movable {

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint (int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "x = " + x +
                ", y = " + y +
                ", xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed;
    }

    @Override
    public void moveUp() {
        y = y+ySpeed;
    }

    @Override
    public void moveDown() {
        y = y-ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}