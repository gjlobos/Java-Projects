package com.dh.gjlobos.app.controller;

import com.dh.gjlobos.app.entity.Odontologo;
import com.dh.gjlobos.app.service.impl.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/odontologos")
@CrossOrigin(origins = "http://localhost:3000")
public class OdontologoController {


    @Autowired
    private OdontologoService service;


    // GUARDAR
    @PostMapping
    public void postOdontologo(@RequestBody Odontologo odontologo) {
        service.save(odontologo);
    }

    // GET ALL
    @GetMapping
    public List<Odontologo> getAll() {
        return service.findAll();
    }


    // GET POR ID
    @GetMapping(path = "/{id}")
    public ResponseEntity<Odontologo> getById(@PathVariable Integer id) {
        Odontologo odontologoResponse = service.findById(id);
        return ResponseEntity.ok(odontologoResponse);
    }


    // DELETE POR ID
    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }


    // PUT → modificar odontólogo
    @PutMapping(path = "{id}")
    public void putById(@PathVariable Integer id, @RequestBody Odontologo odontologo) {

        odontologo.setId(id);
        service.update(odontologo);
    }
}
