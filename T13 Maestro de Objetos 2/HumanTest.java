public class HumanTest {
    public static void main(String[] args) {
        Ninja ninja = new Ninja();
        Samurai samurai = new Samurai();
        Samurai samurai2 = new Samurai();
        Wizard mago = new Wizard();
        samurai.displayHealth();
        ninja.attack(samurai);
        samurai.displayHealth();
        mago.heal(samurai);
        mago.fireBall(ninja);
        mago.displayHealth();
        ninja.steal(mago);
        ninja.runAway();
        samurai2.deathBlow(mago);
        samurai2.meditate();
        samurai2.howMany();
    }
}
