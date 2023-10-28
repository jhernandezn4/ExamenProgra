package Progra2.DTO;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Cursos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idcurso", nullable = false, precision = 0)
    private BigInteger idcurso;
    @Basic
    @Column(name = "nombre", nullable = true, length = 255)
    private String nombre;
    @OneToMany(mappedBy = "curso")
    private Collection<Asignaciones> asignaciones;

    public BigInteger getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(BigInteger idcurso) {
        this.idcurso = idcurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cursos cursos = (Cursos) o;
        return Objects.equals(idcurso, cursos.idcurso) && Objects.equals(nombre, cursos.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcurso, nombre);
    }

    public Collection<Asignaciones> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(Collection<Asignaciones> asignaciones) {
        this.asignaciones = asignaciones;
    }
}
