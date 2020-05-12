package ar.edu.unahur.obj2.ejercicio5;

public class EnvioYa {


    public double calculoCostoEnvio(TipoEnvio tipoEnvio, TipoPaquete tipoPaquete,  long kms) {
        double costoTotal = 0;

        if (tipoEnvio.equals(TipoEnvio.Normal)) {
            costoTotal += kms*1000;
        } else if (tipoEnvio.equals(TipoEnvio.Rapido)) {
            costoTotal +=  Math.pow(kms, 2) + 10000;
        } else {
            costoTotal +=  Math.pow(kms, 3)*1000;
        }

        return ponderarTamañoPaquete(tipoPaquete, costoTotal);
    }

    private double ponderarTamañoPaquete(TipoPaquete tipoPaquete, double actual) {
        double ponderado = actual;

        if (tipoPaquete.equals(TipoPaquete.Chico)) {
            ponderado += 100;
        } if (tipoPaquete.equals(TipoPaquete.Grande)) {
            ponderado += 500;
        } else {
            ponderado += 1000;
        }

        return ponderado;
    }
}
