package com.portfolio.api.controller;

import com.portfolio.api.model.Educacion;
import com.portfolio.api.model.Persona;
import com.portfolio.api.services.IEducacionService;
import com.portfolio.api.services.IHabilidadesService;
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
    @Autowired
    private IHabilidadesService habService;

}
