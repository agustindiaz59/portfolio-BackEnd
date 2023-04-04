package com.portfolio.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
@Table
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    @Column
    String nombre_hab;
    @Column
    Long porcentaje;

}
