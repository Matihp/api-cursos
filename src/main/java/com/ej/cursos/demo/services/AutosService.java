package com.ej.cursos.demo.services;

import com.ej.cursos.demo.models.Autos;
import com.ej.cursos.demo.repositories.IAutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutosService {
    private IAutosRepository autoRepo;
    @Autowired

    public AutosService(IAutosRepository autoRepo) {
        this.autoRepo = autoRepo;
    }
    public void crearAuto(Autos autos){
        autoRepo.save(autos);
    }
    public List<Autos> listarAutos(){
        return autoRepo.findAll();
    }

    public List<Autos> buscarPorMarca(String marca){
        return autoRepo.findByMarca(marca);
    }

    public List<Autos> buscarPorModelo(String modelo){
        return autoRepo.findByModelo(modelo);
    }
    public List<Autos> buscarPorColor(String color){
        return autoRepo.findByColor(color);
    }
    public List<Autos> buscarPorAnio(Long anio){
        return autoRepo.findByAnio(anio);
    }
    public Optional<Autos> buscarPorId(Long id){
        return autoRepo.findById(id);
    }
    public void actualizarAuto(Autos auto){
        autoRepo.save(auto);
    }
    public void eliminarAuto(Long id){
        autoRepo.deleteById(id);
    }

}
