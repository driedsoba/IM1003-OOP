public class MyPoint {

    private int x;
    private  int y;

    public MyPoint() {  // default counstructor
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    // method to return x and y in a 2-element int array
    public int[] getXY() {
        int[] results = new int[2];
        results[0] = x;
        results[1] = y;
        return results;
    }

    // method to set values of x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /* Method to calculate distance from this point to given point (x,y)
       usage: MyPoint p1 = new MyPoint(1, 2);
       p1.distance(3,4); */
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Method takes MyPoint instance as argument, p1.distance(p2)
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Method to calculate distance from origin
    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    // toString method
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
