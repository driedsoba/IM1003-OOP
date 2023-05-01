public class B extends A {

    public B(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("B walk");
    }

    @Override
    public void run() {
        System.out.println("B run");
    }

    public void run(int speed) {
        System.out.println("B run at speed =" + speed);
    }
}
