package com.vesta.appnotas.repository;

import com.vesta.appnotas.dto.CategoriaNotaConsultaDTO;
import com.vesta.appnotas.entity.CategoriaNota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaNotaRepository extends JpaRepository<CategoriaNota, Integer> {

    @Query(name = "CategoriaNota.listarCategoriasNota")
    List<CategoriaNotaConsultaDTO> listarCategoriasNota();

    @Procedure(procedureName = "sp_crearCategoriaNota")
    void insertarCategoriaNota(
            @Param("p_nombre") String nombre,
            @Param("p_descripcion") String descripcion
    );

    @Procedure(procedureName = "sp_actualizarCategoriaNota")
    void actualizarCategoriaNota(
        @Param("p_nombre") String nombre,
        @Param("p_descripcion") String descripcion,
        @Param("p_idCategoriaNota") Integer idCategoriaNota
    );

    @Procedure(procedureName = "sp_eliminarCategoriaNota")
    void eliminarCategoriaNota(@Param("p_idCategoriaNota") Integer idCategoriaNota);

}
