
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;


public class AhorcadoServicio {
    
    public static Ahorcado crearJuego() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = scanner.nextLine().toLowerCase();

        System.out.print("Ingrese la cantidad de jugadas máximas: ");
        int jugadasMaximas = scanner.nextInt();

        return new Ahorcado(palabra, jugadasMaximas);
    }

    public static void longitud(Ahorcado ahorcado) {
        System.out.println("Longitud de la palabra a buscar: " + ahorcado.getPalabraABuscar().length);
    }

    public static boolean buscar(Ahorcado ahorcado, char letra) {
        boolean encontrada = false;

        for (char c : ahorcado.getPalabraABuscar()) {
            if (c == letra) {
                encontrada = true;
                ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
            }
        }

        if (!encontrada) {
            ahorcado.setOportunidades(ahorcado.getOportunidades() - 1);
        }

        return encontrada;
    }

    public static void encontradas(Ahorcado ahorcado, char letra) {
        System.out.println("Letras encontradas: " + ahorcado.getLetrasEncontradas());
        System.out.println("Letras faltantes: " + (ahorcado.getPalabraABuscar().length - ahorcado.getLetrasEncontradas()));
    }

    public static void intentos(Ahorcado ahorcado) {
        System.out.println("Intentos restantes: " + ahorcado.getOportunidades());
    }

    public static void juego(Ahorcado ahorcado) {
        Scanner scanner = new Scanner(System.in);

        while (ahorcado.getOportunidades() > 0 && ahorcado.getLetrasEncontradas() < ahorcado.getPalabraABuscar().length) {
            System.out.print("Ingrese una letra: ");
            char letra = scanner.next().charAt(0);

            if (buscar(ahorcado, letra)) {
                System.out.println("¡Letra encontrada!");
                encontradas(ahorcado, letra);
            } else {
                System.out.println("La letra no está en la palabra.");
                intentos(ahorcado);
            }
        }

        if (ahorcado.getLetrasEncontradas() == ahorcado.getPalabraABuscar().length) {
            System.out.println("¡Felicidades! Has descubierto la palabra.");
        } else {
            System.out.println("¡Se acabaron los intentos! La palabra era: " + String.valueOf(ahorcado.getPalabraABuscar()));
        }
    }
}

