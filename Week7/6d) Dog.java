public class Dog extends Mammal { // Dog is a Mammal and an Animal

    // constructor invoking Mammal Superclass constructor
    public Dog(String name) {
        super(name);
    }

    // do not need to override greets method as it is not in Superclass Mammal
    public void greets() {
        System.out.println("Woof");
    }

    // method overloading greets()
    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    // toString method overriding toString method in Superclass Mammal
    public String toString() {
        return "Dog" + "[" + super.toString() + "]";
    }
}
