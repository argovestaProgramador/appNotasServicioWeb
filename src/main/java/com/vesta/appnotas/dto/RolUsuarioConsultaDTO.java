package com.vesta.appnotas.dto;

public class RolUsuarioConsultaDTO {
    private Integer idRol;
    private String nombre;
    private String descripcion;

    public RolUsuarioConsultaDTO() {}
    public RolUsuarioConsultaDTO(Integer idRol, String nombre, String descripcion ) {
        this.idRol = idRol;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdRol() {
        return this.idRol;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }

}
