package com.vesta.appnotas.repository;

import com.vesta.appnotas.dto.RolUsuarioConsultaDTO;
import com.vesta.appnotas.entity.RolUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RolUsuarioRepository extends JpaRepository<RolUsuario, Integer> {

    @Query(name = "Rol.listarRolesUsuario")
    List<RolUsuarioConsultaDTO> listarRolesUsuario();

    @Procedure(procedureName = "sp_crearRolUsuario")
    void insertarRolUsuario(
            @Param("p_nombre") String nombre,
            @Param("p_descripcion") String descripcion
    );

    @Procedure(procedureName = "sp_actualizarRolUsuario")
    void actualizarRolUsuario(
            @Param("p_nombre") String nombre,
            @Param("p_descripcion") String descripcion,
            @Param("p_idRolUsuario") Integer idRolUsuario
    );

    @Procedure(procedureName = "sp_eliminarRolUsuario")
    void eliminarRolUsuario(@Param("p_idRolUsuario") Integer idRolUsuario);
}
