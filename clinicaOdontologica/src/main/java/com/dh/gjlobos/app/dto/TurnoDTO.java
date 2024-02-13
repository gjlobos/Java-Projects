package com.dh.gjlobos.app.dto;

import com.dh.gjlobos.app.entity.Odontologo;
import com.dh.gjlobos.app.entity.Paciente;
import java.time.LocalDateTime;

public class TurnoDTO {

    private Integer id;
    private LocalDateTime fechaHora;
    private Paciente paciente;
    private Odontologo odontologo;

    public Integer getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
