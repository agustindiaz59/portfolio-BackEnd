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

@CrossOrigin(origins = {"http://localhost:4200","https://portfolio-frontend-275b9.web.app","https://portfolio-frontend-275b9.firebaseapp.com"})
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

    @GetMapping("/datos")
    @ResponseBody
    public String traerDatos() throws JsonProcessingException{

        return this.port();
    }
    @PostMapping("/educacion/agregar")
    public String agregarEducacion(@RequestBody Educacion edu)throws JsonProcessingException{
        eduService.setEducacion(edu);

        return this.port();
    }
    @DeleteMapping("/educacion/borrar")
    public String borrarEducacion(@RequestBody long id)throws JsonProcessingException{
        eduService.deleteEducacion(id);
        return this.port();
    }
    @PostMapping("/trabajo/agregar")
    public String agregarTrabajo(@RequestBody Experiencia exp)throws JsonProcessingException{
        expService.crearExperiencia(exp);

        return this.port();
    }
    @DeleteMapping("/trabajo/borrar")
    public String borrarTrabajo(@RequestBody long id)throws JsonProcessingException{
        expService.eliminarExperiencia(id);
        return this.port();
    }
    @PostMapping("/skills/agregar")
    public String agregarSkill(@RequestBody Habilidades hab)throws JsonProcessingException{
        habService.agregarHabilidad(hab);

        return this.port();
    }
    @DeleteMapping("/skills/borrar")
    public String borrarSkill(@RequestBody long indice)throws JsonProcessingException{
        habService.eliminarHabilidad(indice);
        return this.port();
    }
    @PostMapping("/proyecto/agregar")
    public String agregarProyecto(@RequestBody Proyecto proy)throws JsonProcessingException{
        proyService.crearProyecto(proy);

        return this.port();
    }
    @DeleteMapping("/proyecto/borrar")
    public String borrarProyecto(@RequestBody long id)throws JsonProcessingException{
        proyService.eliminarProyecto(id);
        return this.port();
    }
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
    @PostMapping("/registro")
    public void registrar(@RequestBody Usuario user)throws JsonProcessingException{
        userService.darDeAlta(user);
    }

}
