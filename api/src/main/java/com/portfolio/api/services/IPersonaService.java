package com.portfolio.api.services;

import com.portfolio.api.model.Persona;

import java.util.List;

public interface IPersonaService {
    public Persona crearPersona(Persona per);
    public Persona traePersona(long id);
    public List<Persona> eliminarPersona(long id);
}
