package com.vesta.appnotas.service;

import com.vesta.appnotas.dto.CategoriaTareaActualizarDTO;
import com.vesta.appnotas.dto.CategoriaTareaConsultaDTO;
import com.vesta.appnotas.dto.CategoriaTareaCrearDTO;

import java.util.List;

public interface CategoriaTareaService {
    List<CategoriaTareaConsultaDTO> listarCategoriasTarea();
    void crearCategoriaTarea(CategoriaTareaCrearDTO categoriaTareaCrearDTO);
    void actualizarCategoriaTarea(CategoriaTareaActualizarDTO categoriaTareaActualizarDTO);
    void eliminarCategoriaTarea(Integer idCategoriaTarea);
}
