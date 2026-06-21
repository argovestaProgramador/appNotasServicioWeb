package com.vesta.appnotas.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "CategoriasNota")
public class CategoriaNota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategoriaNota")
    private Integer idCategoriaNota;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "fechaCreacionRegistro")
    private LocalDate fechaCreacionRegistro;

    public void setIdCategoriaNota(Integer idCategoriaNota) {
        this.idCategoriaNota = idCategoriaNota;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Integer getIdCategoriaNota() {
        return this.idCategoriaNota;
    }
    public String getNombre() {
        return this.nombre;
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
