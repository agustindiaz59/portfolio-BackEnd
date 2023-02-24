package com.portfolio.api.controller;

import com.portfolio.api.model.Educacion;
import com.portfolio.api.model.Persona;
import com.portfolio.api.services.IEducacionService;
import com.portfolio.api.services.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    private IEducacionService eduService;
    @Autowired
    private IPersonaService persoService;
    @GetMapping("/educacion/traer")
    public List<Educacion> traerEducacion(){
        List<Educacion> edu=eduService.getEducacion();
        return edu;
    }
    @GetMapping("/personas/traer")
    public List<Persona> traerPersonas(){
        List<Persona> listaPerso = persoService.traerPersonas();
        return listaPerso;
    }
    @GetMapping("/educacion/{id}")
    public Educacion findEducacion(@PathVariable long id){
        Educacion edu = eduService.findEducacion(id);
        return edu;
    }
    @PostMapping("/personas/crear")
    public Persona crearPersona(@RequestBody Persona perso){
        persoService.crearPersona(perso);
        return perso;
    }
    @PostMapping("/educacion/crear")
    public Educacion crearEducacion(@RequestBody Educacion edu){
        eduService.setEducacion(edu);
        return edu;
    }
    @DeleteMapping("/personas/eliminar/{id}")
    public List<Persona> eliminarPersona(@PathVariable long id){
        persoService.eliminarPersona(id);
        List<Persona> listPerso = persoService.traerPersonas();
        return listPerso;
    }
    @DeleteMapping("/educacion/eliminar/{id}")
    public List<Educacion> eliminarEducacion(@PathVariable long id){
        eduService.deleteEducacion(id);
        List<Educacion> listEdu = eduService.getEducacion();
        return listEdu;
    }
    @GetMapping("/persona/{id}")
    public Persona encontrarPersona(@PathVariable long id){
        Persona per = persoService.encontrarPersona(id);
        return per;
    }
}
