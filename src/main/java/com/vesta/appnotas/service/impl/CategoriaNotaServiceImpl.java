package com.vesta.appnotas.service.impl;

import com.vesta.appnotas.dto.CategoriaNotaActualizarDTO;
import com.vesta.appnotas.dto.CategoriaNotaConsultaDTO;
import com.vesta.appnotas.dto.CategoriaNotaCrearDTO;
import com.vesta.appnotas.repository.CategoriaNotaRepository;
import com.vesta.appnotas.service.CategoriaNotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class CategoriaNotaServiceImpl implements CategoriaNotaService {

    @Autowired
    private CategoriaNotaRepository categoriaNotaRepo;

    @Override
    @Transactional(readOnly = true)
    public List<CategoriaNotaConsultaDTO> listarCategoriasNota() {
        return categoriaNotaRepo.listarCategoriasNota();
    }

    @Override
    @Transactional
    public void crearCategoriaNota(CategoriaNotaCrearDTO categoriaNotaCrearDTO) {
        categoriaNotaRepo.insertarCategoriaNota(
                categoriaNotaCrearDTO.getNombre(),
                categoriaNotaCrearDTO.getDescripcion()
        );
    }

    @Override
    @Transactional
    public void actualizarCategoraNota(CategoriaNotaActualizarDTO categoriaNotaActualizarDTO) {
        categoriaNotaRepo.actualizarCategoriaNota(
                categoriaNotaActualizarDTO.getNombre(),
                categoriaNotaActualizarDTO.getDescripcion(),
                categoriaNotaActualizarDTO.getIdCategoriaNota()
        );
    }

    @Override
    public void eliminarCategoriaNota(Integer idCategoriaNota) {
        categoriaNotaRepo.eliminarCategoriaNota(idCategoriaNota);
    }
}
