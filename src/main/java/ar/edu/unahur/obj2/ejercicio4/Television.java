package ar.edu.unahur.obj2.ejercicio4;

public class Television {

    public final static int VOLUMEN_MAXIMO = 100;
    public final static int VOLUMEN_MINIMO = 2;

    private int nivelVolumen;
    private EstadoTelevision estado;

    private EstadoTelevision apagado = new Apagado(this);
    private EstadoTelevision encendido = new Encendido(this);
    private EstadoTelevision silenciado = new Silenciado(this);

    public Television() {
        setEstadoApagado();
    }

    public void encender() {
        estado.encender();
    }

    public void apagar() {
        estado.apagar();
    }

    public void subirVolumen(int cantidad) {
        estado.subirVolumen(cantidad);
    }

    public void bajarVolumen(int cantidad) {
        estado.bajarVolumen(cantidad);
    }

    public void silenciar() {
        estado.silenciar();
    }

    public void activarSonido() {
        estado.activarSonido();
    }

    public void setEstadoApagado() {
        this.estado = apagado;
    }

    public void setEstadoEncendido() {
        this.estado = encendido;
    }

    public void setEstadoSilenciado() {
        this.estado = silenciado;
    }

    public int getNivelVolumen() {
        return nivelVolumen;
    }

    public void setNivelVolumen(int nivelVolumen) {
        this.nivelVolumen = nivelVolumen;
    }
}
