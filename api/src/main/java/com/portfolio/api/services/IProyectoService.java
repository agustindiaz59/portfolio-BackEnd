package com.portfolio.api.services;

import com.portfolio.api.model.Proyecto;

import java.util.List;

public interface IProyectoService {
    void crearProyecto(Proyecto proy);
    List<Proyecto> traerProyectos();
    void editarProyecto(long id, Proyecto proy);
    void eliminarProyecto(long id);
}
