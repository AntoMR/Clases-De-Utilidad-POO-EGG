
import Entidad.Ahorcado;
import Servicio.AhorcadoServicio;


public class Main {

  
    public static void main(String[] args) {
        
         Ahorcado ahorcado = AhorcadoServicio.crearJuego();

        System.out.println("Comenzando juego del Ahorcado...");
        AhorcadoServicio.longitud(ahorcado);

        AhorcadoServicio.juego(ahorcado);
    }
    }
    

