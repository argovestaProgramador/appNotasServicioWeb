package com.vesta.appnotas.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Tareas")
public class Tareas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTarea")
    private Integer idTarea;
    @Column(name = "idCategoriaTarea")
    private Integer idCategoriaTarea;
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fechaInicio")
    private LocalDate fechaInicio;
    @Column(name = "fechaFinalizacion")
    private LocalDate fechaFinalizacion;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "fechaCreacionRegistro")
    private LocalDate fechaCreacionRegistro;

    public Tareas() {}
    public Tareas (Integer idTarea, Integer idCategoriaTarea, Integer idUsuario, String titulo, String descripcion,
                   LocalDate fechaInicio, LocalDate fechaFinalizacion, Boolean activo, LocalDate fechaCreacionRegistro) {
        this.idTarea = idTarea;
        this.idCategoriaTarea = idCategoriaTarea;
        this.idUsuario = idUsuario;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.activo = activo;
        this.fechaCreacionRegistro = fechaCreacionRegistro;
    }

    public void setIdTarea(Integer idTarea) {
        this.idTarea = idTarea;
    }
    public void setIdCategoriaTarea(Integer idCategoriaTarea) {
        this.idCategoriaTarea = idCategoriaTarea;
    }
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    public void setFechaCreacionRegistro(LocalDate fechaCreacionRegistro) {
        this.fechaCreacionRegistro = fechaCreacionRegistro;
    }

    public Integer getIdTarea() {
        return this.idTarea;
    }
    public Integer getIdCategoriaTarea() {
        return this.idCategoriaTarea;
    }
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public LocalDate getFechaInicio() {
        return this.fechaInicio;
    }
    public LocalDate getFechaFinalizacion() {
        return this.fechaFinalizacion;
    }
    public Boolean getActivo() {
        return this.activo;
    }
    public LocalDate getFechaCreacionRegistro() {
        return this.fechaCreacionRegistro;
    }

}
