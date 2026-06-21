package com.vesta.appnotas.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Notas")
public class Notas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNota")
    private Integer idNota;
    @Column(name = "idCategoriaNota")
    private Integer idCategoriaNota;
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "fechaCreacionRegistro")
    private LocalDate fechaCreacionRegistro;

    public Notas() {}
    public Notas(Integer idNota, Integer idCategoriaNota, Integer idUsuario, String titulo, String descripcion,
                 Boolean activo, LocalDate fechaCreacionRegistro) {
        this.idNota = idNota;
        this.idCategoriaNota = idCategoriaNota;
        this.idUsuario = idUsuario;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.activo = activo;
        this.fechaCreacionRegistro = fechaCreacionRegistro;
    }

    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
    }
    public void setIdCategoriaNota(Integer idCategoriaNota) {
        this.idCategoriaNota = idCategoriaNota;
    }
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    public void setFechaCreacionRegistro(LocalDate fechaCreacionRegistro) {
        this.fechaCreacionRegistro = fechaCreacionRegistro;
    }

    public Integer getIdNota() {
        return this.idNota;
    }
    public Integer getIdCategoriaNota() {
        return this.idCategoriaNota;
    }
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public Boolean getActivo() {
        return this.activo;
    }
    public LocalDate getFechaCreacionRegistro() {
        return this.fechaCreacionRegistro;
    }

}
