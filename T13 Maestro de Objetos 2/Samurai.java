public class Samurai extends Human {
    
    public Samurai(){
        setHealth(200);
    }

    public void deathBlow(Human objetivo){
        objetivo.setHealth(0);
        setHealth(getHealth()/2);
        System.out.println("Golpe mortal a "+ objetivo.getClass().getSimpleName());
    }

    public void meditate(){
        setHealth(getHealth()+(getHealth()/2));
        System.out.println("Recupero salud: "+ getHealth());
    }

    public void howMany(){
        System.out.println(getClass().getSimpleName()+ " tiene " + getHealth() + " de salud");
    }
}
