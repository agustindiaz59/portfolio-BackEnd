package com.portfolio.api.services;

import com.portfolio.api.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.api.repository.PersonaRepository;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private PersonaRepository persoRepo;
    @Override
    public Persona crearPersona(Persona per) {
        persoRepo.save(per);
        return per;
    }

    @Override
    public List<Persona> traerPersonas() {
        List<Persona> listPerso = persoRepo.findAll();
        return listPerso;
    }

    @Override
    public Persona encontrarPersona(long id) {
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }

    @Override
    public List<Persona> eliminarPersona(long id) {
        persoRepo.deleteById(id);
        List<Persona> listPerso = persoRepo.findAll();
        return listPerso;
    }
}
