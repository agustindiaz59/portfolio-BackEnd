package com.portfolio.api.services;

import com.portfolio.api.model.Experiencia;

import java.util.List;

public interface IExperienciaService {
    List<Experiencia> crearExperiencia(Experiencia exp);
    List<Experiencia> traerExperiencia();
    List<Experiencia> eliminarExperiencia(long id);
    void editarExperiencia(Experiencia exp);
}
