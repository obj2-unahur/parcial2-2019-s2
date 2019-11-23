package ar.edu.unahur.obj2.ejercicio1;

import org.testng.annotations.BeforeTest;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.testng.Assert.*;

public class CarreraTest {

    private Carrera carrera;

    @BeforeTest
    public void setup() {
        Materia estructuraDeDatos = new Materia("EstructuraDeDatos", 8, true);
        Materia intro = new Materia("Intro", 8, false);
        Materia matematica = new Materia("Matematica", 8, false);
        Materia objetos1 = new Materia("Objetos I", 8, true);
        carrera = new Carrera("Tecnicatura en sistemas", Arrays.asList(intro, matematica, estructuraDeDatos, objetos1));
    }

    @org.testng.annotations.Test
    public void testCatalogoDePaquetes() {
        int cargaHoraria = carrera.cargaHoraria();
        assertEquals(cargaHoraria, 816);
    }
}