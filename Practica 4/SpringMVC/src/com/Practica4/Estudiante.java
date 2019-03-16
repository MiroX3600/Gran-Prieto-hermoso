package com.Practica4;

public class Estudiante {

	private String nombre;
	private String apellido;
	private Integer edad;
	private Integer matricula;
	private String facultad;
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido (String apellido) {
		this.apellido = apellido;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setEdad (Integer edad) {
		this.edad = edad;
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	public void setMatricula (Integer matricula) {
		this.matricula = matricula;
	}
	
	public Integer getMatricula() {
		return matricula;
	}
	
	public void setFacultad (String facultad) {
		this.facultad = facultad;
	}
	
	public String getFacultad () {
		return facultad;
	}
}