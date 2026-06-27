package com.vesta.appnotas.controller;

import com.vesta.appnotas.dto.TareaActualizarDTO;
import com.vesta.appnotas.dto.TareaConsultaDTO;
import com.vesta.appnotas.dto.TareaCrearDTO;
import com.vesta.appnotas.service.impl.TareaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/")
    public ResponseEntity<String> crearTarea(@RequestBody TareaCrearDTO tareaCrearDTO) {
        tareaServ.insertarTarea(tareaCrearDTO);
        return new ResponseEntity<>("tarea creada con exito", HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<String> actualizarTarea(@RequestBody TareaActualizarDTO  tareaActualizarDTO) {
        tareaServ.actualizarTarea(tareaActualizarDTO);
        return new ResponseEntity<>("tarea actualiza con exito", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarTarea(@PathVariable("id") Integer idTarea) {
        tareaServ.eliminarTarea(idTarea);
        return new ResponseEntity<>("tarea eliminada con exito", HttpStatus.OK);
    }

}
