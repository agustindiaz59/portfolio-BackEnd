package com.portfolio.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @Column
    String nombre;
    @Column
    String apellido;
    @Column
    String fecha_de_nacimiento;
    @Column
    String nacionalidad;
    @Column
    String email;
    @Column
    String numero;
    @Column
    String sobre_mi;
    @Column
    String info;
    @Column
    String ocupacion;
    @Column
    String banner;
    @Column
    String image_perfil;
    @Column
    String Ubicacion;
}
