package ar.edu.unahur.obj2.ejercicio4;

public class Apagado extends EstadoTelevision {

    public Apagado(Television television) {
        super(television);
    }

    @Override
    public void apagar() {
        System.out.println("TV apagada");
    }

    @Override
    public void encender() {
        television.setEstadoEncendido();
    }

    @Override
    public void subirVolumen(int cantidad) {
        System.out.println("TV apagada");

    }

    @Override
    public void bajarVolumen(int cantidad) {
        System.out.println("TV apagada");
    }

    @Override
    public void silenciar() {
        System.out.println("TV apagada");
    }

    @Override
    public void activarSonido() {
        System.out.println("TV apagada");
    }
}
