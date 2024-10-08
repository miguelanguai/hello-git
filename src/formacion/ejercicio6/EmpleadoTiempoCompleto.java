package formacion.ejercicio6;

public class EmpleadoTiempoCompleto extends Empleado{
    @Override
    public void calcularSalario() {
        double result = getHorasTrabajadas()*getEurosPorHora()*1.25;
        System.out.println("Empleado Tiempo Completo = "+result);
    }
}
