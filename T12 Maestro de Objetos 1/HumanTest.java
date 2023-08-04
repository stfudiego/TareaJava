public class HumanTest {
    public static void main(String[] args) {
        Ninja ninja = new Ninja();
        Wizard mago = new Wizard();
        mago.displayHealth();
        ninja.attack(mago);
        mago.displayHealth();
    }
}
