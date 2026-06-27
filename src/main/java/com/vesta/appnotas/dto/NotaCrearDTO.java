package com.vesta.appnotas.dto;

public class NotaCrearDTO {
    private Integer idCategoriaNota;
    private Integer idUsuario;
    private String titulo;
    private String descripcion;

    public NotaCrearDTO() {}
    public NotaCrearDTO(Integer idCategoriaNota, Integer idUsuario, String titulo, String descripcion) {
        this.idCategoriaNota = idCategoriaNota;
        this.idUsuario = idUsuario;
        this.titulo = titulo;
        this.descripcion = descripcion;
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

}
