package com.portfolio.api.services;

import com.portfolio.api.model.Habilidades;

import java.util.List;

public interface IHabilidadesService {
    void agregarHabilidad(Habilidades hab);
    List<Habilidades> traerHabilidades();
    void eliminarHabilidad(long id);
    void editarHabilidad(long id,Habilidades hab);
}
