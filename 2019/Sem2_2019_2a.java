public class Point {
    private int x, y, z;

    Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int[] getXYZ() {
        int[] results = new int[3];
        results[0] = this.x;
        results[1] = this.y;
        results[2] = this.z;
        return results;
    }

    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point another) {
        int xDiff = Math.abs(this.x - another.x);
        int yDiff = Math.abs(this.y - another.y);
        int zDiff = Math.abs(this.z - another.z);
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
    }

    public String toString() {
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }
}
