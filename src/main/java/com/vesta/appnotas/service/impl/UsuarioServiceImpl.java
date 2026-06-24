package com.vesta.appnotas.service.impl;

import com.vesta.appnotas.dto.*;
import com.vesta.appnotas.repository.UsuarioRepository;
import com.vesta.appnotas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuRepo;

    @Override
    @Transactional(readOnly = true)
    public List<UsuarioConsultaDTO> listarUsuarios() {
        return usuRepo.listarUsuarios();
    }

    @Override
    @Transactional(readOnly = true)
    public List<UsuarioConsultaDTO> listarUsuarioId(Integer idUsuario) {
        return usuRepo.listarUsuarioId(idUsuario);
    }

    @Override
    @Transactional
    public void crearUsuarioComun(UsuarioCrearComunDTO usuarioCrearComun) {
        usuRepo.crearUsaurioComun(
                usuarioCrearComun.getNombre(),
                usuarioCrearComun.getContraseñaHash(),
                usuarioCrearComun.getApellidoPaterno(),
                usuarioCrearComun.getApellidoMaterno(),
                usuarioCrearComun.getCorreoElectronico(),
                usuarioCrearComun.getFechaNacimiento()
        );
    }

    @Override
    @Transactional
    public void crearUsuarioAdmin(UsuarioCrearAdminDTO usuarioCrearAdmin) {
        usuRepo.crearUsuarioAdmin(
                usuarioCrearAdmin.getIdRolUsuario(),
                usuarioCrearAdmin.getNombre(),
                usuarioCrearAdmin.getContraseñaHash(),
                usuarioCrearAdmin.getApellidoPaterno(),
                usuarioCrearAdmin.getApellidoMaterno(),
                usuarioCrearAdmin.getCorreoElectronico(),
                usuarioCrearAdmin.getFechaNacimiento()
        );
    }

    @Override
    @Transactional
    public void actualizarUsuarioComun(UsuarioActualizarComunDTO usuarioActualizarComun) {
        usuRepo.actualizarUsuarioComun(
                usuarioActualizarComun.getNombre(),
                usuarioActualizarComun.getApellidoPaterno(),
                usuarioActualizarComun.getApellidoMaterno(),
                usuarioActualizarComun.getCorreoElectronico(),
                usuarioActualizarComun.getFechaNacimiento(),
                usuarioActualizarComun.getIdUsuario()
        );
    }

    @Override
    @Transactional
    public void actualizarUsuarioAdmin(UsuarioActualizarAdminDTO usuarioActualizarAdmin) {
        usuRepo.actualizarUsuarioAdmin(
                usuarioActualizarAdmin.getIdRolUsuario(),
                usuarioActualizarAdmin.getNombre(),
                usuarioActualizarAdmin.getApellidoPaterno(),
                usuarioActualizarAdmin.getApellidoMaterno(),
                usuarioActualizarAdmin.getCorreoElectronico(),
                usuarioActualizarAdmin.getFechaNacimiento(),
                usuarioActualizarAdmin.getIdUsuario()
        );
    }

    @Override
    @Transactional
    public void eliminarUsuario(Integer idUsuario) {
        usuRepo.eliminarUsuario(idUsuario);
    }

}
