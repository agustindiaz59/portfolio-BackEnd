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
        List<Experiencia> list = repo.findAll();
        return list;
    }

    @Override
    public List<Experiencia> traerExperiencia() {
        List<Experiencia> list = repo.findAll();
        return list;
    }

    @Override
    public List<Experiencia> eliminarExperiencia(long id) {
        repo.deleteById(id);
        List<Experiencia> list = repo.findAll();
        return list;
    }
}
