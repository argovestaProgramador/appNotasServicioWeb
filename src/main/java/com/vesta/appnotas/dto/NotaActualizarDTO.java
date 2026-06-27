package com.vesta.appnotas.dto;

public class NotaActualizarDTO {
    private Integer idCategoriaNota;
    private Integer idUsaurio;
    private String titulo;
    private String descripcion;
    private Integer idNota;

    public NotaActualizarDTO() {}
    public NotaActualizarDTO(Integer idCategoriaNota, Integer idUsaurio, String titulo, String descripcion, Integer idNota) {
        this.idCategoriaNota = idCategoriaNota;
        this.idUsaurio = idUsaurio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.idNota = idNota;
    }

    public void setIdCategoriaNota(Integer idCategoriaNota) {
        this.idCategoriaNota = idCategoriaNota;
    }
    public void setIdUsuario(Integer idUsaurio) {
        this.idUsaurio = idUsaurio;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
    }

    public Integer getIdCategoriaNota() {
        return this.idCategoriaNota;
    }
    public Integer getIdUsuario() {
        return this.idUsaurio;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public Integer getIdNota() {
        return this.idNota;
    }

}
