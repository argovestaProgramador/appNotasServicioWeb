package com.vesta.appnotas.repository;

import com.vesta.appnotas.dto.TareaConsultaDTO;
import com.vesta.appnotas.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Integer> {
    @Query(name = "Tareas.listarTareas")
    List<TareaConsultaDTO> listarTareas();

    @Query(name = "Tareas.listarTareasUsuario")
    List<TareaConsultaDTO> listarTareasUsuario(@Param("p_idUsuario") Integer idUsuario);

    @Query(name = "Tareas.listarTareaId")
    List<TareaConsultaDTO> buscarTarea(@Param("p_idTarea") Integer idTarea);

    @Procedure(procedureName = "sp_crearTarea")
    void insertarTarea(
            @Param("p_idCategoriaTarea") Integer idCategoriaTarea,
            @Param("p_idUsuario") Integer idUsuario,
            @Param("p_titulo") String titulo,
            @Param("p_descripcion") String descripcion,
            @Param("p_fechaInicio")LocalDate fechaInicio,
            @Param("p_fechaFinalizacion") LocalDate fechaFinalizacion
    );

}
