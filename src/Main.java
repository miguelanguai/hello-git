import formacion.ejercicio1.Gato;
import formacion.ejercicio2.Vehiculo;
import formacion.ejercicio3.Circulo;
import formacion.ejercicio3.Rectangulo;
import formacion.ejercicio4.Coche;
import formacion.ejercicio5.Dia;
import formacion.ejercicio5.Elegir;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.hacerSonido();

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.arrancar();

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setBase(2);
        rectangulo.setHeight(3);
        System.out.println(rectangulo.calcularArea());
        Circulo circulo = new Circulo();
        circulo.setRadio(1);
        System.out.println(circulo.calcularArea());

        Coche coche = new Coche();
        coche.acelerar();
        coche.frenar();

        Dia dia = Dia.LUNES;
        Elegir.elegirDia(dia);
        dia=Dia.DOMINGO;
        Elegir.elegirDia(dia);

    }
}