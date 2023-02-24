package com.portfolio.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
@Table(name = "Educacion")
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    @Column
    String escuela;
    @Column
    String titulo;
    @Column
    String imagen;
    @Column
    String carrera;
    @Column
    String inicio;
    @Column
    String fin;
}
