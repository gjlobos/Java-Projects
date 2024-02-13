package com.dh.gjlobos.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="dentist")
public class Odontologo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="identity_number")
    private Integer numeroMatricula;
    @Column(name="lastname")
    private String apellido;
    @Column(name="name")
    private String nombre;

    @OneToMany(mappedBy = "odontologo") // Por defecto va a ser lazy
    @JsonIgnore
    private Set<Turno> listadoTurnos = new HashSet<>();


    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }
}
