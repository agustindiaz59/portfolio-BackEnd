package com.portfolio.api.services;

import com.portfolio.api.model.Educacion;
import com.portfolio.api.repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EducacionService implements IEducacionService{
    @Autowired
    private EducacionRepository eduRepo; //puede verse como una conexion al repositorio como en el workbench

    @Override
    public List<Educacion> getEducacion() {
        return eduRepo.findAll();
    }
    @Override
    public void setEducacion(Educacion edu) {
        eduRepo.save(edu);
    }
    @Override
    public void deleteEducacion(long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public void editarEducacion(Educacion edu) {
        eduRepo.deleteById(edu.getId());
        eduRepo.save(edu);
    }
}
