public class Wizard extends Human {
    
    public Wizard(){
        setHealth(50);
        setIntelligence(8);
    }

    public void heal(Human objetivo){
        objetivo.setHealth(objetivo.getHealth()+getIntelligence());
        System.out.println(getClass().getSimpleName()+" curo a " + objetivo.getClass().getSimpleName()+ " en: "+getIntelligence()+", ahora tiene: "+ objetivo.getHealth());
    }

    public void fireBall(Human objetivo){
       objetivo.setHealth(objetivo.getHealth()-(getIntelligence()*3)); 
       System.out.println(getClass().getSimpleName()+" lanzo una bola de fuego a " + objetivo.getClass().getSimpleName()+ " y le daño en: "+(getIntelligence()*3)+", y ahora tiene: "+ objetivo.getHealth());
    }
}
