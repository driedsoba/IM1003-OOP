public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    // Method unique to Dog class
    public void greets(Dog another) {
        System.out.println("Woooof");
    }

}
