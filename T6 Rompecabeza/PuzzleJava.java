import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * PuzzleJava
 */
public class PuzzleJava {

    // 1.Suma de los numeros de un arreglo

    // public void sumarYMayoresArray(int [] array, int mayorA) {
    //     int sum = 0;
    //     for (int i = 0; i < array.length; i++) {
    //         sum += array[i];
    //     }
        
    //     ArrayList<Integer> mayorArray = new ArrayList<Integer>();

    //     for (int i = 0; i < array.length; i++) {
    //         if (array[i] > mayorA) {
    //             mayorArray.add(array[i]);
    //         }
    //     }

    //     System.out.println(Arrays.toString(array)); 
    //     System.out.println(sum);
    //     System.out.println(mayorArray);
    // }

    // 2. Mezclar e imprimir Nombres de un Array

    public void mezclarEImprimirNombres(String[] array,int caracteresMayorA) {

        List<String> Lista = Arrays.asList(array);

        Collections.shuffle(Lista);

        System.out.println(Lista);

        ArrayList<String> newArray = new ArrayList<>();

        for (int i = 0; i < Lista.size(); i++) {
           if (Lista.get(i).length() > caracteresMayorA) {
            newArray.add(Lista.get(i));
           } 
        }

        System.out.println(newArray);
    }
}