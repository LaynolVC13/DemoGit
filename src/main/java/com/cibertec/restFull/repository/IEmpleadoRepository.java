package com.cibertec.restFull.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.restFull.model.Empleado;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Long>  {

	Empleado findByid(long id);
	
}
