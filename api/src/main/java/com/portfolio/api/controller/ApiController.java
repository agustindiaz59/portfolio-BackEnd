package com.portfolio.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.portfolio.api.dto.Portfolio;
import com.portfolio.api.model.*;
import com.portfolio.api.repository.EducacionRepository;
import com.portfolio.api.repository.PersonaRepository;
import com.portfolio.api.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.portfolio.api.model.Respuesta;

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
    @Autowired
    private EducacionRepository educacionRepository;
    @Autowired
    private IUsuarioService userService;
    long id = 1; //Solo responde a la primera persona, ya que no me interesa tener varias personas para un portfolio personal
    private String port() throws JsonProcessingException{ //Al ser una accion recurrente creé un metodo
        Portfolio datos = new Portfolio();

        datos.setPersona(persoService.traePersona(id));
        datos.setEducacion(eduService.getEducacion());
        datos.setProyectos(proyService.traerProyectos());
        datos.setTrabajos(expService.traerExperiencia());
        datos.setSkills(habService.traerHabilidades());

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(datos);
        return json;
    }

    @CrossOrigin
    @GetMapping("/datos")
    @ResponseBody
    public String traerDatos() throws JsonProcessingException{

        return this.port();
    }
    @CrossOrigin
    @PostMapping("/educacion/agregar")
    public String agregarEducacion(@RequestBody Educacion edu)throws JsonProcessingException{
        eduService.setEducacion(edu);

        return this.port();
    }
    @DeleteMapping("/educacion/borrar/{id}")
    public String borrarEducacion(@PathVariable long id)throws JsonProcessingException{
        eduService.deleteEducacion(id);
        return this.port();
    }
    @CrossOrigin
    @PostMapping("/trabajo/agregar")
    public String agregarTrabajo(@RequestBody Experiencia exp)throws JsonProcessingException{
        expService.crearExperiencia(exp);

        return this.port();
    }
    @CrossOrigin
    @DeleteMapping("/trabajo/borrar/{id}")
    public String borrarTrabajo(@PathVariable long id)throws JsonProcessingException{
        expService.eliminarExperiencia(id);
        return this.port();
    }
    @CrossOrigin
    @PostMapping("/skills/agregar")
    public String agregarSkill(@RequestBody Habilidades hab)throws JsonProcessingException{
        habService.agregarHabilidad(hab);

        return this.port();
    }
    @CrossOrigin
    @DeleteMapping("/skills/borrar/{id}")
    public String borrarSkill(@PathVariable long id)throws JsonProcessingException{
        habService.eliminarHabilidad(id);
        return this.port();
    }
    @CrossOrigin
    @PostMapping("/proyecto/agregar")
    public String agregarProyecto(@RequestBody Proyecto proy)throws JsonProcessingException{
        proyService.crearProyecto(proy);

        return this.port();
    }
    @CrossOrigin
    @DeleteMapping("/proyecto/borrar/{id}")
    public String borrarProyecto(@PathVariable long id)throws JsonProcessingException{
        proyService.eliminarProyecto(id);
        return this.port();
    }
    @CrossOrigin
    @PostMapping("/authenticate")
    public String auth(@RequestBody Usuario user) throws JsonProcessingException{
        Respuesta resp = new Respuesta();
        ObjectMapper jsn = new ObjectMapper();
        String json = jsn.writeValueAsString(resp);
        if(userService.iniciarSesion(user)){
            return json;
        }else{
            return null;
        }
    }
    @CrossOrigin
    @PostMapping("/registro")
    public void registrar(@RequestBody Usuario user){
        userService.darDeAlta(user);
    }

}
