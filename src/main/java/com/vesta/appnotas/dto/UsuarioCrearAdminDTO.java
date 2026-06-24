package com.vesta.appnotas.dto;

import java.time.LocalDate;

public class UsuarioCrearAdminDTO {
    private Integer idRolUsuario;
    private String nombre;
    private String contraseñaHash;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correoElectronico;
    private LocalDate fechaNacimiento;

    public UsuarioCrearAdminDTO() {}
    public UsuarioCrearAdminDTO(Integer idRolUsuario, String nombre, String contraseñaHash, String apellidoPaterno, String apellidoMaterno,
                                String correoElectronico, LocalDate fechaNacimiento) {
        this.idRolUsuario = idRolUsuario;
        this.nombre = nombre;
        this.contraseñaHash = contraseñaHash;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setIdRolUsuario(Integer idRolUsuario) {
        this.idRolUsuario = idRolUsuario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setContraseñaHash(String contraseñaHash) {
        this.contraseñaHash = contraseñaHash;
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

    public Integer getIdRolUsuario() {
        return this.idRolUsuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getContraseñaHash() {
        return this.contraseñaHash;
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

}
