package com.dh.gjlobos.app.service;


import com.dh.gjlobos.app.entity.Odontologo;

import java.util.List;
import java.util.Optional;

public interface IOdontologoService {


    Odontologo save(Odontologo odontologo);


    List<Odontologo> findAll();


    Optional<Odontologo> findById(Integer id);


    void deleteById(Integer id);


    void update(Odontologo odontologo);

}
