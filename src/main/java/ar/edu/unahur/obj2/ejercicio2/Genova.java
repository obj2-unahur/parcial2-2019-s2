package ar.edu.unahur.obj2.ejercicio2;

/**
 * No se puede modificar
 */
public class Genova  {

    private long area;
    private boolean enrollada;

    public void setEnrollada(boolean enrollada) {
        this.enrollada = enrollada;
    }

    public void enrollar(long area) {
        this.area +=area;
    }

    public void desenrollar(long area) {
        this.area -=area;
    }

    public boolean getEnrollada() {
        return enrollada;
    }

    public long getArea() {
        return area;
    }
}
