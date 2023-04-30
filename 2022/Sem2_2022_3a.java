public class Point3D extends Point2D {

    protected int z;

    public Point3D() {
        z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String describe() {
        return "(" + x + "," + y + "," + z + ")";
    }

    @Override
    public double distance() {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
}
