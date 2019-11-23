package ar.edu.unahur.obj2.ejercicio1;

public class Materia {

    private static final int SEMANAS_CUATRIMESTRE = 17;

    private String nombre;
    private int horasSemanales;
    private boolean cuatrimestral;

    public Materia(String nombre, int horasSemanales, boolean cuatrimestral) {
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
        this.cuatrimestral = cuatrimestral;
    }

    public int cantidadDeHoras() {
        int horasCuatrimestrales = horasSemanales * SEMANAS_CUATRIMESTRE;
        int horasTotales = cuatrimestral ? horasCuatrimestrales : horasCuatrimestrales * 2;
        return horasTotales;
    }
}
