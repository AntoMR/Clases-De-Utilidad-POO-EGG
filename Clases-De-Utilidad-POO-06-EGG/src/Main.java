
import Entidad.Curso;
import Servicios.CursoServicio;


public class Main {

   
    public static void main(String[] args) {
       
        Curso curso = CursoServicio.crearCurso();

        System.out.println("\nInformación del curso:");
        CursoServicio.mostrarCurso(curso);

        double gananciaSemanal = curso.calcularGananciaSemanal();
        System.out.println("\nGanancia semanal del curso: $" + gananciaSemanal);
    }
    }
    

