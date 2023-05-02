public class MonsterB extends Monster implements CanFly {

    public MonsterB(String name) {
        super(name);
        System.out.println("B created");
    }

    @Override
    public void move() {
        System.out.println("B moves");
    }

    @Override
    public void fly() {
        System.out.println("B flies");
    }
}
