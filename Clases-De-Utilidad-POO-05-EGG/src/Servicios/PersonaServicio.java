
package Servicios;

import Entidad.Persona;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class PersonaServicio {
    
    public static Persona crearPersona() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (formato dd/MM/yyyy): ");
        String fechaStr = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = null;

        try {
            fechaNacimiento = sdf.parse(fechaStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return new Persona(nombre, fechaNacimiento);
    }

    public static int calcularEdad(Persona persona) {
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(persona.getFechaNacimiento());

        Calendar fechaActual = Calendar.getInstance();
        int edad = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);

        if (fechaNac.get(Calendar.MONTH) > fechaActual.get(Calendar.MONTH) ||
            (fechaNac.get(Calendar.MONTH) == fechaActual.get(Calendar.MONTH) &&
             fechaNac.get(Calendar.DAY_OF_MONTH) > fechaActual.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }

        return edad;
    }

    public static boolean menorQue(Persona persona, int edad) {
        return calcularEdad(persona) < edad;
    }

    public static void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de Nacimiento: " + persona.getFechaNacimiento());
    }

    
}
