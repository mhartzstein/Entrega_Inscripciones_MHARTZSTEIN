package Domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {

    private String nombre;
    private String codigo;
    private List<Materia> materiasCorrelativas;

    public Materia(String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
        this.materiasCorrelativas = new ArrayList<>();
    }

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void agregarCorrelativas(Materia ... materias){
        Collections.addAll(this.materiasCorrelativas, materias);
    }
}
