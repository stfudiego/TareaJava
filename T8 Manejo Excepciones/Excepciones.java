import java.util.ArrayList;

public class Excepciones {

    public void name() {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");

        int indiceError = -1;
        Object objetoError = -1;

        try {
            for(int i = 0; i < myList.size(); i++) {

            indiceError = i;
            objetoError = myList.get(i);
            
            int castedValue = (int) myList.get(i);   
        }
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
            System.out.println("Indice del Array en el que ocurre el error: " + indiceError);
            System.out.println("Valor del objeto en el que ocurre el error: " + objetoError);
        }
    }
}