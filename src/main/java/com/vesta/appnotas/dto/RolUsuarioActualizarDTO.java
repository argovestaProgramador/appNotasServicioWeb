package com.vesta.appnotas.dto;

public class RolUsuarioActualizarDTO {
    private String nombre;
    private String descripcion;
    private Integer idRolUsuario;

    public RolUsuarioActualizarDTO() {}
    public RolUsuarioActualizarDTO(String nombre, String descripcion, Integer idRolUsuario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idRolUsuario = idRolUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setIdRolUsuario(Integer idRolUsuario) {
        this.idRolUsuario = idRolUsuario;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public Integer getIdRolUsuario() {
        return this.idRolUsuario;
    }

}
