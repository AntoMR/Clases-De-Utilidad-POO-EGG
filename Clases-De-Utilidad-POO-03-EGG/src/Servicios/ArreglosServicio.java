
 
package Servicios;

import java.util.Arrays;
import java.util.Random;


public class ArreglosServicio {
    
    public static void inicializarA(double[] arreglo) {
        Random random = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextDouble() * 100;  // Números aleatorios entre 0 y 100
        }
    }

    public static void mostrar(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }

    public static void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
    }

    public static void inicializarB(double[] arregloA, double[] arregloB) {
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        Arrays.fill(arregloB, 10, arregloB.length, 0.5);
    }
}
