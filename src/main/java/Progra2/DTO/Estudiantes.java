package Progra2.DTO;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Objects;

@Entity

public class Estudiantes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idestudiante", nullable = false, unique = true, precision = 0)
    private BigInteger idestudiante;
    @Basic
    @Column(name = "nombre", nullable = true, length = 255)
    private String nombre;
    @Basic
    @Column(name = "apellido", nullable = true, length = 255)
    private String apellido;
    @OneToMany(mappedBy = "estudiante")
    private Collection<Asignaciones> asignaciones;

    public BigInteger getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(BigInteger idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiantes that = (Estudiantes) o;
        return Objects.equals(idestudiante, that.idestudiante) && Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idestudiante, nombre, apellido);
    }

    public Collection<Asignaciones> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(Collection<Asignaciones> asignaciones) {
        this.asignaciones = asignaciones;
    }
}
