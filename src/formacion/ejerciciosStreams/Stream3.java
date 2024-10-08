package formacion.ejerciciosStreams;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Stream3 {
    public static void execute(){
        /*
    Transformación de cadenas: Dada una lista de palabras, utiliza un Stream para convertir todas las palabras a mayúsculas y luego imprímelas.
     */
        String [] palabras = {"hola", "mundo", "adios", "universo"};
        String [] enMayusculas = (String[]) Arrays.stream(palabras).map(pal -> pal.toUpperCase()).toArray(String[]::new);

        for(String palabra:enMayusculas){
            System.out.println(palabra);
        }

    }
}
