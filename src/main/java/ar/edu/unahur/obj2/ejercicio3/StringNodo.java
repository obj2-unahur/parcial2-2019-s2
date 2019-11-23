package ar.edu.unahur.obj2.ejercicio3;

public class StringNodo extends Nodo {

    private String texto;

    public StringNodo(String texto) {
        this.texto = texto;
    }

    public String extraer() {
        return texto;
    }

}
