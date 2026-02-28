package com.gestion.libreria.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table

@Getter
@Setter
@NoArgsConstructor
public class libro {

    @Id
    @Column(name = "id_libro", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,length = 60)
    private String name;
    @Column(nullable = false,length = 80)
    private String description;
    @Column(nullable = false, columnDefinition = "DECIMAL(10,2)")
    private double price;
    @Column
    private boolean avaliable;
}
