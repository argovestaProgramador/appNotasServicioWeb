package com.vesta.appnotas.service;

import com.vesta.appnotas.dto.TareaConsultaDTO;
import com.vesta.appnotas.dto.TareaCrearDTO;

import java.util.List;

public interface TareaService {
    List<TareaConsultaDTO> listarTareas();
    List<TareaConsultaDTO> listarTareasUsuario(Integer idUsuario);
    List<TareaConsultaDTO> buscarTarea(Integer idTarea);
    void insertarTarea(TareaCrearDTO tareaCrearDTO);
}
