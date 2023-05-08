package com.portfolio.api.services;

import com.portfolio.api.model.Habilidades;
import com.portfolio.api.repository.HabilidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabilidadesService implements IHabilidadesService {
    @Autowired
    private HabilidadesRepository repo;

    @Override
    public void agregarHabilidad(Habilidades hab) {
        repo.save(hab);
    }

    @Override
    public void eliminarHabilidad(long id) {
        repo.deleteById(id);
    }

    @Override
    public void editarHabilidad(Habilidades hab) {
        repo.deleteById(hab.getId());
        repo.save(hab);
    }

    @Override
    public List<Habilidades> traerHabilidades() {
        return repo.findAll();
    }

}
