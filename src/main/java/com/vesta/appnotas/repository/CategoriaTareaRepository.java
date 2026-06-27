package com.vesta.appnotas.repository;

import com.vesta.appnotas.dto.CategoriaTareaConsultaDTO;
import com.vesta.appnotas.entity.CategoriaTarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CategoriaTareaRepository extends JpaRepository<CategoriaTarea, Integer> {
    @Query(name = "CategoriaTarea.listarCategorias")
    List<CategoriaTareaConsultaDTO> listarCategoriasTarea();

    @Procedure(procedureName = "sp_crearCategoriaTarea")
    void crearCategoriaTarea(
            @Param("p_nombre") String nombre,
            @Param("p_descripcion") String descripcion
    );

    @Procedure(procedureName = "sp_actualizarCategoriaTarea")
    void actualizarCategoriaTarea(
            @Param("p_nombre") String nombre,
            @Param("p_descripcion") String descripcion,
            @Param("p_idCategoriaTarea") Integer idCategoriaTarea
    );

    @Procedure(procedureName = "sp_eliminarCategoriaTarea")
    void eliminarCategoriaTarea(
            @Param("p_idCategoriaTarea") Integer idCategoriaTarea
    );

}
