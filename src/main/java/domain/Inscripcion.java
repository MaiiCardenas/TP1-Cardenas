package domain;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    public Integer numeroInscripcion;

    public Alumno unAlumno;
    public List<Materia> materiasSolicitadas;


    public Inscripcion() {
        this.materiasSolicitadas = new ArrayList<Materia>();
    }

    public void setMateriasSolicitadas(List<Materia> materiasSolicitadas) {
        this.materiasSolicitadas = materiasSolicitadas;
    }


    public Boolean aprobada(){
        return this.materiasSolicitadas.stream().allMatch(materia-> materia.cumpleCorrelativas(this.unAlumno));
    }

}