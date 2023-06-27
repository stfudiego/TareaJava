/**
 * FizzBuzz
 */
public class FizzBuzz {

    public String fizzBuzz(int number) {
        String respuesta = "";
        if (number == 0){
            respuesta = "" + number;
        }
        else if (number%15 == 0){
            respuesta = "FizzBuzz";
        }
        else if (number%3 == 0){
            respuesta = "Fizz";
        } 
        else if(number%5 == 0){
            respuesta = "Buzz";
        }
        else {
            respuesta = "" + number;
        }

        return respuesta;
    }
}