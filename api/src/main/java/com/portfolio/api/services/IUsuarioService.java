package com.portfolio.api.services;

import com.portfolio.api.model.Usuario;

public interface IUsuarioService {
    public void darDeAlta(Usuario user);
    public boolean iniciarSesion(Usuario user);
}
