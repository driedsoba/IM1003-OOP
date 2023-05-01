public abstract class C extends A {

    public C(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("C walk");
    }

    @Override
    public void run() {
        System.out.println("C run");
    }
}
