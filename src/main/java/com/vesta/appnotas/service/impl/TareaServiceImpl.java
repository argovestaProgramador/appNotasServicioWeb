package com.vesta.appnotas.service.impl;

import com.vesta.appnotas.dto.TareaConsultaDTO;
import com.vesta.appnotas.dto.TareaCrearDTO;
import com.vesta.appnotas.repository.TareaRepository;
import com.vesta.appnotas.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class TareaServiceImpl implements TareaService {

    @Autowired
    private TareaRepository tareaRepo;

    @Override
    @Transactional(readOnly = true)
    public List<TareaConsultaDTO> listarTareas() {
        return tareaRepo.listarTareas();
    }

    @Override
    @Transactional(readOnly = true)
    public List<TareaConsultaDTO> listarTareasUsuario(Integer idUsuario) {
       return tareaRepo.listarTareasUsuario(idUsuario);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TareaConsultaDTO> buscarTarea(Integer idTarea) {
        return tareaRepo.buscarTarea(idTarea);
    }

    @Override
    @Transactional
    public void insertarTarea(TareaCrearDTO tareaCrearDTO) {
        tareaRepo.insertarTarea(
                tareaCrearDTO.getIdCategoriaTarea(),
                tareaCrearDTO.getIdUsuario(),
                tareaCrearDTO.getTitulo(),
                tareaCrearDTO.getDescripcion(),
                tareaCrearDTO.getFechaInicio(),
                tareaCrearDTO.getFechaFinalizacion()
        );
    }
}
