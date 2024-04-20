package com.umg.apirest.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String nombre;
	private String telefono;
	private Date fechacumple;
	private String departamento;
	
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Date getFechacumple() {
		return fechacumple;
	}
	public void setFechacumple(Date fechacumple) {
		this.fechacumple = fechacumple;
	}
	public String getDepartamentto() {
		return departamento;
	}
	public void setDepartamentto(String departamentto) {
		this.departamento = departamentto;
	}
	
}
