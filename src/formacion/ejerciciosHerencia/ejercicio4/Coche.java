package formacion.ejerciciosHerencia.ejercicio4;

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
