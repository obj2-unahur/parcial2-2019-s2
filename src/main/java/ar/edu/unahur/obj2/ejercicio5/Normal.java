package ar.edu.unahur.obj2.ejercicio5;

public class Normal extends Envio {

    public Normal(Paquete paquete) {
        super(paquete);
    }

    @Override
    public double costoEnvio(long kms) {
        return kms*1000;
    }
}
