package com.portfolio.api.services;

import com.portfolio.api.model.Habilidades;

import java.util.List;

public interface IHabilidadesService {
    public void agregarHabilidad(Habilidades hab);
    public List<Habilidades> traerHabilidades();
    public void eliminarHabilidad(long id);
    public void editarHabilidad(long id,Habilidades hab);
}
