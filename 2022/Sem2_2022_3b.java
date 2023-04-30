public class TestMain {

    public static void main(String[] args) {

        Point2D point2a = new Point2D(1, 0);
        Point2D point2b = new Point2D(2, 0);
        System.out.println(point2a.distance(point2b));  // 1, 1.0

        Point2D point3a = new Point3D(5, 0, 0);
        Point2D point3b = new Point3D(8, 0, 0);
        System.out.println(point3a.distance(point3b));  // 2, 3.0

        System.out.println(point3a.distance(point2a)); // 3, 4.0  invokes Point2D, down-casting superclass to subclass
        System.out.println(point2b.distance(point3b)); // 4, 6.0  invokes Point2D, up-casting subclass to superclass

        Point2D point2c = new Point3D(10, 0, 0);    // up-casting
        System.out.println(point2c.distance(point2a)); // 5, 9.0  invokes Point2D
        System.out.println(point2c.distance(point3a)); // 6, 5.0  invokes Point2D
        System.out.println(point3b.distance(point2c)); // 7, 2.0  invokes Point2D

        PointBase p1a = new Point2D(8, 0);        // up-casting
        System.out.println(p1a.distance());            // 8, 8.0
        //System.out.println(p1a.distance(point2a));   // error

    }
}
