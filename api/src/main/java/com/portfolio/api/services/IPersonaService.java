package com.portfolio.api.services;

import com.portfolio.api.model.Persona;

public interface IPersonaService {
    Persona traePersona(long id);
    void editarAbout(Persona per);
    void editarPerfil(Persona per);
    void editarBanner(Persona per);
    void editarInfo(Persona per);
}
