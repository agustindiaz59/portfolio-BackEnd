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
    public List<Habilidades> traerHabilidades() {
        return repo.findAll();
    }

    @Override
    public void editarHabilidad(long id, Habilidades hab) {
        Habilidades edit = repo.findById(id).orElse(null);
        assert edit != null;
        edit.setNombre_hab(hab.getNombre_hab());
        edit.setPorcentaje(hab.getPorcentaje());
        repo.save(edit);
    }
}
