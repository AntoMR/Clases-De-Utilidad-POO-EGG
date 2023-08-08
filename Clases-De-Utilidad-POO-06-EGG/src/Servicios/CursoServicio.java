
package Servicios;

import Entidad.Curso;


public class CursoServicio {
    
    public static Curso crearCurso() {
        Curso curso = new Curso();
        curso.crearCurso();
        return curso;
    }

    public static void mostrarCurso(Curso curso) {
        System.out.println("Nombre del curso: " + curso.getNombreCurso());
        System.out.println("Cantidad de horas por día: " + curso.getCantidadHorasPorDia());
        System.out.println("Cantidad de días por semana: " + curso.getCantidadDiasPorSemana());
        System.out.println("Turno: " + curso.getTurno());
        System.out.println("Precio por hora: $" + curso.getPrecioPorHora());
        System.out.println("Alumnos:");
        for (int i = 0; i < curso.getAlumnos().length; i++) {
            System.out.println("- " + curso.getAlumnos()[i]);
        }
    }
    
}
