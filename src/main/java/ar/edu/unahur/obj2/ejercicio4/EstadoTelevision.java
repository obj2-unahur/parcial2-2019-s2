package ar.edu.unahur.obj2.ejercicio4;

public abstract class EstadoTelevision {

    protected Television television;

    public EstadoTelevision(Television television) {
        this.television = television;
    }

    public abstract void apagar();

    public abstract void encender();

    public abstract void subirVolumen(int cantidad);

    public abstract void bajarVolumen(int cantidad);

    public abstract void silenciar();

    public abstract void activarSonido();

}
