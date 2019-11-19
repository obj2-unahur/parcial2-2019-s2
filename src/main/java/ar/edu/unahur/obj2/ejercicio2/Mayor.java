package ar.edu.unahur.obj2.ejercicio2;

public class Mayor implements Vela {

    private long superficie;
    private boolean enrollado;

    public void enrollar() {
        enrollado = true;
    }

    public void desenrollar() {
        enrollado = false;
    }

    public void enrollar(long superficie) {
        this.superficie +=superficie;
    }

    public void desenrollar(long superficie) {
        this.superficie -=superficie;
    }

    public boolean enrrollada() {
        return enrollado;
    }

    public long superficie() {
        return superficie;
    }
}
