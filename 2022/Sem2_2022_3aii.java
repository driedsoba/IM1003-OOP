public class Point2D implements PointBase {

    protected int x;
    protected int y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String describe() {
        return "(" + this.x + "," + this.y + ")";
    }

    @Override
    public double distance() {  // distance from origin
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double distance(Point2D another) {   // distance from another point
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }
}
