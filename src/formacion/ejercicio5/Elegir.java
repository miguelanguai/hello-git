package formacion.ejercicio5;

public class Elegir {
    public static void elegirDia(Dia dia){
        switch (dia) {
            case dia.LUNES:
                System.out.println("laboral");
                break;
            case dia.MARTES:
                System.out.println("laboral");
                break;
            case dia.MIERCOLES:
                System.out.println("laboral");
                break;
            case dia.JUEVES:
                System.out.println("laboral");
                break;
            case dia.VIERNES:
                System.out.println("laboral");
                break;
            case dia.SABADO:
                System.out.println("fin de semana");
                break;
            case dia.DOMINGO:
                System.out.println("fin de semana");
                break;
        }
    }
}
