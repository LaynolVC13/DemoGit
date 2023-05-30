package com.cibertec.restFull.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.restFull.model.Empleado;
import com.cibertec.restFull.repository.IEmpleadoRepository;
import com.cibertec.restFull.service.IEmpleadoService;

@Service
public class EmpleadoImplement implements IEmpleadoService{

	@Autowired
	private IEmpleadoRepository repository ;
	
	@Override
	public Empleado Save(Empleado empleado) {
		// TODO Auto-generated method stub
		return repository.save(empleado);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		 repository.deleteById(id);;
	}
	

	@Override
	public List<Empleado> ListAll() {
		// TODO Auto-generated method stub
		return (List<Empleado>)repository.findAll();
	}

	@Override
	public Optional<Empleado> ListID(Long id) {
		
		return repository.findById(id);
		
		
	}

	@Override
	public Empleado Update(Empleado empleado, Long id) {
		Empleado em = repository.findById(id).get();
		
		em.setNombre(empleado.getNombre());
		em.setFechaIngreso(empleado.getFechaIngreso());
		em.setSalario(empleado.getSalario());
		
		return repository.save(em);
	}

}
