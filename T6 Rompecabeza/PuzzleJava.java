import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * PuzzleJava
 */
public class PuzzleJava {

    // 1.Suma de los numeros de un arreglo

    // public void sumarYMayoresArray(int [] array, int mayorA) {
    // int sum = 0;
    // for (int i = 0; i < array.length; i++) {
    // sum += array[i];
    // }

    // ArrayList<Integer> mayorArray = new ArrayList<Integer>();

    // for (int i = 0; i < array.length; i++) {
    // if (array[i] > mayorA) {
    // mayorArray.add(array[i]);
    // }
    // }

    // System.out.println(Arrays.toString(array));
    // System.out.println(sum);
    // System.out.println(mayorArray);
    // }

    // 2. Mezclar e imprimir Nombres de un Array

    // public void mezclarEImprimirNombres(String[] array,int caracteresMayorA) {

    // List<String> Lista = Arrays.asList(array);

    // Collections.shuffle(Lista);

    // System.out.println(Lista);

    // ArrayList<String> newArray = new ArrayList<>();

    // for (int i = 0; i < Lista.size(); i++) {
    // if (Lista.get(i).length() > caracteresMayorA) {
    // newArray.add(Lista.get(i));
    // }
    // }

    // System.out.println(newArray);
    // }

    // 3. Primera y ultima letra de un alfabeto mezclado

    // public void PrimerUltimaLetra() {

    // String [] alfabeto =
    // {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    // ArrayList<String> newAlfabeto = new ArrayList<>(Arrays.asList(alfabeto));

    // Collections.shuffle(newAlfabeto);

    // String primer = newAlfabeto.get(0);

    // String ultimo = newAlfabeto.get(25);

    // System.out.println(newAlfabeto);

    // System.out.println(ultimo);

    // if (newAlfabeto.get(0) == "a"|| newAlfabeto.get(0) == "e" ||
    // newAlfabeto.get(0) == "i" || newAlfabeto.get(0) == "o"|| newAlfabeto.get(0)
    // == "u") {
    // System.out.println(" Soy una vocal: " + primer);
    // }
    // else {
    // System.out.println(primer);
    // }
    // }

    // 4. Array 55-100 aleatorio

    // public void arrayRandom() {

    // ArrayList<Integer> myArray = new ArrayList<Integer>();

    // Random num = new Random();

    // for (int i = 0; i < 10; i++) {
    // int numRandom = num.nextInt(46)+55;
    // myArray.add(numRandom);
    // }

    // System.out.println(myArray);
    // }

    // 5. Array 55 - 100 aleatorios ordenados

    // public void arrayRandomOrdenado() {

    // ArrayList<Integer> myArray = new ArrayList<Integer>();

    // Random num = new Random();

    // for (int i = 0; i < 10; i++) {
    // int numRandom = num.nextInt(46)+55;
    // myArray.add(numRandom);
    // }

    // System.out.println(myArray);

    // Collections.sort(myArray);

    // System.out.println(myArray);
    // }

    // 6. cadena aleatoria con 5 caracteres

    // public void cadenaAleatoria() {
    // String cadena =
    // "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    // Random num = new Random();
    // StringBuilder respuesta = new StringBuilder();

    // for (int i = 0; i < 5; i++) {
    // int indiceRandom = num.nextInt(cadena.length());
    // char charRandom = cadena.charAt(indiceRandom);
    // respuesta.append(charRandom);
    // }

    // System.out.println(respuesta);

    // }

    // 7. arreglo de 10 cadenas aleatorias y cada una con 5 caracteres de longitud

    public void arrayCadenaAleatoria() {
        String cadena = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random num = new Random();
        ArrayList arrayRespuesta = new ArrayList<>();
        

        for (int j = 0; j < 10; j++) {
          StringBuilder respuesta = new StringBuilder();  
          for (int i = 0; i < 5; i++) {
            int indiceRandom = num.nextInt(cadena.length());
            char charRandom = cadena.charAt(indiceRandom);
            respuesta.append(charRandom);
        }  
            arrayRespuesta.add(respuesta);
        }
        

        System.out.println(arrayRespuesta);

    }

}