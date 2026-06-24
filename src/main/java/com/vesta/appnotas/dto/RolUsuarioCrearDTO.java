package com.vesta.appnotas.dto;

public class RolUsuarioCrearDTO {
    private String nombre;
    private String descripcion;

    public RolUsuarioCrearDTO() {}
    public RolUsuarioCrearDTO(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }

}
