package ar.edu.unahur.obj2.ejercicio3;

public class Link extends Nodo {

    private String etiqueta;

    public Link(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String etiqueta() {
        return etiqueta;
    }

    public String extraer() {
        return etiqueta;
    }
}
