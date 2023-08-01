package com.ej.cursos.demo.controllers;

import com.ej.cursos.demo.models.Autos;
import com.ej.cursos.demo.services.AutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autos/")
public class AutoController {
    private AutosService autosService;
    @Autowired
    public AutoController(AutosService autosService) {
        this.autosService = autosService;
    }
    @PostMapping(value = "crear",headers = "Accept=application/json")
    public void crearAuto(@RequestBody Autos auto){
        autosService.crearAuto(auto);
    }
    @GetMapping(value = "listar",headers = "Accept=application/json")
    public List<Autos> listarAutos(){
        return autosService.listarAutos();
    }
    @GetMapping(value = "listarId/{id}",headers = "Accept=application/json")
    public Optional<Autos> buscarPorId(@PathVariable Long id){
        return autosService.buscarPorId(id);
    }
    @PutMapping(value = "actualizar",headers = "Accept=application/json")
    public void actualizarAuto(@RequestBody Autos autos){
        autosService.actualizarAuto(autos);
    }
    @DeleteMapping(value = "eliminar/{id}",headers = "Accept=application/json")
    public void eliminarAuto(@PathVariable Long id){
        autosService.eliminarAuto(id);
    }
    @GetMapping(value = "listarMarca/{marca}",headers = "Accept=application/json")
    public List<Autos> listarPorMarca(@PathVariable String marca){
        return autosService.buscarPorMarca(marca);
    }
    @GetMapping(value = "listarModelo/{modelo}",headers = "Accept=application/json")
    public List<Autos> listarPorModelo(@PathVariable String modelo){
        return autosService.buscarPorModelo(modelo);
    }

}
