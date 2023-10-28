package Progra2.DTO;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Objects;

@Entity
public class Asignaciones {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idasignacion", nullable = false, precision = 0)
    private BigInteger idasignacion;
    @Basic
    @Column(name = "idestudiante", nullable = true, precision = 0)
    private BigInteger idestudiante;
    @Basic
    @Column(name = "idcurso", nullable = true, precision = 0)
    private BigInteger idcurso;
    @ManyToOne
    @JoinColumn(name = "idestudiante", insertable=false, updatable=false, referencedColumnName = "idestudiante")
    private Estudiantes estudiante;
    @ManyToOne
    @JoinColumn(name = "idcurso",insertable=false, updatable=false, referencedColumnName = "idcurso")
    private Cursos curso;

    public BigInteger getIdasignacion() {
        return idasignacion;
    }

    public void setIdasignacion(BigInteger idasignacion) {
        this.idasignacion = idasignacion;
    }

    public BigInteger getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(BigInteger idestudiante) {
        this.idestudiante = idestudiante;
    }

    public BigInteger getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(BigInteger idcurso) {
        this.idcurso = idcurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asignaciones that = (Asignaciones) o;
        return Objects.equals(idasignacion, that.idasignacion) && Objects.equals(idestudiante, that.idestudiante) && Objects.equals(idcurso, that.idcurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idasignacion, idestudiante, idcurso);
    }

    public Estudiantes getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiantes estudiante) {
        this.estudiante = estudiante;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }
}
