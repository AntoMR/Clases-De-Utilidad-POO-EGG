
import Entidad.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        Persona persona = PersonaServicio.crearPersona();

        int edad = PersonaServicio.calcularEdad(persona);
        System.out.println("Edad: " + edad + " años");

        System.out.print("Ingrese una edad para comparar: ");
        int edadComparar = new Scanner(System.in).nextInt();

        boolean esMenor = PersonaServicio.menorQue(persona, edadComparar);
        System.out.println("¿La persona es menor que " + edadComparar + " años? " + (esMenor ? "Sí" : "No"));

        System.out.println("Información de la persona:");
        PersonaServicio.mostrarPersona(persona);
    }
}





        
    
    

