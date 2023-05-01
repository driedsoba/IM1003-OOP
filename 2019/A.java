public abstract class A implements X {
    private String name;

    public A(String name) {
        this.name = name;
    }

    public abstract void run();

    public void hop() {
        System.out.println("A hop");
    }
}
