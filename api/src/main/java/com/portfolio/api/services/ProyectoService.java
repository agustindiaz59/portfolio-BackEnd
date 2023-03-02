package com.portfolio.api.services;

import com.portfolio.api.model.Proyecto;
import com.portfolio.api.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    private ProyectoRepository repo;

    @Override
    public void crearProyecto(Proyecto proy) {
        repo.save(proy);
    }

    @Override
    public List<Proyecto> traerProyectos() {
        List<Proyecto> list = repo.findAll();
        return list;
    }

    @Override
    public void editarProyecto(long id, Proyecto proy) {

    }

    @Override
    public void eliminarProyecto(long id) {
        repo.deleteById(id);
    }
}
