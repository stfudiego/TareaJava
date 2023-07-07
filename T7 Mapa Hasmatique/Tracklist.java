import java.util.HashMap;
import java.util.Set;

/**
 * Tracklist
 */
public class Tracklist {

    public void organizarTracklist() {
        HashMap<String, String> tracklist = new HashMap<String, String>();

        tracklist.put("PASIEMPRE", "Porque yo no soy un artista de momento, yo soy un artista pa' siempre");
        tracklist.put("VOLVER","Mami, me dijeron que ya tienes a otro, pero no me has podido olvidar");
        tracklist.put("MOJABI GHOST","Mojave Ghost, y pa' la calle hoy salgo otra ve', ey");
        tracklist.put("FANTASMA","Baby, aquel día la pasamo' cabron. No sé porque no me volviste a buscar");

        Set<String> keys = tracklist.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(tracklist.get(key));
        }
            
        
        
    }
}