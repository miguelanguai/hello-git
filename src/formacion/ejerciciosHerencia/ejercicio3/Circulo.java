package formacion.ejerciciosHerencia.ejercicio3;

public class Circulo extends Figura{
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double result = Math.PI*Math.pow(this.getRadio(),2);
        return result;
    }
}
