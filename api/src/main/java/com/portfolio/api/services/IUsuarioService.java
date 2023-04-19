package com.portfolio.api.services;

import com.portfolio.api.model.Usuario;

public interface IUsuarioService {
    void darDeAlta(Usuario user);
    boolean iniciarSesion(Usuario user);
}
