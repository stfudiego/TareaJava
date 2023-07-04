import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class EjerciciosBasicosTest {
    public static void main(String[] args) {
        
        EjerciciosBasicos iD = new EjerciciosBasicos();

        // imprimir 1-255

        // ArrayList<Integer> respuesta = iD.imprimirHasta(255);


        // System.out.println(respuesta);

        // Imprimir los Números Impares Entre 1 - 255

        // ArrayList<Integer> respuesta = iD.imprimirHasta(255);


        // System.out.println(respuesta);

        // Imprimir la Suma

        // String respuesta = iD.imprimirHasta(255);


        // System.out.println(respuesta);
        // ("Nuevo numero: " + j + " Suma: " + sum)

        // Recorrer un Arreglo

        // int[] myArray = {1,3,5,7,9,13};

        // int[] respuesta = iD.recorrerArray(myArray);

        // System.out.println(Arrays.toString(respuesta));

        // Encontrar el Máximo

        // int[] myArray = {1,3,5,7,9,13};

        // int respuesta = iD.recorrerArray(myArray);

        // System.out.println(respuesta); // 13

        // Obtener el Promedio

        // int[] myArray = {2,10,3};

        // int respuesta = iD.recorrerArray(myArray);

        // System.out.println("Promedio: " + respuesta); // 5


        // Arreglo con Números Impares

        // ArrayList<Integer> respuesta = iD.imprimirHasta(255);


        // System.out.println(respuesta);

        // Mayor que Y

        // int[] myArray = {1,3,5,7};

        // int respuesta = iD.recorrerArray(myArray, 3);

        // System.out.println(respuesta);

        // Valores al Cuadrado

        // int[] myArray = {1,5,10,-2};

        // int[] respuesta = iD.recorrerArray(myArray);

        // System.out.println(Arrays.toString(respuesta));

        // Eliminar Números Negativos

        // int[] myArray = {1,5,10,-2};

        // int[] respuesta = iD.recorrerArray(new int[] {1,5,10,-2});

        // System.out.println(Arrays.toString(respuesta));

        // Mínimo, Máximo y Promedio

        // ArrayList<Object> respuesta = iD.maxMinAvg (new int[] {1,5,10,-2});

        // int min = iD.min (new int[] {1,5,10,-2});

        // int max = iD.max (new int[] {1,5,10,-2});

        // float avg = iD.avg (new int[] {1,5,10,-2});

        // // System.out.println(min);

        // // System.out.println(max);

        // // System.out.println(avg);

        // System.out.println(respuesta);

        // Cambiando los Valores del Arreglo

        int [] respuesta = iD.cambioValores(new int[] {1,5,10,7,-2});

        System.out.println(Arrays.toString(respuesta));
}
}