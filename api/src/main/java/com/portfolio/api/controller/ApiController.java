package com.portfolio.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.portfolio.api.dto.Portfolio;
import com.portfolio.api.model.*;
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
        return mapper.writeValueAsString(datos);
    }
    @CrossOrigin
    @PatchMapping("/persona/about")
    public String editarAbout(@RequestBody Persona per) throws JsonProcessingException {
        persoService.editarAbout(per);

        return port();
    }
    @CrossOrigin
    @PatchMapping("/persona/perfil")
    public String editarPerfil(@RequestBody Persona per) throws JsonProcessingException {
        persoService.editarPerfil(per);

        return port();
    }
    @CrossOrigin
    @PatchMapping("/persona/banner")
    public String editarBanner(@RequestBody Persona per) throws JsonProcessingException {
        persoService.editarBanner(per);
        return port();
    }
    @CrossOrigin
    @PatchMapping("/persona/info")
    public String editarInfo(@RequestBody Persona per) throws JsonProcessingException {
        persoService.editarInfo(per);
        return port();
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
        ObjectMapper jsn = new ObjectMapper();
        String json = jsn.writeValueAsString(new Respuesta());
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