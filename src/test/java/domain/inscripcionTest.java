package domain;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class inscripcionTest {

    @Test
   public void inscripcionValida(){

        Materia analisis1 = new Materia("Analisis 1");
        analisis1.codigo = 13;
        analisis1.correlativas = null;

        Materia algebra = new Materia("Algebra");
        algebra.codigo = 12;
        algebra.correlativas = null;

        Materia algoritmos = new Materia("Algoritmos");
        algoritmos.codigo = 11;
        algoritmos.correlativas = null;

        Materia arquitectura = new Materia("Arquitectura");
        arquitectura.codigo = 14;
        arquitectura.correlativas = null;

        Materia discreta = new Materia("Discreta");
        discreta.codigo = 15;
        discreta.correlativas = null;

        Materia analisis2 = new Materia("Analisis 2");
        analisis2.codigo = 24;
        analisis2.correlativas.add(algebra);
        analisis2.correlativas.add(analisis1);

        Materia paradigmas = new Materia("Paradigmas");
        analisis2.codigo = 23;
        analisis2.correlativas.add(algoritmos);
        analisis2.correlativas.add(discreta);

        Alumno alumnoBueno = new Alumno(1645);
        alumnoBueno.materiasAprobadas.add(analisis1);
        alumnoBueno.materiasAprobadas.add(algebra);
        alumnoBueno.materiasAprobadas.add(algoritmos);
        alumnoBueno.materiasAprobadas.add(discreta);
        alumnoBueno.materiasAprobadas.add(arquitectura);

        List<Materia> listaMaterias = new ArrayList<Materia>();
        listaMaterias.add(analisis2);
        listaMaterias.add(paradigmas);
        alumnoBueno.inscribirseA(listaMaterias);
        alumnoBueno.inscripcion.unAlumno = alumnoBueno;



        Assert.assertEquals(true, alumnoBueno.inscripcion.aprobada().booleanValue());

    }
    @Test
    public void inscripcionInvalida(){
        Materia analisis1 = new Materia("Analisis 1");
        analisis1.codigo = 13;
        analisis1.correlativas = null;

        Materia algebra = new Materia("Algebra");
        algebra.codigo = 12;
        algebra.correlativas = null;

        Materia algoritmos = new Materia("Algoritmos");
        algoritmos.codigo = 11;
        algoritmos.correlativas = null;

        Materia arquitectura = new Materia("Arquitectura");
        arquitectura.codigo = 14;
        arquitectura.correlativas = null;

        Materia discreta = new Materia("Discreta");
        discreta.codigo = 15;
        discreta.correlativas = null;

        Materia analisis2 = new Materia("Analisis 2");
        analisis2.codigo = 24;
        analisis2.correlativas.add(algebra);
        analisis2.correlativas.add(analisis1);

        Materia paradigmas = new Materia("Paradigmas");
        analisis2.codigo = 23;
        analisis2.correlativas.add(algoritmos);
        analisis2.correlativas.add(discreta);

        Alumno malAlumno = new Alumno(1555);
        malAlumno.materiasAprobadas.add(analisis1);
        malAlumno.materiasAprobadas.add(algoritmos);
        malAlumno.materiasAprobadas.add(discreta);

        List<Materia> listaMaterias = new ArrayList<Materia>();
        listaMaterias.add(analisis2);
        listaMaterias.add(paradigmas);
        malAlumno.inscribirseA(listaMaterias);
        malAlumno.inscripcion.unAlumno = malAlumno;

        Assert.assertEquals(false, malAlumno.inscripcion.aprobada().booleanValue());

    }
}
