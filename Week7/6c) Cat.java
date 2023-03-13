public class Cat extends Mammal { // Cat is a Mammal and is an Animal

    public Cat(String name) {
        super(name);
    }

    // method unique to Cat
    public void greets() {
        System.out.println("Meow");
    }

    // toString method invoking toString from Mammal
    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
