package domain;

import domain.Inscripcion;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private Integer legajo;
    public List<Materia> materiasAprobadas;
    public Inscripcion inscripcion;

    public Alumno(Integer legajo) {
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<Materia>();
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public Inscripcion getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }

    public Boolean aprobo(String unaMateria) {
        return this.materiasAprobadas.stream().map(materia -> materia.nombre).toString().contains(unaMateria);
    }
    public void inscribirseA(List<Materia> materias){
        this.inscripcion = new Inscripcion();
        this.inscripcion.setMateriasSolicitadas(materias);
    }

}
