package com.vesta.appnotas.controller;

import com.vesta.appnotas.dto.NotaActualizarDTO;
import com.vesta.appnotas.dto.NotaConsultaDTO;
import com.vesta.appnotas.dto.NotaCrearDTO;
import com.vesta.appnotas.service.impl.NotaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nota")
public class NotaController {

    @Autowired
    private NotaServiceImpl notaSer;

    @GetMapping("/")
    public ResponseEntity<List<NotaConsultaDTO>> listarNotas() {
        List<NotaConsultaDTO> lista = notaSer.listarNotas();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<List<NotaConsultaDTO>> listarNotasUsuario(@PathVariable("id") Integer idUsuario) {
        List<NotaConsultaDTO> lista = notaSer.listarNotasUsuario(idUsuario);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<NotaConsultaDTO>> listarNotasId(@PathVariable("id") Integer idNota) {
        List<NotaConsultaDTO> lista = notaSer.listarNotasPorId(idNota);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String> crearNota(@RequestBody NotaCrearDTO notaCrearDTO) {
        notaSer.crearNota(notaCrearDTO);
        return new ResponseEntity<>("Nota creada con exito", HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<String> actualizarNota(@RequestBody NotaActualizarDTO notaActualizarDTO) {
        notaSer.actualizarNota(notaActualizarDTO);
        return new ResponseEntity<>("Nota actualiza con exito", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarNota(@PathVariable("id") Integer idNota) {
        notaSer.eliminarNota(idNota);
        return new ResponseEntity<>("Nota eliminada con exito", HttpStatus.OK);
    }

}
