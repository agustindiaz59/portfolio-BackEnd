package com.portfolio.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.NotFound;

@Getter@Setter
@Entity
@Table
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @NonNull
    long id;
    @Column
    String empresa;
    @Column
    String puesto;
    @Column
    String lugar;
}
