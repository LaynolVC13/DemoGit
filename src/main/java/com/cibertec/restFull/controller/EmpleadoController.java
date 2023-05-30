package com.cibertec.restFull.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.restFull.model.Empleado;
import com.cibertec.restFull.service.IEmpleadoService;

@RestController
public class EmpleadoController {

	@Autowired
	IEmpleadoService eService;
	
	@GetMapping("/")
	public String home() {
		
		return "/";
	}
	
	@PostMapping("/save")
	public Empleado Save(@Validated @RequestBody Empleado empleado) {
		
		return eService.Save(empleado);
		
	}
	
	@GetMapping("/empleado")
	public List<Empleado> listAllEmpleados(){
		return eService.ListAll();
	}
	
	@PutMapping("/empleado/{id}")
	public Empleado updateEmpleado (@Validated @RequestBody Empleado empleado , @PathVariable("id")  Long id) {
		return eService.Update(empleado, id);
	}
	
	@DeleteMapping("/empleado/{id}")
	public String Delete(@PathVariable("id") Long id) {
		eService.Delete(id);
		return "Delete Success";
	}
	
}
