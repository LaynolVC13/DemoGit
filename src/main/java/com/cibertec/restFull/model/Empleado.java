package com.cibertec.restFull.model;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;


@Data
@Entity
@Table(name = "empleados" )
public class Empleado {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(value=TemporalType.DATE)
	@Column(name = "fecha_ingreso")
	private Date fechaIngreso;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "salario")
	private float salario;
	
}