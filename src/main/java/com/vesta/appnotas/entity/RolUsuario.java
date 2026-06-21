package com.vesta.appnotas.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "RolesUsuario")
public class RolUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRolUsuario")
    private Integer idRolUsuario;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "fechaCreacionRegistro")
    private LocalDate fechaCreacionRegistro;

    public RolUsuario() {}
    public RolUsuario(Integer idRolUsuario, String nombre, String descripcion, Boolean activo, LocalDate fechaCreacionRegistros) {
        this.idRolUsuario = idRolUsuario;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activo = activo;
        this.fechaCreacionRegistro = fechaCreacionRegistros;
    }

    public void setIdRolUsuario(Integer idRolUsuario) {
        this.idRolUsuario = idRolUsuario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    public void setFechaCreacionRegistro(LocalDate fechaCreacionRegistro) {
        this.fechaCreacionRegistro = fechaCreacionRegistro;
    }

    public Integer getIdRolUsuario() {
        return this.idRolUsuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public Boolean getActivo() {
        return this.activo;
    }
    public LocalDate getFechaCreacionRegistro() {
        return this.fechaCreacionRegistro;
    }

}
