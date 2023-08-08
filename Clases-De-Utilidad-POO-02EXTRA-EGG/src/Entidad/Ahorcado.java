
package Entidad;


public class Ahorcado {
    
     private char[] palabraABuscar;
    private int letrasEncontradas;
    private int jugadasMaximas;
    private int oportunidades;

    public Ahorcado(String palabraABuscar, int jugadasMaximas) {
        this.palabraABuscar = palabraABuscar.toCharArray();
        this.letrasEncontradas = 0;
        this.jugadasMaximas = jugadasMaximas;
        this.oportunidades = jugadasMaximas;
    }

    public char[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(int oportunidades) {
        this.oportunidades = oportunidades;
    }
}
    

