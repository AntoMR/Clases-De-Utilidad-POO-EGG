
package Servicios;

import Entidad.ParDeNumeros;


public class ParDeNumerosServicio {
    
     public static void mostrarValores(ParDeNumeros par) {
        System.out.println("Número 1: " + par.getNumero1());
        System.out.println("Número 2: " + par.getNumero2());
    }

    public static double devolverMayor(ParDeNumeros par) {
        return Math.max(par.getNumero1(), par.getNumero2());
    }

    public static double calcularPotencia(ParDeNumeros par) {
        double mayor = devolverMayor(par);
        double menor = Math.min(par.getNumero1(), par.getNumero2());
        
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        
        return Math.pow(mayor, menor);
    }

    public static double calculaRaiz(ParDeNumeros par) {
        double menor = Math.min(par.getNumero1(), par.getNumero2());
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
    
}
