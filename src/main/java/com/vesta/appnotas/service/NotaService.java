package com.vesta.appnotas.service;

import com.vesta.appnotas.dto.NotaActualizarDTO;
import com.vesta.appnotas.dto.NotaConsultaDTO;
import com.vesta.appnotas.dto.NotaCrearDTO;

import java.util.List;

public interface NotaService {
    List<NotaConsultaDTO> listarNotas();
    List<NotaConsultaDTO> listarNotasUsuario(Integer idUsuario);
    List<NotaConsultaDTO> listarNotasPorId(Integer idNota);
    void crearNota(NotaCrearDTO notaCrearDTO);
    void actualizarNota(NotaActualizarDTO notaActualizarDTO);
    void eliminarNota(Integer idNota);
}
