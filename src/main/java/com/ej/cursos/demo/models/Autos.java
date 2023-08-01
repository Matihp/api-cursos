package com.ej.cursos.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="auto")
public class Autos {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="id_auto")
    private Long idAuto;
    private String marca;
    private String modelo;
    private String color;
    private Long anio;

}


