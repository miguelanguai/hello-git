import formacion.ejerciciosHerencia.ejercicio1.Gato;
import formacion.ejerciciosHerencia.ejercicio2.Vehiculo;
import formacion.ejerciciosHerencia.ejercicio3.Circulo;
import formacion.ejerciciosHerencia.ejercicio3.Rectangulo;
import formacion.ejerciciosHerencia.ejercicio4.Coche;
import formacion.ejerciciosHerencia.ejercicio5.Dia;
import formacion.ejerciciosHerencia.ejercicio5.Elegir;
import formacion.ejerciciosHerencia.ejercicio6.EmpleadoTiempoCompleto;
import formacion.ejerciciosHerencia.ejercicio6.EmpleadoTiempoParcial;
import formacion.ejerciciosHerencia.ejercicio7.Persona;
import formacion.ejerciciosHerencia.ejercicio7.RepositorioDePersonas;
import formacion.ejerciciosStreams.Stream1;
import formacion.ejerciciosStreams.Stream2;
import formacion.ejerciciosStreams.Stream3;

import java.util.ArrayList;
import java.util.List;

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

        EmpleadoTiempoCompleto emp1 = new EmpleadoTiempoCompleto();
        emp1.calcularSalario(); //Este empleado tiene un bonus de un 25% sobre el total
        EmpleadoTiempoParcial emp2 = new EmpleadoTiempoParcial();
        emp2.calcularSalario();

        Persona per1 = new Persona();
        per1.setId(1L);
        per1.setName("John");
        Persona per2 = new Persona();
        per2.setId(2L);
        per2.setName("Sarah");
        RepositorioDePersonas repositorio = new RepositorioDePersonas();
        List <Persona>listaPersonas = new ArrayList<Persona>();
        listaPersonas.add(per1);
        listaPersonas.add(per2);
        repositorio.setRepo(listaPersonas);
        repositorio.listarPersonas();
        System.out.println("");
        Persona per3 = new Persona();
        per3.setId(3L);
        per3.setName("Harry");
        repositorio.agregarPersona(per3);
        repositorio.listarPersonas();
        System.out.println("");
        repositorio.retirarPersona(per3.getId());
        repositorio.listarPersonas();

        System.out.println("");
        System.out.println("");
        System.out.println("Ejercicio Streams");
        System.out.println("");
        Stream1.execute();
        System.out.println("");
        Stream2.execute();
        System.out.println("");
        Stream3.execute();
    }
}