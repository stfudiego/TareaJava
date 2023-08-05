public class Ninja extends Human {
    
    public Ninja(){
        setStealth(10);
    }

    public void steal(Human objetivo){
        objetivo.setHealth(objetivo.getHealth()-getStealth());
        setHealth(getHealth()+getStealth());
        System.out.println(getClass().getSimpleName()+" roba "+ getStealth()+" de salud a "+objetivo.getClass().getSimpleName()+ " y este ahora tiene "+ objetivo.getHealth() + " de vida");
    }

    public void runAway(){
        setHealth(10);
        System.out.println("Me escapo epicamente "+ getHealth());
    }
}
