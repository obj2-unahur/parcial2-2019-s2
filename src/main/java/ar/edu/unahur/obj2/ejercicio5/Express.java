package ar.edu.unahur.obj2.ejercicio5;

public class Express extends Envio {

    public Express(Paquete paquete) {
        super(paquete);
    }

    @Override
    public double costoEnvio(long kms) {
        return Math.pow(kms, 3)*1000;
    }
}
