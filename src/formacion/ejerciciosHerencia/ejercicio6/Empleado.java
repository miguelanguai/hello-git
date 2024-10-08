package formacion.ejerciciosHerencia.ejercicio6;

abstract class Empleado {
    private int horasTrabajadas;
    private int eurosPorHora;

    public int getEurosPorHora() {
        return eurosPorHora;
    }

    public void setEurosPorHora(int eurosPorHora) {
        this.eurosPorHora = eurosPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public abstract void calcularSalario();
}
