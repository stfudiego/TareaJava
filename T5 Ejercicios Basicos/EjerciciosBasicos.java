import java.util.ArrayList;

public class EjerciciosBasicos {

    // imprimir 1-255
    // public ArrayList<Integer> imprimirHasta(Integer num) {

    //     ArrayList<Integer> array = new ArrayList<>();

    //     for (Integer j = 0; j <= num; j++) {
    //         array.add(j);
    //     }

        // return array;
    // }
    
    // Imprimir los Números Impares Entre 1 - 255

    // public ArrayList<Integer> imprimirHasta(Integer num) {

    //     ArrayList<Integer> array = new ArrayList<>();

    //     for (Integer j = 0; j <= num; j++) {
    //         if(j%2 != 0) {
    //         array.add(j);
    //         }
    //     }

    //     return array;
    // }

    // Imprimir la Suma

    // public String imprimirHasta(Integer num) {

    //     Integer sum = 0;
    //     String respS = "a";

    //     for (Integer j = 0; j <= num; j++) {
            
    //         sum += j;   
    //         respS = "Nuevo numero: " + j + " Suma: " + sum;
    //         System.out.println(respS);
                     
    //     }


    //     return respS;
    // }
     
    // Recorrer un Arreglo
    
    // public int[] recorrerArray(int[] array) {

    //     for (int i = 0; i < array.length; i++) {
    //         System.out.println(array[i]);
    //     }

    //     return array;
        
    // }

    // Encontrar el Máximo
    
    // public int recorrerArray(int[] array) {

    //     int max = array[0];
    //     for (int i = 1; i < array.length; i++) {
    //         if (max < array[i]) {
    //             max = array[i];
    //         }
    //     }

    //     return max;
        
    // }

    // Obtener el Promedio

    // public int recorrerArray(int[] array) {

    //     int sum = 0;
    //     int prom = 0;
        
    //     for (int i = 0; i < array.length; i++) {
            
    //         sum += array[i];
    //     }

    //     prom = sum/array.length;
    //     return prom;
        
    // }

    // Arreglo con Números Impares

    // public ArrayList<Integer> imprimirHasta(Integer num) {

    //     ArrayList<Integer> array = new ArrayList<>();

    //     for (Integer j = 0; j <= num; j++) {
    //         if (j%2 != 0) {
    //         array.add(j);}
    //     }

    //     return array;
    // }

    // Mayor que Y

    // public int recorrerArray(int[] array, int y) {

    //     int temp = 0;
    //     for (int i = 0; i < array.length; i++) {
    //         if(array[i]>y) {
    //             temp++;
    //         }
    //     }

    //     return temp;
        
    // }

    // Valores al Cuadrado

    // public int[] recorrerArray(int[] array) {

    //     for (int i = 0; i < array.length; i++) {
    //         array[i] = array[i]*array[i];
    //     }

    //     return array;
        
    // }

    // Eliminar Números Negativos

    // public int[] recorrerArray(int[] array) {

    //     for (int i = 0; i < array.length; i++) {
    //        if(array[i] < 0) {
    //         array[i] = 0;
    //        }
    //     }

    //     return array;
        
    // }

    // Mínimo, Máximo y Promedio

    // public ArrayList<Object> maxMinAvg(int[] array) {

    //     ArrayList<Object> newArray = new ArrayList<Object>();
        
    //     int min = min(array);
    //     int max = max(array);
    //     float avg = avg(array);

    //     newArray.add(min);
    //     newArray.add(max);
    //     newArray.add(avg);

    //     return newArray;
    // }

    // public int min(int [] array) {
    //         int min = array[0];
    //         for (int i = 0; i < array.length; i++) {
    //             if( min > array[i]) {
    //                 min = array[i];
    //             }
    //         }
    //         return min;
    // }

    // public int max(int [] array) {
    //         int max = array[0];
    //         for (int i = 0; i < array.length; i++) {
    //             if( max < array[i]) {
    //                 max = array[i];
    //             }
    //         }
    //         return max;
    // }
    
    // public float avg(int[] array) {

    //     float sum = 0;
    //     float prom = 0;
        
    //     for (int i = 0; i < array.length; i++) {
            
    //         sum += array[i];
    //     }

    //     prom = sum/array.length;
    //     return prom;
        
    // }

    // Cambiando los Valores del Arreglo

    public int [] cambioValores(int [] array) {
        int ultNum = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if ( i == ultNum) {
                array[ultNum] = 0;
            }
            else {
            array[i] = array[i+1];
            }
        }
        return array;
    }

}