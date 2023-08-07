import java.util.ArrayList;

public class Pokedex extends AbstractPokemon{

    private ArrayList<Pokemon> myPokemons;

    public Pokedex(){
        myPokemons = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon){
        this.myPokemons.add(pokemon);
    }

    @Override
    public void listPokemon() {
        for (Pokemon pokemon : myPokemons) {
        System.out.println(pokemon.getName());
        }
    }

   
    
}
