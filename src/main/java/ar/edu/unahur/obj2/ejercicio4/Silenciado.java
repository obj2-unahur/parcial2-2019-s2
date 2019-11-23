package ar.edu.unahur.obj2.ejercicio4;

public class Silenciado extends EstadoTelevision {

    public Silenciado(Television television) {
        super(television);
    }

    @Override
    public void apagar() {
        television.setEstadoApagado();
    }

    @Override
    public void encender() {
    }

    @Override
    public void subirVolumen(int cantidad) {
        System.out.println("TV silenciada");
    }

    @Override
    public void bajarVolumen(int cantidad) {
        System.out.println("TV silenciada");
    }

    @Override
    public void silenciar() {
        System.out.println("TV silenciada");
    }

    @Override
    public void activarSonido() {
        television.setEstadoEncendido();
    }
}
