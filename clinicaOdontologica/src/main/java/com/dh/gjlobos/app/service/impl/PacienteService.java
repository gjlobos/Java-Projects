package com.dh.gjlobos.app.service.impl;

import com.dh.gjlobos.app.entity.Paciente;
import com.dh.gjlobos.app.repository.IPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {


    @Autowired
    IPacienteRepository pacienteRepository;


    public Paciente save(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    public Paciente findById(Integer id) {
        Paciente pacienteEncontrado = pacienteRepository.findById(id).orElse(null);
        return pacienteEncontrado;
    }

    public void deleteById(Integer id) {
        pacienteRepository.deleteById(id);
    }

    public void update(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

}
