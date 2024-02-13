package com.dh.gjlobos.app.service.impl;

import com.dh.gjlobos.app.dto.TurnoDTO;
import com.dh.gjlobos.app.entity.Turno;
import com.dh.gjlobos.app.repository.ITurnoRepository;
import com.dh.gjlobos.app.service.ITurnoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TurnoService implements ITurnoService {


    @Autowired
    ITurnoRepository turnoRepository;
    @Autowired
    ObjectMapper mapper;


    public void save(TurnoDTO turnoDto) {
        Turno turnoAGuardar = mapper.convertValue(turnoDto, Turno.class);
        turnoRepository.save(turnoAGuardar);
    }

    public List<TurnoDTO> findAll() {
        List<TurnoDTO> listaTurnosDto = new ArrayList<>();
        List<Turno> listaTurnos = turnoRepository.findAll(); // findAll del JPA
        for (Turno turno : listaTurnos) {
            listaTurnosDto.add(mapper.convertValue(turno, TurnoDTO.class));
        }
        return listaTurnosDto;
    }

    public TurnoDTO findById(Integer id) {
        TurnoDTO encontrado = mapper.convertValue(turnoRepository.findById(id), TurnoDTO.class);
        return encontrado;
    }

    public void deleteById(Integer id) {
        turnoRepository.deleteById(id);
    }

    public void update(TurnoDTO turnoDto) {
        Turno turnoModificar = mapper.convertValue(turnoDto, Turno.class);
        turnoRepository.save(turnoModificar);
    }



}
