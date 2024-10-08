package formacion.ejercicio6;

public class EmpleadoTiempoParcial extends Empleado{

    @Override
    public void calcularSalario() {
        double result = getHorasTrabajadas()*getEurosPorHora();
        System.out.println("Empleado Tiempo Parcial = "+result);

    }
}
