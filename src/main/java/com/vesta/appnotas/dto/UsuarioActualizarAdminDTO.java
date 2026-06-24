package com.vesta.appnotas.dto;

import java.time.LocalDate;

public class UsuarioActualizarAdminDTO {
    private Integer idRolUsuario;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correoElectronico;
    private LocalDate fechaNacimiento;
    private Integer idUsuario;

    public UsuarioActualizarAdminDTO() {}
    public UsuarioActualizarAdminDTO(Integer idRolUsuario, String nombre, String apellidoPaterno, String apellidoMaterno,
                                String correoElectronico, LocalDate fechaNacimiento, Integer idUsuario) {
        this.idRolUsuario = idRolUsuario;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.idUsuario = idUsuario;
    }

    public void setIdRolUsuario(Integer idRolUsuario) {
        this.idRolUsuario = idRolUsuario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdRolUsuario() {
        return this.idRolUsuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }
    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    public Integer getIdUsuario() {
        return this.idUsuario;
    }

}
