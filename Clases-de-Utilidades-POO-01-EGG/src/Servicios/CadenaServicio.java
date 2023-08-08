
package Servicios;

import Entidad.Cadena;


public class CadenaServicio {
    
    public static int mostrarVocales(Cadena cadena) {
        int contadorVocales = 0;
        String vocales = "AEIOUaeiou";

        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (vocales.contains(String.valueOf(cadena.getFrase().charAt(i)))) {
                contadorVocales++;
            }
        }

        return contadorVocales;
    }

    public static String invertirFrase(Cadena cadena) {
        StringBuilder resultado = new StringBuilder(cadena.getFrase());
        return resultado.reverse().toString();
    }

    public static int vecesRepetido(Cadena cadena, char letra) {
        int contador = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == letra) {
                contador++;
            }
        }

        return contador;
    }

    public static boolean compararLongitud(Cadena cadena, String otraFrase) {
        return cadena.getLongitud() == otraFrase.length();
    }

    public static String unirFrases(Cadena cadena, String nuevaFrase) {
        return cadena.getFrase() + " " + nuevaFrase;
    }

    public static String reemplazar(Cadena cadena, char letra, char reemplazo) {
        return cadena.getFrase().replace(letra, reemplazo);
    }

    public static boolean contiene(Cadena cadena, char letra) {
        return cadena.getFrase().contains(String.valueOf(letra));
    }
    
}
