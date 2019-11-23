package ar.edu.unahur.obj2.ejercicio1;


import java.util.List;

public class Carrera {

    private String nombre;
    private List<Materia> materias;

    public Carrera(String nombre, List<Materia> materias) {
        this.nombre = nombre;
        this.materias = materias;
    }

    public int cargaHoraria() {
        return materias.stream().mapToInt(materia -> materia.cantidadDeHoras()).sum();
    }


}
