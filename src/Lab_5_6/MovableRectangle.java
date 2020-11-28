package Lab_5_6;

public class MovableRectangle implements Movable {

    private MovablePoint leftUp;
    private MovablePoint rightDown;

    public MovableRectangle (int x1, int x2, int y1, int y2, int x1Speed, int x2Speed, int y1Speed, int y2Speed) {
        if(checkSpeed(x1Speed,x2Speed) && checkSpeed(y1Speed,y2Speed))
            {
                this.leftUp = new MovablePoint(x1, y1, x1Speed, y1Speed);
                this.rightDown = new MovablePoint(x2, y2, x2Speed, y2Speed);
            }
        else
            {
                System.out.println("wrong speed");
            }
    }

    public boolean checkSpeed (int speed1, int speed2) {
        if(speed1==speed2) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "leftUp = (" + leftUp.x + ";" + leftUp.y + ")     rightDown = (" + rightDown.x + ";" + rightDown.y + ")     " +
                "xSpeed = " + leftUp.xSpeed + "     ySpeed = " + rightDown.ySpeed;
    }

    @Override
    public void moveUp() {
        leftUp.y += leftUp.ySpeed;
        rightDown.y += rightDown.ySpeed;
    }

    @Override
    public void moveDown() {
        leftUp.y -= leftUp.ySpeed;
        rightDown.y -= rightDown.ySpeed;
    }

    @Override
    public void moveLeft() {
        leftUp.x -= leftUp.xSpeed;
        rightDown.x -= rightDown.xSpeed;
    }

    @Override
    public void moveRight() {
        leftUp.x += leftUp.xSpeed;
        rightDown.x += rightDown.xSpeed;
    }
}
