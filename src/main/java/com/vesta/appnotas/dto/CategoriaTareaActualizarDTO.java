package com.vesta.appnotas.dto;

public class CategoriaTareaActualizarDTO {
    private String nombre;
    private String descripcion;
    private Integer idCategoriaTarea;

    public CategoriaTareaActualizarDTO() {}
    public CategoriaTareaActualizarDTO(String nombre, String descripcion, Integer idCategoriaTarea) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idCategoriaTarea = idCategoriaTarea;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setIdCategoriaTarea(Integer idCategoriaTarea) {
        this.idCategoriaTarea = idCategoriaTarea;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public Integer getIdCategoriaTarea() {
        return this.idCategoriaTarea;
    }

}
