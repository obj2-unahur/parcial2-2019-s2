package ar.edu.unahur.obj2.ejercicio5;

public abstract class Envio {

    private final Paquete paquete;

    public Envio(Paquete paquete) {
        this.paquete = paquete;
    }

    double costo(long kms) {
        return costoEnvio(kms) + paquete.costo();
    }

    protected abstract double costoEnvio(long kms);

}
