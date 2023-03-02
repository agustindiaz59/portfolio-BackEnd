package com.portfolio.api.services;

import com.portfolio.api.model.Proyecto;

import java.util.List;

public interface IProyectoService {
    public void crearProyecto(Proyecto proy);
    public List<Proyecto> traerProyectos();
    public void editarProyecto(long id, Proyecto proy);
    public void eliminarProyecto(long id);
}
