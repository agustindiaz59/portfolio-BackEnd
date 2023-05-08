package com.portfolio.api.services;

import com.portfolio.api.model.Experiencia;
import com.portfolio.api.repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired
    ExperienciaRepository repo;
    @Override
    public List<Experiencia> crearExperiencia(Experiencia exp) {
        repo.save(exp);
        return repo.findAll();
    }

    @Override
    public List<Experiencia> traerExperiencia() {
        return repo.findAll();
    }

    @Override
    public List<Experiencia> eliminarExperiencia(long id) {
        repo.deleteById(id);
        return repo.findAll();
    }

    @Override
    public void editarExperiencia(Experiencia exp) {
        repo.deleteById(exp.getId());
        repo.save(exp);
    }
}
