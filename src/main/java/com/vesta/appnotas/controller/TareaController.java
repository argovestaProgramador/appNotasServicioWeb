package com.vesta.appnotas.controller;

import com.vesta.appnotas.dto.TareaConsultaDTO;
import com.vesta.appnotas.service.impl.TareaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/tarea")
public class TareaController {

    @Autowired
    private TareaServiceImpl tareaServ;

    @GetMapping("/")
    public ResponseEntity<List<TareaConsultaDTO>> listarTareas() {
        List<TareaConsultaDTO> lista = tareaServ.listarTareas();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<List<TareaConsultaDTO>> listarTareasUsuario(@PathVariable("id") Integer idUsuario) {
        List<TareaConsultaDTO> lista = tareaServ.listarTareasUsuario(idUsuario);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<TareaConsultaDTO>> buscarTareas(@PathVariable("id") Integer idTarea) {
        List<TareaConsultaDTO> lista = tareaServ.buscarTarea(idTarea);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

}
