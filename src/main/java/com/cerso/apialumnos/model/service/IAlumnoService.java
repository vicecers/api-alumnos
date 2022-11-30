package com.cerso.apialumnos.model.service;

import java.util.List;

import com.cerso.apialumnos.model.entity.Alumno;

public interface IAlumnoService {
	
	List<Alumno> getAlumnos();
	Alumno findAlumnoById(Long ig);
	Alumno saveAlumno(Alumno alumno);
	void delete(Long id);
}
