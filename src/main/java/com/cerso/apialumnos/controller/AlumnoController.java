package com.cerso.apialumnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cerso.apialumnos.model.entity.Alumno;
import com.cerso.apialumnos.model.service.IAlumnoService;

@RestController
@RequestMapping("/api")
public class AlumnoController {
	
	@Autowired
	IAlumnoService alumnoService;
	
	@GetMapping("/alumnos")
	public List<Alumno> index(){
		return alumnoService.getAlumnos();
	}
	
	@GetMapping("/alumno/{id}")
	public Alumno show(@PathVariable Long id) {
		return alumnoService.findAlumnoById(id);
	}
	@PostMapping("/save")
	public Alumno create(@RequestBody Alumno alumno) {
		return alumnoService.saveAlumno(alumno);
	}
	
	@PutMapping("/update/{id}")
	public Alumno update(@RequestBody Alumno alumno, @PathVariable Long id) {
		Alumno alumnoActual = alumnoService.findAlumnoById(id);
		alumnoActual.setNombre(alumno.getNombre());
		alumnoActual.setNombre(alumno.getApellido());
		alumnoActual.setNombre(alumno.getCurso());
		alumnoActual.setNombre(alumno.getNombre());
		return alumnoService.saveAlumno(alumnoActual);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		alumnoService.delete(id);
	}
	
}
