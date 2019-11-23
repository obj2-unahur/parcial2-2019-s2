package ar.edu.unahur.obj2.ejercicio5;

public class Rapido extends Envio {

    public Rapido(Paquete paquete) {
        super(paquete);
    }

    @Override
    public double costoEnvio(long kms) {
        return Math.pow(kms, 2) + 10000;
    }
}
