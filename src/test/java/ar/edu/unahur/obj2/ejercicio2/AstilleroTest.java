package ar.edu.unahur.obj2.ejercicio2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class AstilleroTest {

    private List<Vela> velas;
    private Astillero astillero;


    @BeforeMethod
    public void setUp() {
        Vela velaMayor = new Mayor();
        Vela velaSpinaker = new Spinaker();
        Vela velaGenaker = new Genaker();
        Vela velaGenova = new GenovaAdapter(new Genova());
        velas = new ArrayList<>();
        velas.add(velaMayor);
        velas.add(velaSpinaker);
        velas.add(velaGenaker);
        astillero = new Astillero();
        velas.add(velaGenova);
    }

    @Test
    public void testProbarEnrollar() {
        velas.forEach(m -> {
            astillero.probarEnrollar(m);
            assertTrue(m.enrrollada());
        });
    }

    @Test
    public void testProbarDesenrrollar() {
        velas.forEach(m -> {
            astillero.probarDesenrrollar(m);
            assertFalse(m.enrrollada());
        });
    }

    @Test
    public void testProbarEnrolladoParcial() {
        velas.forEach(m -> {
            astillero.probarEnrrolladoParcial(m, 100);
            assertEquals(m.superficie(), 100);
        });
    }

    @Test
    public void testProbarFrenado() {
        velas.forEach(m -> {
            astillero.probarDesenrrolladoParcial(m, 100, 50);
            assertEquals(m.superficie(), 50);
        });
    }
}