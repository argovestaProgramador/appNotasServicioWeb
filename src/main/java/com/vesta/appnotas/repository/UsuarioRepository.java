package com.vesta.appnotas.repository;

import com.vesta.appnotas.dto.UsuarioConsultaDTO;
import com.vesta.appnotas.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    @Query(name = "Usuario.listarUsuarios")
    List<UsuarioConsultaDTO> listarUsuarios();

    @Query(name = "Usuario.listaUsuarioId")
    List<UsuarioConsultaDTO> listarUsuarioId(@Param("p_idUsuario") Integer idUsuario);

    @Procedure(procedureName = "sp_crearUsuarioComun")
    void crearUsuarioComun(
            @Param("p_nombre") String nombre,
            @Param("p_contraseñaHash") String contraseñaHash,
            @Param("p_apellidoPaterno") String apellidoPaterno,
            @Param("p_apellidoMaterno") String apellidoMaterno,
            @Param("p_correoElectronico") String correoElectronico,
            @Param("p_fechaNacimiento")LocalDate fechaNacimiento
    );

    @Procedure(procedureName = "sp_crearUsuarioAdmin")
    void crearUsuarioAdmin(
            @Param("p_idRolUsuario") Integer idRolUsuario,
            @Param("p_nombre") String nombre,
            @Param("p_contraseñaHash") String contraseñaHash,
            @Param("p_apellidoPaterno") String apellidoPaterno,
            @Param("p_apellidoMaterno") String apellidoMaterno,
            @Param("p_correoElectronico") String correoElectronico,
            @Param("p_fechaNacimiento") LocalDate fechaNacimiento
    );

    @Procedure(procedureName = "sp_actualizarUsuarioComun")
    void actualizarUsuarioComun(
            @Param("p_nombre") String nombre,
            @Param("p_apellidoPaterno") String apellidoPaterno,
            @Param("p_apellidoMaterno") String apellidoMaterno,
            @Param("p_correoElectronico") String correoElectronico,
            @Param("p_fechaNacimiento") LocalDate fechaNacimiento,
            @Param("p_idUsuario") Integer idUsuario
    );

    @Procedure(procedureName = "sp_actualizarUsuarioAdmin")
    void actualizarUsuarioAdmin(
            @Param("p_idRolUsuario") Integer idRolUsuario,
            @Param("p_nombre") String nombre,
            @Param("p_apellidoPaterno") String apellidoPaterno,
            @Param("p_apellidoMaterno") String apellidoMaterno,
            @Param("p_correoElectronico") String correoElectronico,
            @Param("p_fechaNacimiento") LocalDate fechaNacimiento,
            @Param("p_idUsuario") Integer idUsuario
    );

    @Procedure(procedureName = "sp_eliminarUsuario")
    void eliminarUsuario(@Param("p_idUsuario") Integer idUsuario);

}
