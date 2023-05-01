public abstract class A implements X {
    private String name;

    A(String name) {
    }

    public abstract void run();

    public void hop() {
        System.out.println("A hop");
    }
}
