package com.vesta.appnotas.service;

import com.vesta.appnotas.dto.CategoriaNotaActualizarDTO;
import com.vesta.appnotas.dto.CategoriaNotaConsultaDTO;
import com.vesta.appnotas.dto.CategoriaNotaCrearDTO;

import java.util.List;

public interface CategoriaNotaService {
    List<CategoriaNotaConsultaDTO> listarCategoriasNota();
    void crearCategoriaNota(CategoriaNotaCrearDTO categoriaNotaCrearDTO);
    void actualizarCategoraNota(CategoriaNotaActualizarDTO categoriaNotaActualizarDTO);
    void eliminarCategoriaNota(Integer idCategoriaNota);
}
