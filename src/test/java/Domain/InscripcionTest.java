package Domain;

import org.junit.Assert;
import org.junit.Test;

public class InscripcionTest {

    @Test
    public void alumnoPuedeCursarMateriaSinCorrelativas(){

        Alumno unNuevoAlumno = new Alumno("Pepito","0001");

        Materia analisis1 = new Materia("Analisis matematico 1", "001");

        Assert.assertTrue(unNuevoAlumno.cumpleCorrelativas(analisis1));

    }

    @Test
    public void alumnoPuedeCursarMateriaAnalisis2(){

        Alumno unNuevoAlumno = new Alumno("Pepito","0001");

        Materia analisis1 = new Materia("Analisis matematico 1", "001");

        Materia analisis2 = new Materia("Analisis matematico 2", "002");

        Materia algebra = new Materia("Algebra","003");

        analisis2.agregarCorrelativas(analisis1, algebra);

        unNuevoAlumno.aprobarMaterias(analisis1);

        Assert.assertFalse(unNuevoAlumno.cumpleCorrelativas(analisis2));

    }

    @Test
    public void inscribirseA2MateriasSinCorrelativas(){

        Alumno unNuevoAlumno = new Alumno("Pepito","0001");

        Materia analisis1 = new Materia("Analisis matematico 1", "001");

        Materia algebra = new Materia("algebra", "003");

        Inscripcion primeraInscripcion = new Inscripcion(unNuevoAlumno);

        primeraInscripcion.inscribirseMateria(analisis1, algebra);

        Assert.assertTrue(primeraInscripcion.aprobado());

    }

    @Test
    public void inscribirseA3MateriasConCorrelativas(){

        Alumno unNuevoAlumno = new Alumno("Pepito","0001");

        Materia analisis1 = new Materia("Analisis matematico 1", "001");

        Materia analisis2 = new Materia("Analisis matematico 2", "002");

        Materia algebra = new Materia("algebra", "003");

        Inscripcion inscripcion = new Inscripcion(unNuevoAlumno);

        analisis2.agregarCorrelativas(analisis1, algebra);

        inscripcion.inscribirseMateria(analisis1, algebra, analisis2);

        Assert.assertFalse(inscripcion.aprobado());

    }
}


