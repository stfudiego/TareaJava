/**
 * StringManipulator
 */
public class StringManipulator {

    // public static String trimAndConcat(String cadena1,String cadena2) {

    //     String respuesta = cadena1.trim().concat(cadena2.trim());

    //     return respuesta;
    // }        

    // public int getIndexOrNull(String cadenaN, char letter) {
        
    //    return cadenaN.indexOf(letter);
    // }

    // public int getIndexOrNull(String word, String xd) {
        
    //     String lol = xd;
    //     return word.indexOf(lol);
    // }

    public String concatSubstring(String palabra1, int i, int j, String palabra2) {
        String resultado = (palabra1.substring(i,j)).concat(palabra2);
        return resultado;
    }
}