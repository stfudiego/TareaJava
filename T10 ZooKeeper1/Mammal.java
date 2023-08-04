class Mammal {

private int energyLevel;

public Mammal (){
    this.energyLevel = 100;
}

public void displayEnergy(){
    System.out.println("Yo tener " + energyLevel + " de energia!!! ");
}

public int getEnergyLevel() {
    return energyLevel;
}

public void setEnergyLevel(int energyLevel) {
    this.energyLevel = energyLevel;
}


}