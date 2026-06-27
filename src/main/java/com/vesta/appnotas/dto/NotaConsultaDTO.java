package com.vesta.appnotas.dto;

public class NotaConsultaDTO {
    private Integer idNota;
    private String categoria;
    private String titulo;
    private String descripcion;

    public NotaConsultaDTO() {}
    public NotaConsultaDTO(Integer idNota, String categoria, String titulo, String descripcion) {
        this.idNota = idNota;
        this.categoria = categoria;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdNota() {
        return this.idNota;
    }
    public String getCategoria() {
        return this.categoria;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }

}
