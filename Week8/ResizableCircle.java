public class ResizableCircle extends Circle implements Resizable {
    // ResizableCircle is a Circle and implements Resizable interface

    public ResizableCircle(double radius) {
        super(radius);
    }


    /*System.out.println(1.2*1.5); ... 1.7999999999999998
      System.out.println(1.2*150/100) ... 1.8
     */
    @Override
    public void resize(int percent) {
        radius = (radius * percent) / 100.0;    // able to access radius field from parent class due to protected access modifier
    }

    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }
}
