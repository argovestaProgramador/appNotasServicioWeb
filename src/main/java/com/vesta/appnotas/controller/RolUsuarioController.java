package com.vesta.appnotas.controller;

import com.vesta.appnotas.dto.RolUsuarioActualizarDTO;
import com.vesta.appnotas.dto.RolUsuarioConsultaDTO;
import com.vesta.appnotas.dto.RolUsuarioCrearDTO;
import com.vesta.appnotas.service.impl.RolUsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rolusuario")
public class RolUsuarioController {

    @Autowired
    private RolUsuarioServiceImpl rolUsuarioSer;

    @GetMapping("/")
    public ResponseEntity<List<RolUsuarioConsultaDTO>> listarRolesUsuario() {
        List<RolUsuarioConsultaDTO> lista = rolUsuarioSer.listarRolesUsuario();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String> crearRolUsuario(@RequestBody RolUsuarioCrearDTO rolUsuDTO) {
        rolUsuarioSer.insertarRolUsuario(rolUsuDTO);
        return new ResponseEntity<>("Rol Usuario creadado com exito", HttpStatus.OK);
    }

    @PutMapping("/")
    public ResponseEntity<String> actualizarRolUsuario(@RequestBody RolUsuarioActualizarDTO rolUsuDTO) {
        rolUsuarioSer.actualizarRolUsuario(rolUsuDTO);
        return new ResponseEntity<>("Rol Usuario actualizado com exito", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarRolUsuario(@PathVariable("id") Integer idRolUsuario ) {
        rolUsuarioSer.eliminarRolUsuario(idRolUsuario);
        return new ResponseEntity<>("Rol Usuario eliminado com exito", HttpStatus.OK);
    }

}
