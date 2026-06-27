package com.vesta.appnotas.dto;

import java.time.LocalDate;

public class TareaConsultaDTO {
    private Integer idTarea;
    private String categoria;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFinalizacion;

    public TareaConsultaDTO() {}
    public TareaConsultaDTO(Integer idTarea, String categoria, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFinalizacion) {
        this.idTarea = idTarea;
        this.categoria = categoria;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public void setIdTarea(Integer idTarea) {
        this.idTarea = idTarea;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public Integer getIdTarea() {
        return this.idTarea;
    }
    public String getCategoria() {
        return this.categoria;
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
