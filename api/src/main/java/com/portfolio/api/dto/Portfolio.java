package com.portfolio.api.dto;

import com.portfolio.api.model.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter@Setter
public class Portfolio{
    Persona persona;
    List<Educacion> educacion;
    List<Experiencia> trabajos;
    List<Proyecto> proyectos;
    List<Habilidades> skills;

    public Portfolio() {
    }
}
