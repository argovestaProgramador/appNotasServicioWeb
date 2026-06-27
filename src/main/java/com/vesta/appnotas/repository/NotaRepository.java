package com.vesta.appnotas.repository;

import com.vesta.appnotas.dto.NotaConsultaDTO;
import com.vesta.appnotas.entity.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Integer> {

    @Query(name = "NotaConsulta.listarNotas")
    List<NotaConsultaDTO> listarNotas();

    @Query(name = "NotaConsulta.listarNotasUsuario")
    List<NotaConsultaDTO> listarNotasUsuario(
            @Param("p_idUsuario") Integer idUsuario
    );

    @Query(name = "NotaConsulta.listarNotaId")
    List<NotaConsultaDTO> listarNotaId(
            @Param("p_idNota") Integer idNota
    );

    @Procedure(procedureName = "sp_crearNota")
    void insertarNota(
        @Param("p_idCategoriaNota") Integer idCategoriaNota,
        @Param("p_idUsuario") Integer idUsuario,
        @Param("p_titulo") String titulo,
        @Param("p_descripcion") String descripcion
    );

    @Procedure(procedureName = "sp_actualizarNota")
    void actualizarNota(
            @Param("p_idCategoriaNota") Integer idCategoriaNota,
            @Param("p_idUsuario") Integer idUsuario,
            @Param("p_titulo") String titulo,
            @Param("p_descripcion") String descripcion,
            @Param("p_idNota") Integer idNota
    );

    @Procedure(procedureName = "sp_eliminarNota")
    void eliminarNota(@Param("p_idNota")  Integer idNota);

}
