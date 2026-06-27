package com.vesta.appnotas.service.impl;

import com.vesta.appnotas.dto.CategoriaTareaActualizarDTO;
import com.vesta.appnotas.dto.CategoriaTareaConsultaDTO;
import com.vesta.appnotas.dto.CategoriaTareaCrearDTO;
import com.vesta.appnotas.repository.CategoriaTareaRepository;
import com.vesta.appnotas.service.CategoriaTareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoriaTareaServiceImpl implements CategoriaTareaService {

    @Autowired
    private CategoriaTareaRepository categoriaTareaRepo;

    @Override
    @Transactional(readOnly = true)
    public List<CategoriaTareaConsultaDTO> listarCategoriasTarea() {
        return categoriaTareaRepo.listarCategoriasTarea();
    }

    @Override
    @Transactional
    public void crearCategoriaTarea(CategoriaTareaCrearDTO categoriaTareaCrearDTO) {
        categoriaTareaRepo.crearCategoriaTarea(
                categoriaTareaCrearDTO.getNombre(),
                categoriaTareaCrearDTO.getDescripcion()
        );
    }

    @Override
    @Transactional
    public void actualizarCategoriaTarea(CategoriaTareaActualizarDTO categoriaTareaActualizarDTO) {
        categoriaTareaRepo.actualizarCategoriaTarea(
                categoriaTareaActualizarDTO.getNombre(),
                categoriaTareaActualizarDTO.getDescripcion(),
                categoriaTareaActualizarDTO.getIdCategoriaTarea()
        );
    }

    @Override
    @Transactional
    public void eliminarCategoriaTarea(Integer idCategoriaTarea) {
        categoriaTareaRepo.eliminarCategoriaTarea(idCategoriaTarea);
    }

}
