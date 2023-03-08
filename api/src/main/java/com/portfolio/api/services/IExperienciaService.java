package com.portfolio.api.services;

import com.portfolio.api.model.Experiencia;

import java.util.List;

public interface IExperienciaService {
    public List<Experiencia> crearExperiencia(Experiencia exp);
    public List<Experiencia> traerExperiencia();
    public List<Experiencia> eliminarExperiencia(long id);
}
