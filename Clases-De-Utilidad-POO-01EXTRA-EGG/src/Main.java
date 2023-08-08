
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        
         String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
                          "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        int indiceMesSecreto = (int) (Math.random() * 12);
        String mesSecreto = meses[indiceMesSecreto];

        Scanner scanner = new Scanner(System.in);
        String adivinanza;

        do {
            System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
            adivinanza = scanner.nextLine();

            if (adivinanza.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes.");
            }
        } while (true);

        scanner.close();
    }
}
    
    

