public class Programa {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("pika", 50, "electrico");
        Pokedex pokedex = new Pokedex();
        
        Pokemon charizard = new Pokemon("chorizord", 90, "fuego volador");
        Pokemon squirtle = new Pokemon("escuero", 60, "agua");
        
        pokedex.addPokemon(squirtle);
        pokedex.addPokemon(pikachu);
        pokedex.addPokemon(charizard);
        pokedex.listPokemon();
        System.out.println(pokedex.pokemonInfo(pikachu));
        System.out.println(pokedex.pokemonInfo(squirtle));
       

        pikachu.attackPokemon(charizard);
        pikachu.attackPokemon(charizard);
        pikachu.attackPokemon(charizard);
        pikachu.attackPokemon(charizard);
        
        
        
    }
}
