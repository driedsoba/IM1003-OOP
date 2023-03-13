public class Mammal extends Animal {    // Animal is a Mammal

    public Mammal(String name) {
        super(name);
    }

    // toString method invoking Superclass toString method
    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}
