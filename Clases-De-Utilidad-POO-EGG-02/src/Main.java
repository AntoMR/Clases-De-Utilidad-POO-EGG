
import Entidad.ParDeNumeros;
import Servicios.ParDeNumerosServicio;


public class Main {

  
    public static void main(String[] args) {
      
        
         ParDeNumeros par = new ParDeNumeros();

        ParDeNumerosServicio.mostrarValores(par);
        System.out.println("El número mayor es: " + ParDeNumerosServicio.devolverMayor(par));
        System.out.println("La potencia del mayor elevado al menor es: " + ParDeNumerosServicio.calcularPotencia(par));
        System.out.println("La raíz cuadrada del menor es: " + ParDeNumerosServicio.calculaRaiz(par));
    }
    }
    

