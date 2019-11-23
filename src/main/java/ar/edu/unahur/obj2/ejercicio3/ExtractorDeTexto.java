package ar.edu.unahur.obj2.ejercicio3;

import java.util.stream.Collectors;

public class ExtractorDeTexto {

    public String extraerTexto(Documento documento) {
        return documento.nodes()
                .stream()
                .map(nodo -> nodo.extraer())
                .collect(Collectors.joining());
    }

}
