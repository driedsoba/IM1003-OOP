public class MonsterC extends MonsterB implements CanSwim {

    public MonsterC(String name) {
        super(name);
        System.out.println("C created");
    }

    public void swim() {
        System.out.println("C swims");
    }

    @Override
    public void fly() {
        System.out.println("C flies");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
