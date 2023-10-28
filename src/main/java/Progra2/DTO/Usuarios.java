package Progra2.DTO;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Usuarios {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idusuario", nullable = false, length = 255)
    private String idusuario;
    @Basic
    @Column(name = "usuario", nullable = true, length = 255)
    private String usuario;
    @Basic
    @Column(name = "password", nullable = true, length = 255)
    private String password;

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuarios usuarios = (Usuarios) o;
        return Objects.equals(idusuario, usuarios.idusuario) && Objects.equals(usuario, usuarios.usuario) && Objects.equals(password, usuarios.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idusuario, usuario, password);
    }
}
