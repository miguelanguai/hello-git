package formacion.ejerciciosStreams;

import java.util.Arrays;
import java.util.List;

public class Stream1 {
    /*
    Filtrado de elementos pares: Crea una lista de números enteros y utiliza un Stream para filtrar solo los números pares. Luego, imprime esos números en pantalla.
     */

    public static void execute(){
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] pares = Arrays.stream(numeros).filter(n-> n%2==0).toArray();

        for(int par:pares){
            System.out.println(par);
        }
    }


}

