package formacion.ejerciciosHerencia.ejercicio3;

public class Rectangulo extends Figura{
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double calcularArea() {
        return base*height;
    }
}
