package com.vesta.appnotas.dto;

import java.time.LocalDate;

public class TareaCrearDTO {
    private Integer idCategoriaTarea;
    private Integer idUsuario;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFinalizacion;

    public TareaCrearDTO() {}
    public TareaCrearDTO(Integer idCategoriaTarea, Integer idUsuario, String titulo, String descripcion, LocalDate fechaInicio,
        LocalDate fechaFinalizacion ) {
        this.idCategoriaTarea = idCategoriaTarea;
        this.idUsuario = idUsuario;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
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

}
