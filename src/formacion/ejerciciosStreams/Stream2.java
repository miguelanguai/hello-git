package formacion.ejerciciosStreams;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Stream2 {

    public static void execute(){
        /*
    Cálculo del promedio: A partir de una lista de números, utiliza un Stream para calcular el promedio de los valores.
     */
        int[] numeros ={23,4,7,10}; //average is 44/4=11
        OptionalDouble average = Arrays.stream(numeros).average();

            System.out.println(average);

    }
}
