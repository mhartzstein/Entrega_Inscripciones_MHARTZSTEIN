package Domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {

    private String legajo;
    private String nombre;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String legajo){
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public Boolean cumpleCorrelativas(Materia materia){
        if(materia.getMateriasCorrelativas().size() == 0)
            return true;
        else
            return this.materiasAprobadas.containsAll(materia.getMateriasCorrelativas());
    }
    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
    public void aprobarMaterias(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }
}
