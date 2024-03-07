package com.joborder.apijoborder.clients.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Employ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 150)
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @Column
    private BigDecimal valor;
}
