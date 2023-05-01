public abstract class D extends C {
    public D(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("D run");
    }
    public void fly() {
        System.out.println("D fly");
    }

    public void walk(int speed) {
        System.out.println("D walk at speed=" + speed);
    }
}
