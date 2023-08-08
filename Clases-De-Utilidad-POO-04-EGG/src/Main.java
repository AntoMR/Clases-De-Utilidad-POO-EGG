

import java.util.Date;


public class Main {

    
    public static void main(String[] args) {
        
        
        System.out.println("Ingrese su fecha de nacimiento:");
        Date fechaNacimiento = FechaServicio.fechaNacimiento();

        // Obtener fecha actual
        Date fechaActual = FechaServicio.fechaActual();

        // Calcular diferencia de años entre la fecha de nacimiento y la actual
        int edad = FechaServicio.diferencia(fechaNacimiento, fechaActual);

        System.out.println("Su edad es: " + edad + " años.");
    }
    
}
