public class Bat extends Mammal{
    
    public Bat(){
        setEnergyLevel(300);
    }

    public void fly(){
        int x = getEnergyLevel() - 50;
        setEnergyLevel(x);
        System.out.println("Fufufufu, vuelo muy alto pero mi energia baja -50, tengo " + getEnergyLevel() + " de energia");
    }

    public void eatHumans(){
        int x = getEnergyLevel() + 25;
        setEnergyLevel(x);
        System.out.println("Bueno, no importa, tengo " + getEnergyLevel() + " de energia");
    }

    public void attackTown(){
        int x = getEnergyLevel() - 100;
        setEnergyLevel(x);
        System.out.println("*ataca la ciudad epicamente*, tengo " + getEnergyLevel() + " de energia");
    }
}
