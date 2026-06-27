package com.vesta.appnotas.controller;

import com.vesta.appnotas.dto.CategoriaTareaActualizarDTO;
import com.vesta.appnotas.dto.CategoriaTareaConsultaDTO;
import com.vesta.appnotas.dto.CategoriaTareaCrearDTO;
import com.vesta.appnotas.service.impl.CategoriaTareaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoriatarea")
public class CategoriaTareaController {

    @Autowired
    private CategoriaTareaServiceImpl categoriaTareaServ;

    @GetMapping("/")
    public ResponseEntity<List<CategoriaTareaConsultaDTO>> listarCategoriasTarea() {
        List<CategoriaTareaConsultaDTO> lista = categoriaTareaServ.listarCategoriasTarea();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String> crearCategoriaTarea(@RequestBody CategoriaTareaCrearDTO categoriaTareaCrearDTO) {
        categoriaTareaServ.crearCategoriaTarea(categoriaTareaCrearDTO);
        return new ResponseEntity<>("Categoria Tarea Creada",HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<String> actualizarCategoriaTarea(@RequestBody CategoriaTareaActualizarDTO categoriaTareaActualizarDTO) {
        categoriaTareaServ.actualizarCategoriaTarea(categoriaTareaActualizarDTO);
        return new ResponseEntity<>("Categoria Tarea Actualizada",HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarCategoriaTarea(@PathVariable("id") Integer idCategoriaTarea) {
        categoriaTareaServ.eliminarCategoriaTarea(idCategoriaTarea);
        return new ResponseEntity<>("Categoria Tarea Eliminada",HttpStatus.OK);
    }

}
