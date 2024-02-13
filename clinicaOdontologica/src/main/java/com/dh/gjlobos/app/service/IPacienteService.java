package com.dh.gjlobos.app.service;

import com.dh.gjlobos.app.entity.Paciente;

import java.util.List;

public interface IPacienteService {


    Paciente save(Paciente paciente);


    List<Paciente> findAll();


    Paciente findById(Integer id);


    void deleteById(Integer id);


    void update(Paciente paciente);

}
