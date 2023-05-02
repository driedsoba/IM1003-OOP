public abstract class Monster {

    protected String name;

    public Monster(String name) {
        this.name = name;
    }

    public abstract void move();

    public String toString() {
        return this.getClass().getSimpleName() +   "[name=" + name + "]";
    }
}
