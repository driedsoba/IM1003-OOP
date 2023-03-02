public class MyLine {

    // declaration of private instance variables of type MyPoint
    // line starts from begin = (x1, y1) to end = (x2, y2)
    private MyPoint begin;
    private MyPoint end;

    // Constructor with 4 parameters with begin (x1, y1) and end (x2,y2), to call MyLine(1, 2, 3, 4)
    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    // Constructor with 2 parameters of type MyPoint, to call MyLine(p1, p2)
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // getters and setters for private instance variables in MyLine class
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // getters and setters for private instance variables in MyPoint class
    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int newX) {
        begin.setX(newX);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int newY) {
        begin.setY(newY);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int newX) {
        end.setX(newX);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int newY) {
        end.setY(newY);
    }

    public int[] getBeginXY() {     // calling getXY() method from MyPoint
        return begin.getXY();
    }

    public void setBeginXY(int newX, int newY) {    // calling setXY() method from MyPoint
        begin.setXY(newX, newY);
    }

    public int[] getEndXY() {   // calling getXY() method from MyPoint
        return end.getXY();
    }

    public void setEndXY(int newX, int newY) {  // calling setXY method from MyPoint
        end.setXY(newX, newY);
    }

    // Re-using MyPoint class distance(MyPoint another) method to calculate length of line from begin to end
    public double getLength() {
        return begin.distance(end);
    }

    /* Unique method in MyLine class to calculate gradient
       four-quadrant inverse tangent, returns the
       counterclockwise angle measured in radians
       note that begin - end will get the wrong ans of -2.36 */
    public double getGradient() {
        return Math.atan2((end.getY() - begin.getY()), end.getX() - begin.getX());
    }

    // toString method which calls toString method in MyPoint
    public String toString() {
        return "MyLine[" +
               "begin=" + begin.toString() +
                "," + "end=" + end.toString() +
                "]";
    }



}
