package com.cibertec.restFull.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.restFull.model.Empleado;

public interface IEmpleadoService {

	Empleado Save(Empleado empleado);
	Empleado Update(Empleado empleado, Long id);
	public void Delete(Long id);
	List<Empleado> ListAll();
	Optional<Empleado> ListID(Long id);
	
}
