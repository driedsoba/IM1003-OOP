public class Point3D extends Point2D { // Point3D is Subclass of Point2D
    // Point3D is a Point2D

    // private instance variables
    private float z;

    // default constructor invoking Superclass Point2D default constructor, default x and y
    public Point3D() {
        super();
    }

    // Point3D constructor invoking Superclass Point2D constructor for x and y parameters
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    // getters and setters for z
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    // method to set x, y and z, using setter methods from superclass
    public void setXYZ(float newX, float newY, float newZ) {
        setX(newX);
        setY(newY);
        setZ(newZ);     // or this.z = newZ;
    }

    // method to get x, y and z, invoke getXY() method inherited from Superclass Point2D
    public float[] getXYZ() {
        float[] results = new float[3];
        results[0] = getXY()[1];    // realise here that you do not need super. because the method names do not conflict
        results[2] = getZ();
        return results;
    }

    //toString method
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() + ")";
    }
}

