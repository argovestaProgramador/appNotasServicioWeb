package com.vesta.appnotas.dto;

public class CategoriaNotaActualizarDTO {
    private String nombre;
    private String descripcion;
    private Integer idCategoriaNota;

    public CategoriaNotaActualizarDTO() {}
    public CategoriaNotaActualizarDTO(String nombre, String descripcion, Integer idCategoriaNota) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idCategoriaNota = idCategoriaNota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setIdCategoriaNota(Integer idCategoriaNota) {
        this.idCategoriaNota = idCategoriaNota;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public Integer getIdCategoriaNota() {
        return this.idCategoriaNota;
    }

}
