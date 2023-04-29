package com.portfolio.api.services;

import com.portfolio.api.model.Usuario;
import com.portfolio.api.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    private IUsuarioRepository repo;
    @Override
    public void darDeAlta(Usuario user) {
        repo.save(user);
    }

    @Override
    public boolean iniciarSesion(Usuario user) {
        List<Usuario> lista = repo.findAll();
        boolean auth = false;

        for(Usuario elemento:lista){
            if (elemento.getEmail().equals(user.getEmail()) && elemento.getContraseña().equals(user.getContraseña())) {
                auth = true;
                break;
            }
        }
        return auth;
    }

}
