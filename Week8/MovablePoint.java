public class MovablePoint implements Movable {


    // private means that member can only be accessed in its own class
    // protected means can only be accessed in its own package/ subclass of its class in another package
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")" + ",speed=(" + this.xSpeed + "," + this.ySpeed + ")";
    }

    @Override
    public void moveUp() {
        this.y -= ySpeed;
    }

    @Override
    public void moveDown() {
        this.y += ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += xSpeed;
    }




}
