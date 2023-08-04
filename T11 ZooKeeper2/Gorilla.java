public class Gorilla extends Mammal {
    
    public Gorilla() {
    }

    public int throwSomething(){
        int x = getEnergyLevel() - 5;
        setEnergyLevel(x);
        System.out.println("Yo lanzar algo, yo perder -5 de energia, yo tener " + getEnergyLevel());
        return getEnergyLevel();
    }

    public int eatBananas(){
        int x = getEnergyLevel() + 10;
        setEnergyLevel(x);
        System.out.println("Yo comer banana, QUE RICOOOO, yo ganar +10 de energia, yo tener " + getEnergyLevel());
        return getEnergyLevel();
    }

    public int climb(){
        int x = getEnergyLevel() - 10;
        setEnergyLevel(x);
        System.out.println("Yo trepar cima del arbol, yo perder -10 de energia, yo tener " + getEnergyLevel());
        return getEnergyLevel();
    }
}
