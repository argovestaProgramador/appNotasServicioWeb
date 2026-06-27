package com.vesta.appnotas.service.impl;

import com.vesta.appnotas.dto.NotaActualizarDTO;
import com.vesta.appnotas.dto.NotaConsultaDTO;
import com.vesta.appnotas.dto.NotaCrearDTO;
import com.vesta.appnotas.repository.NotaRepository;
import com.vesta.appnotas.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NotaServiceImpl implements NotaService {

    @Autowired
    private NotaRepository notaRepo;

    @Override
    @Transactional(readOnly = true)
    public List<NotaConsultaDTO> listarNotas() {
        return notaRepo.listarNotas();
    }

    @Override
    @Transactional(readOnly = true)
    public List<NotaConsultaDTO> listarNotasUsuario(Integer idUsuario) {
        return notaRepo.listarNotasUsuario(idUsuario);
    }

    @Override
    @Transactional(readOnly = true)
    public List<NotaConsultaDTO> listarNotasPorId(Integer idNota) {
        return notaRepo.listarNotaId(idNota);
    }

    @Override
    @Transactional
    public void crearNota(NotaCrearDTO notaCrearDTO) {
        notaRepo.insertarNota(
                notaCrearDTO.getIdCategoriaNota(),
                notaCrearDTO.getIdUsuario(),
                notaCrearDTO.getTitulo(),
                notaCrearDTO.getDescripcion()
        );
    }

    @Override
    @Transactional
    public void actualizarNota(NotaActualizarDTO notaActualizarDTO) {
        notaRepo.actualizarNota(
                notaActualizarDTO.getIdCategoriaNota(),
                notaActualizarDTO.getIdUsuario(),
                notaActualizarDTO.getTitulo(),
                notaActualizarDTO.getDescripcion(),
                notaActualizarDTO.getIdNota()
        );
    }

    @Override
    public void eliminarNota(Integer idNota) {
        notaRepo.eliminarNota(idNota);
    }

}
