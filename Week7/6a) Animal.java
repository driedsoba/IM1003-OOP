public class Animal {   // superclass

    // private instance variables
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[" +
                "name=" + "\"" + name + "\"" +
                "]";
    }
}
