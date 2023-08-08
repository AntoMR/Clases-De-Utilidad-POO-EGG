
import Servicios.ArreglosServicio;


public class Main {

   
    public static void main(String[] args) {
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        
        ArreglosServicio.inicializarA(arregloA);
        System.out.println("Arreglo A (inicializado):");
        ArreglosServicio.mostrar(arregloA);

        
        ArreglosServicio.ordenar(arregloA);
        System.out.println("Arreglo A (ordenado):");
        ArreglosServicio.mostrar(arregloA);

        
        ArreglosServicio.inicializarB(arregloA, arregloB);
        System.out.println("Arreglo A:");
        ArreglosServicio.mostrar(arregloA);
        System.out.println("Arreglo B:");
        ArreglosServicio.mostrar(arregloB);
    }
        
    }
    

