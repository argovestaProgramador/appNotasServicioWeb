package com.vesta.appnotas.service;

import com.vesta.appnotas.dto.*;

import java.util.List;

public interface UsuarioService {
    List<UsuarioConsultaDTO> listarUsuarios();
    List<UsuarioConsultaDTO> listarUsuarioId(Integer idUsuario);
    void crearUsuarioComun(UsuarioCrearComunDTO usuarioCrearComun);
    void crearUsuarioAdmin(UsuarioCrearAdminDTO usuarioCrearAdmin);
    void actualizarUsuarioComun(UsuarioActualizarComunDTO usuarioActualizarComun);
    void actualizarUsuarioAdmin(UsuarioActualizarAdminDTO usuarioActualizarAdmin);
    void eliminarUsuario(Integer idUsuario);
}
