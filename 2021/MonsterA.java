public class MonsterA extends Monster{

    public MonsterA(String name) {
        super(name);
        System.out.println("A created");
    }

    @Override
    public void move() {
        System.out.println("A moves");
    }

    public void run() {
        System.out.println("A runs");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
