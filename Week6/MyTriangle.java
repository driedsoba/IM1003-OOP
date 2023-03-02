public class MyTriangle {

    // private instance variables
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;


    /* Note that both constructors have the same function
       just that they are created and used differently based on syntax */
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    // two methods unique to MyTriangle class
    public double getPerimeter() {
        double len1, len2, len3;
        len1 = Math.abs(v1.distance(v2));
        len2 = Math.abs(v2.distance(v3));
        len3 = Math.abs(v3.distance(v1));
        return len1 + len2 + len3;
    }

    public String getType() {
        double len1, len2, len3;
        len1 = Math.abs(v1.distance(v2));
        len2 = Math.abs(v2.distance(v3));
        len3 = Math.abs(v3.distance(v1));

        if (len1 == len2 && len2 == len3) {
            return "Equilateral";
        } else if (len1 != len2 && len2 != len3) {
            return "Scalene";
        } else {
            return "Isosceles";
        }
    }

    // toString method re-using MyPoint class' toString
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1.toString() +
                "," + "v2=" + v2.toString() +
                "," + "v3=" + v3.toString() +
                "]";
    }
}
