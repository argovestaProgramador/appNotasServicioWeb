package com.vesta.appnotas.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "CategoriasTarea")
public class CategoriaTarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategoriaTarea")
    private Integer idCategoriaTarea;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "fechaCreacionRegistro")
    private LocalDate fechaCreacionRegistro;

    public CategoriaTarea() {}
    public CategoriaTarea(Integer idCategoriaTarea, String nombre, String descripcion, Boolean activo, LocalDate fechaCreacionRegistro) {
        this.idCategoriaTarea = idCategoriaTarea;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activo = activo;
        this.fechaCreacionRegistro = fechaCreacionRegistro;
    }

    public void setIdCategoriaTarea(Integer idCategoriaTarea) {
        this.idCategoriaTarea = idCategoriaTarea;
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

    public Integer getIdCategoriaTarea() {
        return this.idCategoriaTarea;
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
