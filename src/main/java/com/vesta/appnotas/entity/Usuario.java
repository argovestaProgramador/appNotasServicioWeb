package com.vesta.appnotas.entity;

import com.vesta.appnotas.dto.UsuarioConsultaDTO;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Usuarios")
@SqlResultSetMapping(
        name = "UsuarioConsulta",
        classes = @ConstructorResult(
                targetClass = UsuarioConsultaDTO.class,
                columns = {
                        @ColumnResult(name = "idUsuario", type = Integer.class),
                        @ColumnResult(name = "nombre", type = String.class),
                        @ColumnResult(name = "apellidoPaterno", type = String.class),
                        @ColumnResult(name = "apellidoMaterno", type = String.class),
                        @ColumnResult(name = "correoElectronico", type = String.class),
                        @ColumnResult(name = "fechaNacimiento", type = LocalDate.class)
                }
        )
)
@NamedNativeQuery(
        name = "Usuario.listarUsuarios",
        query = "SELECT * FROM fn_listarUsuarios()",
        resultSetMapping = "UsuarioConsulta"
)
@NamedNativeQuery(
        name = "Usuario.listaUsuarioId",
        query = "SELECT * FROM fn_buscarUsuariosPorId(:p_idUsuario)",
        resultSetMapping = "UsuarioConsulta"
)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Column(name = "idRolUsuario")
    private Integer idRolUsuario;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "contraseñaHash")
    private String contraseñaHash;
    @Column(name = "apellidoPaterno")
    private String apellidoPaterno;
    @Column(name = "apellidoMaterno")
    private String apellidoMaterno;
    @Column(name = "correoElectronico")
    private String correoElectronico;
    @Column(name = "fechaNacimiento")
    private LocalDate fechaNacimiento;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "fechaCreacionRegistro")
    private LocalDate fechaCreacionRegistro;

    public Usuario() {}
    public Usuario(Integer idUsuario, Integer idRolUsuario, String nombre, String contraseñaHash, String apellidoPaterno, String apellidoMaterno,
                   String correoElectronico, LocalDate fechaNacimiento, Boolean activo, LocalDate fechaCreacionRegistro) {
        this.idUsuario = idUsuario;
        this.idRolUsuario = idRolUsuario;
        this.nombre = nombre;
        this.contraseñaHash = contraseñaHash;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.activo = activo;
        this.fechaCreacionRegistro = fechaCreacionRegistro;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    public void setFechaCreacionRegistro(LocalDate fechaCreacionRegistro) {
        this.fechaCreacionRegistro = fechaCreacionRegistro;
    }

    public Integer getIdUsuario() {
        return this.idUsuario;
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
    public Boolean getActivo() {
        return this.activo;
    }
    public LocalDate getFechaCreacionRegistro() {
        return this.fechaCreacionRegistro;
    }

}
