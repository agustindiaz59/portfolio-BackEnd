package com.portfolio.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter@Setter
@Entity
@Table
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @NonNull
    long id;
    @Column
    String nombre;
    @Column
    String link;
    @Column
    String descripcion;
}
