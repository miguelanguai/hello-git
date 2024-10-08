import formacion.ejercicio1.Gato;
import formacion.ejercicio2.Vehiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.hacerSonido();

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.arrancar();
    }
}