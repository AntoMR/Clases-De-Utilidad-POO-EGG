
import Entidad.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
       
            Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        Cadena cadena = new Cadena(frase);

       
        System.out.println("Frase: " + cadena.getFrase());
        System.out.println("Longitud: " + cadena.getLongitud());

        
        System.out.println("Número de vocales: " + CadenaServicio.mostrarVocales(cadena));

        String fraseInvertida = CadenaServicio.invertirFrase(cadena);
        System.out.println("Frase invertida: " + fraseInvertida);

        System.out.print("Ingresa una letra para contar repeticiones: ");
        char letra = scanner.next().charAt(0);
        System.out.println("La letra '" + letra + "' se repite " + CadenaServicio.vecesRepetido(cadena, letra) + " veces.");

        System.out.print("Ingresa una frase para comparar longitud: ");
        String otraFrase = scanner.nextLine();
        boolean comparacion = CadenaServicio.compararLongitud(cadena, otraFrase);
        System.out.println("Las frases tienen la misma longitud: " + comparacion);

        System.out.print("Ingresa una nueva frase para unir: ");
        scanner.nextLine();  // Limpiar el búfer
        String nuevaFrase = scanner.nextLine();
        String fraseUnida = CadenaServicio.unirFrases(cadena, nuevaFrase);
        System.out.println("Frase unida: " + fraseUnida);

        System.out.print("Ingresa una letra a reemplazar: ");
        char letraReemplazar = scanner.next().charAt(0);
        System.out.print("Ingresa el carácter de reemplazo: ");
        char reemplazo = scanner.next().charAt(0);
        String fraseReemplazada = CadenaServicio.reemplazar(cadena, letraReemplazar, reemplazo);
        System.out.println("Frase con reemplazo: " + fraseReemplazada);

        System.out.print("Ingresa una letra para verificar si la frase la contiene: ");
        char letraContiene = scanner.next().charAt(0);
        boolean contiene = CadenaServicio.contiene(cadena, letraContiene);
        System.out.println("La frase contiene la letra '" + letraContiene + "': " + contiene);

        scanner.close();
    }
    }
    

