package com.vesta.appnotas.dto;

public class CategoriaTareaConsultaDTO {
    private Integer idCategoriaTarea;
    private String nombre;
    private String descripcion;

    public CategoriaTareaConsultaDTO() {}
    public CategoriaTareaConsultaDTO(Integer idCategoriaTarea, String nombre, String descripcion) {
        this.idCategoriaTarea = idCategoriaTarea;
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public Integer getIdCategoriaTarea() {
        return this.idCategoriaTarea;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }

}
