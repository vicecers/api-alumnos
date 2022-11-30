package com.cerso.apialumnos.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cerso.apialumnos.model.entity.Alumno;

@Repository
public interface IAlumnoDAO extends JpaRepository<Alumno, Long>{

}
