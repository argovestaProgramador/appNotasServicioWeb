package com.vesta.appnotas.controller;

import com.vesta.appnotas.dto.*;
import com.vesta.appnotas.entity.Usuario;
import com.vesta.appnotas.service.impl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuService;

    @GetMapping("/")
    public ResponseEntity<List<UsuarioConsultaDTO>> listarUsuarios() {
        List<UsuarioConsultaDTO> lista = usuService.listarUsuarios();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<UsuarioConsultaDTO>> listarUsuarioId(@PathVariable("id") Integer idUsuario) {
        List<UsuarioConsultaDTO> lista = usuService.listarUsuarioId(idUsuario);
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping("/comun/")
    public ResponseEntity<String> crearUsuarioComun(@RequestBody UsuarioCrearComunDTO usuarioCrearComun) {
        usuService.crearUsuarioComun(usuarioCrearComun);
        return new ResponseEntity<>("Usuario comun creado con exito", HttpStatus.OK);
    }

    @PostMapping("/administrador/")
    public ResponseEntity<String> crearUsaurioAdmin(@RequestBody UsuarioCrearAdminDTO usuarioCrearAdmin) {
        usuService.crearUsuarioAdmin(usuarioCrearAdmin);
        return new ResponseEntity<>("Usuario admin creado con exito", HttpStatus.OK);
    }

    @PutMapping("/comun/")
    public ResponseEntity<String> actualizarUsuarioComun(@RequestBody UsuarioActualizarComunDTO  usuarioActualizarComun) {
        usuService.actualizarUsuarioComun(usuarioActualizarComun);
        return new ResponseEntity<>("Usuario comun actualizado con exito", HttpStatus.OK);
    }

    @PutMapping("/administrador/")
    public ResponseEntity<String> actualizarUsuarioAdmin(@RequestBody UsuarioActualizarAdminDTO  usuarioActualizarAdmin) {
        usuService.actualizarUsuarioAdmin(usuarioActualizarAdmin);
        return new ResponseEntity<>("Usuario admin actualizado con exito", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarUsuario(@PathVariable("id") Integer idUsuario) {
        usuService.eliminarUsuario(idUsuario);
        return new ResponseEntity<>("Usuario eliminado con exito", HttpStatus.OK);
    }

}
