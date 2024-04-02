package Domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAIncribirse;

    public Inscripcion(Alumno alumno){
        this.alumno = alumno;
        this.materiasAIncribirse = new ArrayList<>();
    }
    public Boolean aprobado(){
       return materiasAIncribirse.stream().allMatch(materia -> alumno.cumpleCorrelativas(materia));
    }
    public void inscribirseMateria(Materia ... materias){
        Collections.addAll(this.materiasAIncribirse, materias);
    }
}
