package com.portfolio.api.services;

import com.portfolio.api.model.Educacion;

import java.util.List;

public interface IEducacionService{
    List<Educacion> getEducacion();
    void setEducacion(Educacion edu);
    void deleteEducacion(long id);
    void editarEducacion(Educacion edu);
}
