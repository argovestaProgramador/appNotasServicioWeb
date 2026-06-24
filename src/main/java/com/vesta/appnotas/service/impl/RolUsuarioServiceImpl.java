package com.vesta.appnotas.service.impl;

import com.vesta.appnotas.dto.RolUsuarioActualizarDTO;
import com.vesta.appnotas.dto.RolUsuarioConsultaDTO;
import com.vesta.appnotas.dto.RolUsuarioCrearDTO;
import com.vesta.appnotas.repository.RolUsuarioRepository;
import com.vesta.appnotas.service.RolUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class RolUsuarioServiceImpl implements RolUsuarioService {

    @Autowired
    private RolUsuarioRepository rolUsuarioRepo;

    @Override
    @Transactional(readOnly = true)
    public List<RolUsuarioConsultaDTO> listarRolesUsuario() {
        return rolUsuarioRepo.listarRolesUsuario();
    }

    @Override
    @Transactional
    public void insertarRolUsuario(RolUsuarioCrearDTO rolUsuarioCrearDTO) {
        rolUsuarioRepo.insertarRolUsuario(
                rolUsuarioCrearDTO.getNombre(),
                rolUsuarioCrearDTO.getDescripcion()
        );
    }

    @Override
    @Transactional
    public void actualizarRolUsuario(RolUsuarioActualizarDTO rolUsuarioActualizarDTO) {
        rolUsuarioRepo.actualizarRolUsuario(
                rolUsuarioActualizarDTO.getNombre(),
                rolUsuarioActualizarDTO.getDescripcion(),
                rolUsuarioActualizarDTO.getIdRolUsuario()
        );
    }

    @Override
    public void eliminarRolUsuario(Integer idRolUsuario) {
        rolUsuarioRepo.eliminarRolUsuario(idRolUsuario);
    }
}
