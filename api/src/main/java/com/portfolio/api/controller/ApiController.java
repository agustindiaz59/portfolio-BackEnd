package com.portfolio.api.controller;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.portfolio.api.dto.Portfolio;
import com.portfolio.api.model.Educacion;
import com.portfolio.api.model.Experiencia;
import com.portfolio.api.model.Habilidades;
import com.portfolio.api.model.Proyecto;
import com.portfolio.api.repository.EducacionRepository;
import com.portfolio.api.repository.PersonaRepository;
import com.portfolio.api.services.*;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController{
    @Autowired
    private IEducacionService eduService;
    @Autowired
    private IPersonaService persoService;
    @Autowired
    private IHabilidadesService habService;
    @Autowired
    private IProyectoService proyService;
    @Autowired
    private IExperienciaService expService;
    @Autowired
    private PersonaRepository personaRepository;
    long id = 1; //Solo responde a la primera persona, ya que no me interesa tener varias personas para un portfolio personal
    @Autowired
    private EducacionRepository educacionRepository;
    private Portfolio port(){ //Al ser una accion recurrente creé un metodo
        Portfolio datos = new Portfolio();
        datos.setPersona(persoService.traePersona(id));
        datos.setEducacion(eduService.getEducacion());
        datos.setProyectos(proyService.traerProyectos());
        datos.setTrabajos(expService.traerExperiencia());
        datos.setSkills(habService.traerHabilidades());
        return datos;
    }

    @GetMapping("/datos")
    @ResponseBody
    public String traerDatos() throws JsonProcessingException{

        Portfolio datos = new Portfolio();
        Portfolio port = this.port();
        datos = port;

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(datos);
        return json;
    }
    @PostMapping("/educacion/agregar")
    public Portfolio agregarEducacion(@RequestBody Educacion edu){
        eduService.setEducacion(edu);

        Portfolio datos = new Portfolio();
        Portfolio port = this.port();
        return port;
    }
    @PostMapping("/trabajo/agregar")
    public Portfolio agregarEducacion(@RequestBody Experiencia exp){
        expService.crearExperiencia(exp);

        Portfolio datos = new Portfolio();
        Portfolio port = this.port();
        return port;
    }
    @PostMapping("/skills/agregar")
    public Portfolio agregarEducacion(@RequestBody Habilidades hab){
        habService.agregarHabilidad(hab);

        Portfolio datos = new Portfolio();
        Portfolio port = this.port();
        return port;
    }
    @PostMapping("/proyecto/agregar")
    public Portfolio agregarEducacion(@RequestBody Proyecto proy){
        proyService.crearProyecto(proy);

        Portfolio datos = new Portfolio();
        Portfolio port = this.port();
        return port;
    }

}
