package com.dh.gjlobos.app.service.impl;

import com.dh.gjlobos.app.entity.Odontologo;
import com.dh.gjlobos.app.repository.IOdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OdontologoService {

    @Autowired
    IOdontologoRepository odontologoRepository;


    public Odontologo save(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);
    }

    public List<Odontologo> findAll() {
        return odontologoRepository.findAll();
    }

    public Odontologo findById(Integer id) {
        Odontologo odontologoEncontrado = odontologoRepository.findById(id).orElse(null);
        return odontologoEncontrado;
    }

    public void deleteById(Integer id) {
        odontologoRepository.deleteById(id);
    }

    public void update(Odontologo odontologo) {
        odontologoRepository.saveAndFlush(odontologo);
    }
    /* ----------------------------------------------------------------------------- */
    
}
