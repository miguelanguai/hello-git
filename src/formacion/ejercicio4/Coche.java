package formacion.ejercicio4;

import formacion.ejercicio4.Vehiculo;

public class Coche implements Vehiculo {
    @Override
    public void acelerar() {
        System.out.println("Acelerando coche");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando coche");
    }
}
