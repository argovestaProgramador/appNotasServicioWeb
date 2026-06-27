package com.vesta.appnotas.dto;

public class CategoriaNotaConsultaDTO {
    private Integer idCategoriaNota;
    private String nombre;
    private String descripcion;

    public CategoriaNotaConsultaDTO() {}
    public CategoriaNotaConsultaDTO(Integer idCategoriaNota, String nombre, String descripcion) {
        this.idCategoriaNota = idCategoriaNota;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void setIdCategoriaNota(Integer idCategoriaNota) {
        this.idCategoriaNota = idCategoriaNota;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdCategoriaNota() {
        return this.idCategoriaNota;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }

}
