package com.portfolio.api.services;

import com.portfolio.api.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.api.repository.PersonaRepository;


@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private PersonaRepository persoRepo;

    @Override
    public Persona traePersona(long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void editarAbout(Persona per) {
        Persona old = persoRepo.findById((long)1).orElse(null);
        assert old != null;
        old.setSobre_mi(per.getSobre_mi());
        persoRepo.save(old);
    }

    @Override
    public void editarPerfil(Persona per) {
        Persona old = persoRepo.findById((long)1).orElse(null);
        assert old != null;
        old.setImage_perfil(per.getImage_perfil());
        persoRepo.save(old);

    }

    @Override
    public void editarBanner(Persona per) {
        Persona old = persoRepo.findById((long)1).orElse(null);
        assert old != null;
        old.setBanner(per.getBanner());
        persoRepo.save(old);

    }

    @Override
    public void editarInfo(Persona per) {
        Persona old = persoRepo.findById((long)1).orElse(null);
        assert old != null;
        old.setInfo(per.getInfo());
        persoRepo.save(old);

    }

}
