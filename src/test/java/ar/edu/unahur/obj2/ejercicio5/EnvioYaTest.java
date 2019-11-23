package ar.edu.unahur.obj2.ejercicio5;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EnvioYaTest {

    private EnvioYa envioYa;

    @BeforeTest
    public void setup() {
        envioYa = new EnvioYa();
    }

    @Test
    public void testCalculoCostoEnvio() {
        double costo = envioYa.calculoCostoEnvio(new Normal(new Chico()),100 );
        assertEquals(costo, 100100.0);
    }
}