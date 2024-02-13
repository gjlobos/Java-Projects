package com.dh.gjlobos.app.service;

import com.dh.gjlobos.app.dto.TurnoDTO;

import java.util.List;

public interface ITurnoService {

    void save(TurnoDTO turnoDTO);


    List<TurnoDTO> findAll();


    TurnoDTO findById(Integer id);


    void deleteById(Integer id);


    void update(TurnoDTO turnoDto);

}
