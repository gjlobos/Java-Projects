package com.dh.gjlobos.app.repository;

import com.dh.gjlobos.app.entity.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo, Integer> {

}
