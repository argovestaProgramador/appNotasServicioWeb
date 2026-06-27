package com.vesta.appnotas.controller;

import com.vesta.appnotas.dto.CategoriaNotaActualizarDTO;
import com.vesta.appnotas.dto.CategoriaNotaConsultaDTO;
import com.vesta.appnotas.dto.CategoriaNotaCrearDTO;
import com.vesta.appnotas.service.impl.CategoriaNotaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorianota")
public class CategoriaNotaController {

    @Autowired
    private CategoriaNotaServiceImpl categoriaNotaSer;

    @GetMapping("/")
    public ResponseEntity<List<CategoriaNotaConsultaDTO>> listarCategoriasNota() {
        List<CategoriaNotaConsultaDTO> lista =  categoriaNotaSer.listarCategoriasNota();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String> crearCategoriaNota(@RequestBody CategoriaNotaCrearDTO categoriaNotaCrearDTO) {
        categoriaNotaSer.crearCategoriaNota(categoriaNotaCrearDTO);
        return new ResponseEntity<>("Categoria Nota creada con exito", HttpStatus.OK);
    }

    @PutMapping("/")
    public ResponseEntity<String> actualizarCategoriaNota(@RequestBody CategoriaNotaActualizarDTO categoriaNotaActualizarDTO) {
        categoriaNotaSer.actualizarCategoraNota(categoriaNotaActualizarDTO);
        return new ResponseEntity<>("Categoria Nota actualiza con exito", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarCategoriaNota(@PathVariable("id") Integer idCategoriaNota) {
        categoriaNotaSer.eliminarCategoriaNota(idCategoriaNota);
        return new ResponseEntity<>("Categoria Nota eliminada", HttpStatus.OK);
    }

}
