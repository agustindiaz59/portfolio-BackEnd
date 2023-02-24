package com.portfolio.api.services;

import com.portfolio.api.model.Educacion;

import java.util.List;

public interface IEducacionService{
    public List<Educacion> getEducacion();
    public void setEducacion(Educacion edu);
    public void deleteEducacion(long id);
    public Educacion findEducacion( long id);
}
