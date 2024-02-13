package com.dh.gjlobos.app.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointment")
public class Turno {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date")
    private LocalDateTime fechaHora;


    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false, referencedColumnName = "id")
    private Paciente paciente;


    @ManyToOne // Por defecto es eager
    @JoinColumn(name = "dentist_id", referencedColumnName = "id")
    private Odontologo odontologo;


    public Integer getId() {
        return id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }


    public void setId(Integer id) {
        this.id = id;
    }

}

