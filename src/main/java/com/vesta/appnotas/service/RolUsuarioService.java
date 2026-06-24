package com.vesta.appnotas.service;

import com.vesta.appnotas.dto.RolUsuarioActualizarDTO;
import com.vesta.appnotas.dto.RolUsuarioConsultaDTO;
import com.vesta.appnotas.dto.RolUsuarioCrearDTO;

import java.util.List;

public interface RolUsuarioService {
    List<RolUsuarioConsultaDTO> listarRolesUsuario();
    void insertarRolUsuario(RolUsuarioCrearDTO rolUsuarioCrearDTO);
    void actualizarRolUsuario(RolUsuarioActualizarDTO rolUsuarioActualizarDTO);
    void eliminarRolUsuario(Integer idRolUsuario);
}
